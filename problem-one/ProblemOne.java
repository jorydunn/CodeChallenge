public Class ProblemOne {

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
	
	public static void assertEquals(int actual, int expected) {
		if (actual != expected) {
			throw new AssertionError("Expected: " + expected + " Actual: " + actual);
		}
	}
	
	public static void main(String[] args) {
		assertEquals(ProblemOne.sumIntValuesInString("dywi23jssi88sjdhj1"), 22);
		assertEquals(ProblemOne.sumIntValuesInString("dywi23js0si88sjdhj1"), 22);
		assertEquals(ProblemOne.sumIntValuesInString("dywi123j0000s9si88sjdhj1"), 32);
	}
}
