package bookExercises;

import javax.swing.JOptionPane;

public class Ex82methods {

	public int addition(int a, int b) {

		return a + b;
	}

	public int multiplication(int a, int b) {

		return a * b;
	}

	public int division(int a, int b) {

		int result = 0;

		if (a <= 0 || b <= 0) {

			JOptionPane.showMessageDialog(null, "Please input a value greater than zero");

		}

		else {

			result = a / b;

		}

		return result;

	}

	public int subtraction(int a, int b) {

		return a - b;
	}
}
