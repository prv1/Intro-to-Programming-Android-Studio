import java.util.ArrayList;

class Inventory {
	
	public static int checkItem(int x, int y, String item,
            ArrayList<String> inventory, Room[][] room, int score) {
		
		// Check if item is a valid room item
		boolean validRoomItem = false;
		for (String roomItems : room[x][y].items ) {
			if (roomItems.equals(item)) {
				validRoomItem = true;
				break;
			}
		}
		
		// Check if item is already in inventory
		boolean inInventory = false;
		for (String itemInInv: inventory) {
			if (itemInInv.equals(item)) {
				inInventory = true;
				break;
			}
		}
		
		// Text output
		if (!inInventory && validRoomItem) {
			Sounds.playItemPickup();
			System.out.println("You pick up the " + item + ".");
			inventory.add(item);
			score += 5;
			Rooms.removeItem(room, x, y, item);
		}
		else if (inInventory) {
			System.out.println("You already have the " + item + ".");
		}
		else if (!validRoomItem) {
			System.out.println("You don't see that here.");
		}
		else {
			System.out.println("I don't understand.");
		}
		
		return score;
    }

    public static void print(ArrayList<String> inventory) {

        System.out.println("Inventory:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }
}