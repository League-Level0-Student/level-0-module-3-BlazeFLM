
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "July 15th";
		String dadsBirthday = "May 22nd";
		String myBirthday = "July 6th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String ask = JOptionPane.showInputDialog("What birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(ask);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (ask.equalsIgnoreCase("Mom")) {
			System.out.println(momsBirthday);
		} else if (ask.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		} else if (ask.equalsIgnoreCase("you")) {
			System.out.println(myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
