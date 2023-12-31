import java.util.HashMap;

public class Room {

	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private boolean locked; // Is the room locked?
	private String name;
	
	private HashMap<String, Item> roomItems;
	private HashMap<String, NPC> roomNPCS;
	
	public Room(String n, String d) {
		name = n;
		locked = false;
		roomItems = new HashMap<String, Item>();
		World.rooms.put(name, this);
		Game.roomMap.put(name, this);
	}
	
	public void addNPC (NPC npc) {
		roomNPCS.put(npc.getName(), npc);
	}
	
	public NPC getNPC(String name) {
		return roomNPCS.get(name);
	}
	
	public NPC removeNPC(String name) {
		return roomNPCS.remove(name);
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
	
	public String getDesc(String name){
		return roomItems.containsKey(name);
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
		return getdesc;
	}
}

