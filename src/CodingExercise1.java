/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		Robot R2 = new Robot();
		
		// 3. ask the user what color they would like the tortoise to draw
		String ans = JOptionPane.showInputDialog("What color should it draw?");
			// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
			if( ans.equals("blue")){
		   R2.setPenColor(PenColors.Blues.Blue);
			}
			else if(ans.equals("red")){
				R2.setPenColor(PenColors.Reds.Red);
				
			}
			// 2. set the pen width to 10
			R2.setPenWidth(10);
		// 1. make the tortoise draw a shape
		
		R2.penDown();
		for(int i=1; i < 5; i++){
		R2.move(80);
		R2.turn(90);
		}
	}
		
}

