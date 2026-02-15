public class Demo1 {

	// method1 calculates and returns the square of a number
	public float method1(float number) {

		float square = number * number;
		return square;

	} // end method1

	// method2 checks a character and number and returns a boolean result
	public boolean method2(char letter, float number) {

		if (letter == 'A' && number == 12.0) {
			return false; //If letter = A and number = 12.0, then returns false; otherwise returns true;
		}

		return true; 

	} // end method2

	public char method3() {

		return 'Z';

	} // end method3
} // end Demo1
