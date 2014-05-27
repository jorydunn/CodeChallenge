public class ProblemOne {

	public static int sumIntValuesInString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				sum += c - '0';
			}
		}	
		return sum;
	}
	
	public static void displayAndAssertSum(String input, int expected) {
		int actual = ProblemOne.sumIntValuesInString(input);
		if (actual != expected) {
			throw new AssertionError("Expected: " + expected + " Actual: " + actual);
		}
		System.out.println("Input: " + input + " Sum: " + actual);
	}
	
	public static void main(String[] args) {
		ProblemOne.displayAndAssertSum("dywi23jssi88sjdhj1", 22);
		ProblemOne.displayAndAssertSum("dywi23js0si88sjdhj1", 22);
		ProblemOne.displayAndAssertSum("dywi123j0000s9si88sjdhj1", 32);
	}
}
