package bookExercises;

import javax.swing.JOptionPane;

public class Ex82 {

	public static void main(String[] args) {

		int a, b;

		String userAnswer;

		int userChoice;

		Ex82methods ex = new Ex82methods();

		do {

			userChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the arithmetic operation"
					+ "\n1- Addition" + "\n2- Multiplication" + "\n3- Division" + "\n4- Subtraction"));

			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first number: "));

			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second number: "));

			ex.addition(a, b);

			switch (userChoice) {

			case 1:

				JOptionPane.showMessageDialog(null, "Addition: " + ex.addition(a, b));
				;

				break;

			case 2:

				JOptionPane.showMessageDialog(null, "Multiplication : " + ex.multiplication(a, b));

				break;

			case 3:

				JOptionPane.showMessageDialog(null, "Division : " + ex.division(a, b));

				break;

			case 4:

				JOptionPane.showMessageDialog(null, "Subtraction: " + ex.subtraction(a, b));

				break;

			default:

				JOptionPane.showMessageDialog(null, "No operation was selected");
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");
	}

}
