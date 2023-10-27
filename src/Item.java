
public class Item {

	private String name;
	private String desc;
	private boolean heavy;
	private boolean used;

	public Item(String n) {
		name = n;
		heavy = false;
		used = false;
	}

	public void setHeavy(boolean b) {
		heavy = b;
	}

	public boolean isHeavy() {
		return heavy;
	}

	public void setDesc(String d) {
		desc = d;
	}

	public boolean isUsed() {
		return used;
	}
	
	public void setUsed(boolean b) {
		used = b;
	}
	
	public void look() {
		System.out.println(desc);
	}

	public void use() {
		System.out.println("You can't use the " + name + ", yet...");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name;
	}

}