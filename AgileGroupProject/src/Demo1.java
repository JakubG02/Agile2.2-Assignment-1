public class Demo1 {
	
	// method1 calculates and returns the square of a number
	public float method1(float number) {
		
		float square = number * number;
		return square;
		
	} // end method
	
	 // method2 checks a character and number and returns a boolean result
	public boolean method2(char letter, float number) {

		if (letter == 'A' && number == 12.0) {
		    return false;
		}

		return true;

	} // end method2
}
