package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String Response = JOptionPane.showInputDialog("Are you a soccer fan?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response.equals("yes")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}

		String Response1 = JOptionPane.showInputDialog("Did Southampton come last in the Premier League last season?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response1.equals ("yes")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}
		String Response2 = JOptionPane.showInputDialog("Did Man Utd come first in the Premier League last season?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response2.equals ("no")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}

		String Response3 = JOptionPane.showInputDialog("Did Real Madrid lose to Man City on a 4-0 aggregate score in the Champions League last season?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response3.equals ("no")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}

		String Response4 = JOptionPane.showInputDialog("Did Man City win the FA Cup last season?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response4.equals ("yes")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}

		String Response5 = JOptionPane.showInputDialog("Are Man City and Tottenham the best teams?");
				// 3.  Use an if statement to check if their answer is correct
				if(Response5.equals ("yes")) {
					Score += 1;
				
				}
				else {
					Score -=1;
				}
				System.out.print(Score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
