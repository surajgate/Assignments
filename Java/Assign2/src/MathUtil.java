package math;

public class MathUtil {

	public static boolean isEven(int number) {
		if(number % 2 == 0) {
			
			return true;
		}
		return false;
	}

	public static boolean isOdd(int number) {
		if(number % 2 != 0) {
			
			return true;
		}
		return false;
	}

	public static boolean isPrime(int number) {
		
		if(number == 1) 
			return false;

		if(number == 2 || number == 3)
			return true;

		for(int m=3; m * m <= number; m += 2) {
			if((number % m) == 0)
				return false;
		}

		return true;
	}

	public static int countPrimes(int number1, int number2) {
		int term;
		int count = 0;

		for(term = number1; term <= number2; ++term){
			
			if(isPrime(term)) {
				++count;	
			}
		}
		return count;
	}
	
	public static int reverse(int number){

		int rem = 0;
		int reverse = 0;

		while(number != 0) {

			rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		return reverse;
	}

	public static int digitCount(int number) {

		int count = 0;

		while(number != 0) {

			number /= 10;
			++count;
		}
		
		return count;
	}


}
