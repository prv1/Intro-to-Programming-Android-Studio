import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        // Build rooms
        final int WIDTH = 2;
        final int HEIGHT = 2;
        Room[][] room = new Room[WIDTH][HEIGHT];
        Rooms.build(room, WIDTH, HEIGHT);
        int x = 0;
        int y = 0;
        int score = 0;

        // Load inventory
        ArrayList<String> inventory = new ArrayList<>();
        
        // Title Screen
    	System.out.println("+-------------------------------+");
    	System.out.println("| Text Adventure: Skeleton Code |");
    	System.out.println("+-------------------------------+");
    	
    	Sounds.playTitleMusic();
    	
    	// Print starting room description
    	Rooms.print(room, x, y);

        // Start game loop
        boolean playing = true;
        while (playing) {

        	// Get user input
            String input = Input.getInput();

            // Movement commands
            if (input.equals("n")) {
                if (y > 0) {
                    y--;
                    Rooms.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("s")) {
                if (y < HEIGHT - 1) {
                    y++;
                    Rooms.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("e")) {
                if (x > 0) {
                    x--;
                    Rooms.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            } else if (input.equals("w")) {w
                if (x < WIDTH - 1) {i
                    Rooms.print(room, x, y);
                } else {
                    System.out.println("You can't go that way.");
                }
            }

            // Look commands
            else if (input.equals("look")) {
                Rooms.print(room, x, y);
            }

            // Get commands
            else if (input.length() > 4  && input.substring(0, 4).equals("get ")) {
            	if (input.substring(0, input.indexOf(' ')).equals("get")) {
            		if (input.substring(input.indexOf(' ')).length() > 1) {
            			String item = input.substring(input.indexOf(' ') + 1);
                    	score = Inventory.checkItem(x, y, item, inventory, room, score);
            		}	
            	}
            }

            // Inventory commands
            else if (input.equals("i") || input.equals("inv")
                    || input.equals("inventory")) {
                Inventory.print(inventory);
            }
            
            else if (input.equals("score")) {
            	System.out.println("Score: " + score + "/500");
            }
            
            else if (input.equals("restart")) {
            	System.out.println();
            	Main.main(args);
            }
            
            else if (input.equals("help")) {
            	System.out.println("Type 'n'/'e'/'s'/'w' to move around");
            	System.out.println("Type 'look' for a description of the room you're in");
            	System.out.println("Type 'get' + the item to get something");
            	System.out.println("Type 'i' to view your inventory");
            	System.out.println("Type 'score' to view your score");
            	System.out.println("Type 'restart' to restart the game");
            	System.out.println("Type 'quit' to quit the game");
            }
            
            // Quit commands
            else if (input.equals("quit")) {
                System.out.println("Goodbye!");
                playing = false;

            // Catch-all for invalid input
            } else {
                System.out.println("You can't do that.");
            }
        }
        System.exit(0);
    }
}
