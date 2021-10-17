package calculator;

class StringCalculator {

	public int add(String input) {

		// Commit 1 starts here  answer for Question 1 and 2
		if (input.isEmpty()) {
			return 0;
		}
		String[] numbers = input.split(",");
		if (numbers.length == 1) {
			return Integer.parseInt(numbers[0]);
		}
		int sum = 0;
		for (String string : numbers) {
			sum = sum + Integer.parseInt(string);
		}
		return sum;

		// Commit 1 ends here
	}

}