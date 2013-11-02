package FizzBuzz;

public class FizzBuzz {
	public String calculate(int i) {
		if (isFizz(i) && isBuzz(i))
			return "FizzBuzz";
		if (isFizz(i))
			return "Fizz";
		if (isBuzz(i))
			return "Buzz";
		return String.valueOf(i);
	}

	private boolean isModulo(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

	private boolean isFizz(int i) {
		return isModulo(i, 3) || checkThree(i);
	}

	private boolean isBuzz(int i) {
		return isModulo(i, 5) || checkFive(i);
	}

	public static boolean checkThree(int i) {
		String s = Integer.toString(i);
		if (s.contains("3"))
			return true;
		return false;
	}

	public static boolean checkFive(int i) {
		String s = Integer.toString(i);
		if (s.contains("5"))
			return true;
		return false;
	}
}
