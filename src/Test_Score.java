import javax.swing.JOptionPane;

public class Test_Score {
	public static void main(String[] args) {
int score=Integer.parseInt(JOptionPane.showInputDialog("What did you get on your test?"));
if (score<=25) {
	bad();
}
if (score>25&&score<50) {
	LessBad();
}
if (score>50&&score<75) {
	MEH();
}
if (score>75) {
	OK();
}else {
}
	}
	static void bad() {
		JOptionPane.showMessageDialog(null, "YOU SUCK!");
	}
	static void LessBad() {
		JOptionPane.showMessageDialog(null, "F is for fantastic!");
	}
	static void MEH() {
		JOptionPane.showMessageDialog(null, "Your grade is worse than Jake Paul.");
	}
	static void OK() {
		JOptionPane.showMessageDialog(null, "Be more bettliester");
	}
}
