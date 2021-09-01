package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class IfOwnAdventure {
	public static void main(String[] args) {
		String start = JOptionPane.showInputDialog("This is the start of the no look maze. Left  or Right?");
		if (start.equalsIgnoreCase("Right")) {
			start = JOptionPane.showInputDialog("Up, Down, Left, or Right?");
			if (start.equalsIgnoreCase("Up")) {
				start = JOptionPane.showInputDialog("Right, Wrong, Neutral?");
				if (start.equalsIgnoreCase("Right")) {
					start = JOptionPane.showInputDialog("Triangle or Y?");
					if (start.equalsIgnoreCase("Y")) {
						JOptionPane.showMessageDialog(null, "You made it through the maze, good job.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "You're funny, if you get the joke.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Wrong way, haha");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Wrong way, haha");
		}
	}
}