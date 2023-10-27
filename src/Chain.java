
public class Chain extends Item {

	public Chain() {
		super("chain");
	}
	
	public void use() {
		if (Game.getCurrentRoom().getName().equals("lobby")) {
			System.out.println("Check for any goo");
			Room lounge = Game.getCurrentRoom().getExit('e');
			lounge.setLocked(false);
		} else {
			System.out.println("No goo detected");
		}
	}
	
}
