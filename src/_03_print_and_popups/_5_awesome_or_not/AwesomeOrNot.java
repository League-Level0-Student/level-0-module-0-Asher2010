package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int RNumber=ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	System.out.print(RNumber);
		// 4. Get the user to enter something that they think is awesome
	String Response = JOptionPane.showInputDialog("Enter something that you think is awesome");
		// 5. If your variable is  0
	
			// -- tell the user whatever they entered is awesome!
		if (RNumber == 0) {
		System.out.print("That is awesome!");
	}
		// 6. If your variable is  1
		if (RNumber == 1)  {
		System.out.print("That is ok");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
		if (RNumber == 2) {
		System.out.print("That is boring");
	}
		// 8. If your variable is  3
		if (RNumber == 3) {
		System.out.print("Be nice");
	}
			// -- invent your own message to give to the user (be nice).

}
}