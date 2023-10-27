
public class Wand extends Item {

	public Wand() {
		super("wand");
	}
	
	public void use() {
		if (Game.getCurrentRoom().getName().equals("lobby")) {
			System.out.println("You wave the wand and the lounge magically unlocks!");
			Room lounge = Game.getCurrentRoom().getExit('e');
			lounge.setLocked(false);
		} else {
			System.out.println("You wave the wand around.");
		}
	}
	
}