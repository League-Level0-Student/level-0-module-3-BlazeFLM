
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Random ran = new Random();
		Random ran2 = new Random();
		Random ran3 = new Random();
		Random ran4 = new Random(120);
		// 1. Create a new Robot

		Robot rob = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(8);
		// rob.move(234);
		// 3. Set the pen width to 10
		rob.setPenWidth(10);
		// 4. Ask the user what color pen they would like the robot to draw with
		while (true) {
			String color = JOptionPane.showInputDialog("What color pen you want the robot to use?");
			// 5. Use an if/else statement to set the pen color that the user requested

			if (color.equals("blue")) {
				rob.setPenColor(0, 0, 100);
				rob.move(234);
				rob.turn(90);
			} else if (color.equals("red")) {
				rob.setPenColor(255, 0, 0);
				rob.move(234);
				rob.turn(270);
			} else if (color.equals("green")) {
				rob.setPenColor(0, 100, 0);
				rob.turn(180);
				rob.move(212);
			} else if (color.equals("purple")) {
				rob.setPenColor(103, 13, 173);
				rob.move(158);
				rob.turn(12);
			} else {
				rob.setPenColor(ran.nextInt(), ran2.nextInt(), ran3.nextInt());
				rob.move(200);
				rob.turn(90);

			}
		}
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

	}
}
