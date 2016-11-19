package runcodedungeon;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class RunCodeDungeon {
	
	static Random generator = new Random();
	static String classString = "";
	static int firewall;
	static int viruses;
	static int code;
	static int system;
	static int intelligence;
	static int cash = 0;
	static int level = 0;
	static int XP = 0;
	static int mainOption;
	static int room;
	static int playerClass;

	static int purchase;
	static int buy;
	
	

	public static void purchase() {

		try {
			purchase = Integer
					.parseInt(JOptionPane
							.showInputDialog("BestBuy Merchant: I see you are not properly equipped with a proper laptop and equipment..."
									+ "\n <1> Alienware 18 Laptop, (2) Tech Support, (1) USB"
									+ "\n <2> Macbook Pro, (3) USBs, (3) Tech Support, (3) Trojan Virus, (1) Anti-Virus, (1) USB Mouse"
									+ "\n <3> Jailbroken Chromebook, (4) USBs, (3) Trojan Viruses, (2) Anti-Viruses, (1) USB Mouse, (2) Tech Support, (1) Great IDE"));
		} catch (NumberFormatException e) {
			say("You put in an invalid option.");
			purchase();
		}


	}
	
	public static void mainOpt() {
		

		try {
			mainOption = Integer
					.parseInt(JOptionPane
							.showInputDialog("You arriave in room"
									+ room
									+ ":"
									+ "\n <1> Look around"
									+ "\n <2> Talk to the Shady Dealer in the corner"
									+ "\n <3> Inventory"
									+ "\n <4> Stats"
									+ "\n <5> Next Room"
									+ "\n <6> Use Item"));
		} catch (NumberFormatException e) {
			say("That was not a valid option.");
			mainOpt();
		}
	}
	
	public static void classChoose() {
		try {
			playerClass = Integer
					.parseInt(JOptionPane
							.showInputDialog("Pick a Class: \n"
									+ "<1> Hacker: Good with viruses and pretty fine with code but has a weakness for firewalls. Also low intelligence... \n"
									+ "<2> CEO: Very intelligent and lots and lots of system space but not the best with code. \n"
									+ "<3> Coder : Great with code, kinda bad system space, decent viruses and firewalls. \n"));
		} catch (NumberFormatException e) {
			say("You inputed an invalid class.");
			classChoose();
		}
		
		switch (playerClass) {

		case 1:
			classString = "hacker";
			firewall = 1;
			viruses = generator.nextInt(1) + 4;
			code = generator.nextInt(1) + 3;
			system = generator.nextInt(20) + 20;
			intelligence = generator.nextInt(2) + 1;
			break;
		case 2:
			classString = "CEO";
			firewall = generator.nextInt(2) + 1;
			viruses = generator.nextInt(1) + 3;
			code = generator.nextInt(1) + 2;
			system = generator.nextInt(20) + 30;
			intelligence = generator.nextInt(2) + 4;
			break;
		case 3:
			classString = "coder";
			firewall = generator.nextInt(1) + 3;
			viruses = generator.nextInt(1) + 3;
			code = generator.nextInt(1) + 4;
			system = generator.nextInt(20) + 20;
			intelligence = generator.nextInt(2) + 2;
			break;
		default:
			
			classChoose();

		}
		
	}

	static boolean alive = true;

	public static ArrayList<String> inventory = new ArrayList();

	// Method that opens a display box w/ text
	public static void say(String text) {
		JOptionPane.showMessageDialog(null, text, "Code Dungeon v1.0",
				JOptionPane.DEFAULT_OPTION);

	}
	
	public static void merchant() {
		try {
			buy = Integer
					.parseInt(JOptionPane
							.showInputDialog("Shady Merchant: Buy something!?!?!?!?"
									+ "\n <1> USB - 10 BitCoins"
									+ "\n <2> Tech Support - 20 BitCoins"
									+ "\n <3> Trojan Virus - 30 BitCoins"
									+ "\n <4> Anti-Virus - 15 BitCoins"
									+ "\n \n BitCoins: " + cash
									+ "\n <5> Nothing Thanks!"));
		} catch (NumberFormatException e) {
			say("You put in an invalid option.");
			merchant();
		}
		
		switch(buy) {
		case 1:
			if(cash >= 10) {
				inventory.add("USB");
				cash = cash - 10;
			} else {
				say("You do not have enough money for that. What!? You trying to scam me???");
			}
			break;
		case 2:
			if(cash >= 30) {
				inventory.add("Trojan Virus");
				cash = cash - 30;
			} else {
				say("You do not have enough money for that. What!? You trying to scam me???");
			}
			break;
		case 3:
			if(cash >= 15) {
				inventory.add("Tech Support");
				cash = cash - 20;
			} else {
				say("You do not have enough money for that. What!? You trying to scam me???");
			}
			break;
		case 4:
			if(cash >= 15) {
				inventory.add("Anti-Virus");
				cash = cash - 15;
			} else {
				say("You do not have enough money for that. What!? You trying to scam me???");
			}
			break;
		default:
			say("Merchant: That doesn't exsist!!!");
			
			
		}
		
	}

	// Display stats

	public static void statRead() {

		say("--Stats-- \n Firewall: " + firewall + "\n Viruses: " + viruses
				+ "\n Code: " + code + "\n Intelligence: " + intelligence
				+ "\n System: " + system + " \n \n Level: " + level + "\n XP: "
				+ XP);
	}

	// Ask Inventory - Return Inventroy item number

	public static int InvenAsk() {
		String list;
		list = inventory.get(0);

		for (int i = 1; i < inventory.size(); i++) {
			list = list + "\n <" + i + "> " + inventory.get(i);
		}

		int invenOption;
		try {
			invenOption = Integer.parseInt(JOptionPane
					.showInputDialog("Select an item: \n" + list));
		} catch (NumberFormatException e) {
			invenOption = 1;
			say("That's not a valid item. Defaulted to item 1.");
		}
		return invenOption;
	}

	// Battle System

	public static boolean doBattle(String name, int sentHP, int sentAttack,
			int sentDefense) {
		int enemyHP = sentHP + generator.nextInt(1) + level;
		int enemyAttack = sentAttack + generator.nextInt(1) + level;
		int enemyDefense = sentDefense + generator.nextInt(1) + level;

		int myDefense = firewall;

		int virusesMade = 0;
		int virusAttack = 0;

		while (system > 0 && enemyHP > 0) {
			int action;

			try {
				action = Integer.parseInt(JOptionPane
						.showInputDialog("Action: \n"
								+ "<1> Send out Virus. \n"
								+ "<2> Build Virus. \n"
								+ "<3> Work on system defense. \n"
								+ "<4> Repair System \n" + "<5> Use Item \n"
								+ "\n System Status: " + system
								+ "\n  Defense: " + myDefense + "\n Enemy HP: "
								+ enemyHP + "\n Enemy Attack: " + enemyAttack
								+ "\n Enemy Defense: " + enemyDefense
								+ "\n Viruses Made: " + virusesMade
								+ "\n Virus Power: " + virusAttack
								+ "\n <6> See Full Stats"));
			} catch (NumberFormatException e) {
				action = 7;
				say("You did not type in a valid number.");
			}
			switch (action) {
			case 1:
				if (virusesMade > 0) {
					if (virusAttack - enemyDefense > 0) {
						enemyHP = enemyHP - virusAttack;
						virusesMade--;
					} else {
						say("You need to make a virus!");
						action = 7;
					}
				}
				break;
			case 2:
				virusesMade++;
				if (virusAttack > 0) {
					virusAttack = viruses + code / 2;
					virusAttack++;
					
				} else {
					virusAttack = viruses + code / 2;
				}
				say("You build a virus.");
				break;
			case 3:
				myDefense = myDefense + (code + firewall) / 2;
				say("Defense improved!");
				break;
			case 4:
				system = intelligence / 2 + code / 2;
				say("System improved!");
				break;
			case 5:
				int selectItem = InvenAsk();

				if (inventory.get(selectItem).equals("USB")) {
					system = system + 15;
					inventory.remove(selectItem);
					say("You used a USB and repaired your system by 15.");
				} else if (inventory.get(selectItem).equals("Tech Support")) {
					say("You get to leave battle.");
					inventory.remove(selectItem);
					return true;
				} else if (inventory.get(selectItem).equals("Anti-Virus")) {
					myDefense = myDefense + 5;
					inventory.remove(selectItem);
					say("You increased your system defense by 5.");
				} else if (inventory.get(selectItem).equals("Trojan Virus")) {
					virusAttack = virusAttack + 3;
					virusesMade = virusesMade + 2;
					inventory.remove(selectItem);
					say("Your viruses got more powerful and you got two for free!");
				} else {
					action = 7;
					
					say("Not a valid item.");
				}
				break;
			case 6:
				statRead();
				break;
			default:

			}

			if (action != 6 || action != 7) {
				if(enemyAttack > myDefense) {
					system = system - (enemyAttack - myDefense);
					say("Enemy attacks for " + (enemyAttack - myDefense));
				} else {
					system = system - enemyAttack;
					say("Enemy attacks for " + (enemyAttack));
				}
				
				enemyAttack++;
				
			}

		}

		if (system <= 0) {
			return false;
		} else {
			say("You got " + sentHP / 2 + " cash." + "\n " + sentHP + " XP.");
			cash = cash + sentHP / 2;
			XP = XP + sentHP;
			return true;

		}
	}

	// Display box that had inventory

	public static void invenRead() {
		String list;
		list = inventory.get(0);

		for (int i = 1; i < inventory.size(); i++) {
			list = list + "\n" + inventory.get(i);
		}

		say("--Inventory-- \n" + list + "\nBitCoins: " + cash);

	}

	public static void main(String[] args) {

		 // Variable we'll call to generate
											// random numbers.

		say("--CODE DUNGEON--"
				+ "\n Copyright 2014 - Ironbizmark");

		

		classChoose();
		
		

		statRead();

		JOptionPane
				.showMessageDialog(
						null,
						"You are traveling on a long journey away from your home in the land of C. In the distance you see a traveler. \n \n Villager: Greetings young "
								+ classString
								+ ". I'm afraid that I have troubling news! My hometown of Macintosh has been terrorized by a near - by Code Dungeon. \n Viruses leak out and murder our famers. We may starve soon! It would be great if a "
								+ classString + " like you could help us!",
						"Code Dungeon", JOptionPane.DEFAULT_OPTION);

		int accept = JOptionPane.showConfirmDialog(null,
				"Villager: So will you accept??", "Code Dungeon",
				JOptionPane.YES_NO_OPTION);

		if (accept == 0) {

			String hero = JOptionPane
					.showInputDialog("Villager: Thank you so much! What is your name though great "
							+ classString + "?");

			say(hero
					+ "? That's a great name! Come to my village we will help equip you for your journey! \n \n The two of you travel to the village.");
			purchase();
			switch (purchase) {
			case 1:
				inventory.add("Alienware 18");
				// Set stats for computer
				firewall = firewall + 5;
				viruses = viruses + 3;
				code = code + 3;
				system = system + 50;

				// Inventory UPDATE
				inventory.add("Tech Support");
				inventory.add("Tech Support");
				inventory.add("USB");
				break;
			case 2:
				inventory.add("Macbook Pro");
				// Stats for computer
				firewall = firewall + 4;
				viruses = viruses + 1;
				code = code + 2;
				system = system + 20;
				intelligence = intelligence + 1;

				inventory.add("USB");
				inventory.add("USB");
				inventory.add("USB");
				inventory.add("Tech Support");
				inventory.add("Tech Support");
				inventory.add("Tech Support");
				inventory.add("Trojan Virus");
				inventory.add("Trojan Virus");
				inventory.add("Trojan Virus");
				inventory.add("Anti-Virus");
				inventory.add("USB Mouse");

				break;
			case 3:
				inventory.add("Jailbroken Chromebook");

				// Computer stats

				firewall = firewall + 3;
				viruses = viruses + 1;
				code = code + 1;
				system = system + 10;

				inventory.add("USB");
				inventory.add("USB");
				inventory.add("USB");
				inventory.add("USB");
				inventory.add("Trojan Virus");
				inventory.add("Trojan Virus");
				inventory.add("Trojan Virus");
				inventory.add("Anti-Virus");
				inventory.add("Anti-Virus");
				inventory.add("USB Mouse");
				inventory.add("Tech Support");
				inventory.add("Tech Support");
				inventory.add("Great IDE");

				break;

			default:
				inventory.add("Moldy Sandwich");
				inventory.add("How To: Java Guide");
			}

			say("Villager: Here is the dugeon. But before you go take 200 BitCoins... You might need them...");
			say("Wow! That guy scammed you! He only gave you 20 coins!");
			say("Villager: Oh! I forgot! There is a boss who gaurds the door. Don't worry though he's weak. I'd watch out for mini bosses though...");

			cash = cash + 20;
			boolean explored = false;
			room = 1;

			do {

				if (XP == level * 100) {
					say("You are almost ready to level up... Boss FIGHT!!");
					if (doBattle("Boss", (XP + 1) * 10, (XP + 1), (XP + 1))) {
						say("You beat a boss and level up!");
						level++;
						firewall = firewall + level;
						viruses = viruses + level;
						code = code + level;
						system = system + level;
						intelligence = intelligence + level;
						XP = 0;
						statRead();
					}
				} else {
					
					mainOpt();
					
					switch (mainOption) {

					case 1:

						System.out.println(!explored);
						if (!explored) {
							explored = true;
							int rand = 0;
							say("You explore the room.");
							System.out.println(rand);
							if (rand == 0) {
								int open = JOptionPane
										.showConfirmDialog(
												null,
												"You find a mysterious looking computer possibly filled with BitCoins. Open?",
												"Code Dungeon",
												JOptionPane.YES_NO_OPTION);
								if (open == 0) {
									if (generator.nextInt(100) >= 50) {
										say("The chest was filled with malware that infects your system.");
										system = 0;
									} else {
										say("You find a load of 1000 BITCOINS!!");
										cash = cash + 1000;
									}
								}
							} else if (rand <= 50) {
								say("You encounter an enemy coder!");
								if (doBattle("Hacker", (level + 2) * 10,
										(level + 2) * 2, (level + 2) * 2)) {
									say("You won the battle!");
								}
							} else if (rand == 99) {
								int guac = JOptionPane
										.showConfirmDialog(
												null,
												"You find a mysterious looking bowl of guacamole. Investigate?",
												"Code Dungeon",
												JOptionPane.YES_NO_OPTION);
								if (guac == 0) {
									say("You take a bite of the guac and find a key upon your chip!\n Also, you feel quite rejuvinated...");
									system = system + 100;
									inventory.add("Key");
								} else {
									say("You stay away from the guac... \n You were always suspicous of avacadoes...");
								}
							} else if (rand > 85) {
								say("You encounter a Mini Boss!");
								if (doBattle("CEO Hacker", rand, rand, rand)) {
									say("You beat a mini boss!");
								}

							} else {
								say("You find nothing.");
							}

						} else {
							say("You already saw what was in this room.");
						}
						break;
					case 2:
						merchant();
						break;
					case 3:
						invenRead();
						break;
					case 4:
						statRead();
						break;
					case 5:
						explored = false;
						room++;
						break;
					case 6:
						int selectItem = InvenAsk();

						if (inventory.get(selectItem).equals("USB")) {
							system = system + 15;
							say("You used a USB and repaired your system by 15.");
							inventory.remove(selectItem);
						} else {
							say("Not a valid item.");
						}
					default:

					}
				}

			} while (system > 0);

			say("You died... The villager morns your death.");

		} else {

			say("Villager: Oh... That's okay... \n \n The whole village of Macintosh was later slaughtred...");
		}
	}

}

