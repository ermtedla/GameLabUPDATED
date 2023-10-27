import java.util.HashMap;

public class Room {

	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private String desc;
	private boolean locked; // Is the room locked?
	private String name;
	
	private HashMap<String, Item> roomItems;
	
	public Room(String n, String d) {
		name = n;
		desc = d;
		locked = false;
		roomItems = new HashMap<String, Item>();
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isLocked() {
		return locked;
	}
	
	public void setLocked(boolean b) {
		locked = b;
	}
	
	public Item getItem(String item) {
		return roomItems.get(item);
	}
	
	public Item removeItem(String name) {
		return roomItems.remove(name);
	}
	
	public void addItem(Item i) {
		roomItems.put(i.getName(), i);
	}
	
	public boolean hasItem(String name) {
		return roomItems.containsKey(name);
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void addExit(Room r, char direction) {
		switch(direction) {
		case 'e': east = r; break;
		case 'w': west = r; break;
		case 'n': north = r; break;
		case 's': south = r; break;
		case 'u': up = r; break;
		case 'd': down = r; break;
		}
	}
	
	public Room getExit(char direction) {
		switch(direction) {
		case 'e': return east;
		case 'w': return west;
		case 'n': return north;
		case 's': return south;
		case 'u': return up;
		case 'd': return down;
		default : return null;
		}
	}
	
	public String toString() {
		return desc;
	}
	
}

