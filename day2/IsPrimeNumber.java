package Week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 21; // Assumption of random number
		boolean isPrime = true;

		// Prime number must be greater than 0 or 1
		if (n <= 1) {
			isPrime = false;
		} else {

			// iterate the given number
			for (int i = 2; i <= Math.sqrt(n); i++) {

				// if the given number divided by i then it is not a prime number
				if (n % i == 0) {
					isPrime = false;
					break; // no need to check further

				}
			}
		}

		// checks the isPrime result and prints the appropriate result
		if (isPrime) {
			System.out.println(n + " " + "is a prime number");
		} else {
			System.out.println(n + " " + "is not a prime number");
		}

	}
}
