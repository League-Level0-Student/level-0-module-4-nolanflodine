import javax.swing.JOptionPane;

public class Choooooose_your_own_adventure {
	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Once there was an ugly barnacle.  It was so ugly that everyone died.  The end.");
int a=  JOptionPane.showConfirmDialog(null, "Did you like the story?", "",
        JOptionPane.YES_NO_OPTION);
if (a==0) {
JOptionPane.showMessageDialog(null, "You are ligitness.");
int c=  JOptionPane.showConfirmDialog(null, "Do you like trains?", "",
        JOptionPane.YES_NO_OPTION);
if (c==0) {
JOptionPane.showMessageDialog(null, "You have gained my trust.");
JOptionPane.showMessageDialog(null, "You are a good person.");
}
else {
JOptionPane.showMessageDialog(null, "You have lost my trust.");
JOptionPane.showMessageDialog(null, "You are a bad person.");	
}
}
else {
JOptionPane.showMessageDialog(null, "You suck because you are barnaclist!");
int b=  JOptionPane.showConfirmDialog(null, "Do you think you can wright a better story?", "",
        JOptionPane.YES_NO_OPTION);
if (b==0) {
JOptionPane.showInputDialog(null, "Then I challenge you to wright a better one.");
JOptionPane.showMessageDialog(null, "Your story sucks.");
JOptionPane.showMessageDialog(null, "Next time don't judge a barnacle by its cover.");
}
else {
JOptionPane.showMessageDialog(null, "That's what I thought.");
JOptionPane.showMessageDialog(null, "Next time don't judge a barnacle by its cover.");
}
}
	}
}
