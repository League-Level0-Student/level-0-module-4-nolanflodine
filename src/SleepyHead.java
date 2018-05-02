//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
      int a=  JOptionPane.showConfirmDialog(null, "Is it a weekend or are you on a vacation?", "",
                JOptionPane.YES_NO_OPTION);
if (a==1) {
JOptionPane.showMessageDialog(null, "Get up lazybones!");	
}else {
	JOptionPane.showMessageDialog(null, "Sleep in.");
}
    


        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}
