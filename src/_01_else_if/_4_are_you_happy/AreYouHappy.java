package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else {
			happy = JOptionPane.showInputDialog("Do you want to be happy?");
			
		}
		
		
	}
}
