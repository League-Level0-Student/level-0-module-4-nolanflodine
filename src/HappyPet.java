import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static	String pett;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
  pett=JOptionPane.showInputDialog("What pet do you want to buy?");
String money=JOptionPane.showInputDialog("How much money do you have to buy a "+pett+"?");
JOptionPane.showMessageDialog(null, "You don't have enough money do buy a "+pett+".");
JOptionPane.showMessageDialog(null, "A "+pett+" costs "+money+1);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 0; i < 4; i++) {
	

			int task1 = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy? ", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Poop with him", "Eat with him", "Sleep with him" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task1==0) {
				poop();
			}
			if (task1==1) {
		        eat();
			}
			if (task1==2) {
				sleep();
			}
}
		
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	
	static void eat() {
JOptionPane.showMessageDialog(null, "Your "+pett+" is getting happier and you are getting heavier!");
	}
static void sleep() {
JOptionPane.showMessageDialog(null, "Your "+pett+" finds joy from watching you in your sleep.");
		}
static void poop() {
JOptionPane.showMessageDialog(null, "Your "+pett+" loves to poop with you!  It's a great bonding oppurtunity!");
		}
			
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}