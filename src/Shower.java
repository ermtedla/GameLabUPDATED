
public class Shower extends Item {

	public Shower() {
		super("shower");
	}
	
	public void use() {
		if (Game.getCurrentRoom().getName().equals("lobby")) {
			System.out.println("You are entering the shower, look out for goo!");
			Room lounge = Game.getCurrentRoom().getExit('e');
			lounge.setLocked(false);
		} else {
			System.out.println("There is no goo")l;
		}
	}
	
}
