import java.util.Scanner;

public class Prime {

	/**
	 * method to return multiplication of two prime numbers
	 * 
	 * @param number1
	 * @param number2
	 * @return number1 * number2
	 * @throws PrimeNumberException
	 */
	public static Integer multiplyPrime(Integer number1, Integer number2) throws PrimeNumberException {
		boolean isNumber1Prime = false, isNumber2Prime = false;

		// checking the number 1 for prime
		if (number1 == 0 || number1 == 1)
			isNumber1Prime = true;
		else {
			for (int i = 2; i <= (number1 / 2); i++) {
				if (number1 % i == 0)
					isNumber1Prime = true;
			}
		}

		// checking the number 2 for prime
		if (number2 == 0 || number2 == 1)
			isNumber2Prime = true;
		else {
			for (int i = 2; i <= (number2 / 2); i++) {
				if (number2 % i == 0)
					isNumber2Prime = true;
			}
		}

		// validating if both are prime
		if (isNumber1Prime && isNumber2Prime)
			throw new PrimeNumberException("Both " + number1 + " and " + number2 + " are non prime number");
		// validating number 1 for prime
		else if (isNumber1Prime)
			throw new PrimeNumberException(number1 + " is a non prime number");
		// validating number 2 for prime
		else if (isNumber2Prime)
			throw new PrimeNumberException(number2 + " is a non prime number");

		// returning the multiplication value if both numbers are prime
		return number1 * number2;
	}

	// main method
	public static void main(String[] args) {

		// creating the reference for scanner class
		Scanner scanner = new Scanner(System.in);

		// reading number 1
		System.out.print("Enter the number 1: ");
		Integer number1 = scanner.nextInt();

		// reading number 2
		System.out.print("Enter the number 2: ");
		Integer number2 = scanner.nextInt();

		try {
			// invoking method to multiply
			System.out.println("The multiplied value is " + multiplyPrime(number1, number2));
		} catch (PrimeNumberException e) {
			// handling the exception
			System.out.println(e.getMessage());
		}

		// closing the scanner instance
		scanner.close();

	}

}
