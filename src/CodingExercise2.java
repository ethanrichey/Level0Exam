/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {

int years;
int DOB = 2016;
String age = JOptionPane.showInputDialog("How old are you?");

	years = Integer.parseInt(age);

	
	if(years < 30){
	JOptionPane.showMessageDialog(null, "You were born in " + (DOB -= years));	
		
	}
	
	else if( years >= 30){
		
		JOptionPane.showMessageDialog(null, "You're too old for this game");
	}
	

	
}
}
