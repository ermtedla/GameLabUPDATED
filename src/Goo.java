
public class Goo extends Item {

	public Goo() {
		super("goo");
	}
	
	public void use() {
		if (Game.getCurrentRoom().getName().equals("lobby")) {
			System.out.println("Look out for goo!");
			Room lounge = Game.getCurrentRoom().getExit('e');
			lounge.setLocked(false);
		} else {
			System.out.println("There is no goo");
		}
	}
	
}
