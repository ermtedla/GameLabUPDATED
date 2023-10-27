import java.util.ArrayList;
import java.util.scanner;

public class Game {

	private static Room currentRoom;
	private static ArrayList<Item> inventory = new ArrayList<Item>();

	public static Room getCurrentRoom() {
		return currentRoom;
	}

	public static void move(char direction) {
		Room nextRoom = currentRoom.getExit(direction);
		if (nextRoom != null) {
			if (nextRoom.isLocked()) {
				System.out.println("The room is locked!");
			} else {
				currentRoom = nextRoom;
				System.out.println(currentRoom);
			}
		} else {
			System.out.println("You can't go that way!");
		}
	}

	public static Item getItem(String name) {
		for (Item i : inventory)
			if (i.getName().equals(name))
				return i;
		return null;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playerCommand = "a";
		String itemName;
		Item i;
		currentRoom = World.buildWorld();
		System.out.println(currentRoom);
		while (!playerCommand.equals("x")) {
			System.out.print("What do you want to do? ");
			playerCommand = scan.nextLine();
			String[] words = playerCommand.split(" ");
			switch (words[0]) {
			case "n":
			case "s":
			case "e":
			case "w":
			case "u":
			case "d":
				move(playerCommand.charAt(0));
				break;
			case "take":
				itemName = words[1];
				if (currentRoom.hasItem(itemName)) {
					Item item = currentRoom.getItem(itemName);
					if (item.isHeavy())
						System.out.println("That's too heavy to carry around!");
					else {
						inventory.add(currentRoom.removeItem(itemName));
						System.out.println("You pick up the " + itemName + ".");
					}
				} else {
					System.out.println("There is no " + itemName + "!");
				}
				break;
			case "look":
				i = getItem(words[1]);
				if (i == null)
					i = currentRoom.getItem(words[1]);
				if (i == null)
					System.out.println("There is no " + words[1] + "!");
				else
					i.look();
				break;
			case "use":
				i = getItem(words[1]);
				if (i == null)
					System.out.println("You don't have the " + words[1] + ".");
				else
					i.use();
				break;
			case "i":
				if (inventory.isEmpty()) {
					System.out.println("You are carrying nothing!");
				} else {
					for (Item it : inventory) {
						System.out.println(it);
					}
				}
				break;
			case "x":
				System.out.println("Okay. Bye!");
				break;
			default:
				System.out.println("Invalid command.");
			}
		}
		scan.close();
	}
}
