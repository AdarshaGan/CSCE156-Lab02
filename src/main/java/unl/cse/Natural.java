package unl.cse;

/**
 * This program demonstrates the use of various loop control structures to
 * compute the sum of natural numbers.
 * 
 * @author cbourke
 *
 */
public class Natural {

	/**
	 * Computes the sum of natural numbers 1..n using a while loop.
	 * 
	 * @return sum of the natural numbers
	 */
	public static int sumWithWhile(int n) {
		// TODO: write a while-loop to compute the sum of 1..n
		int count = 0;
		int sum = 0;
		while(count <= n) {
			sum += count;
			count++;
		}
		return sum;
	}

	/**
	 * Computes the sum of natural numbers 1..n using a for loop.
	 * 
	 * @return sum of the natural numbers
	 */
	public static int sumWithFor(int n) {
		// TODO: write a for-loop to compute the sum of 1..n
		int sum = 0;
		for(int i = 0; i <= n ; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String args[]) {
//		if (args.length != 1) {
//			System.err.println("ERROR: expecting a single integer argument");
//			System.exit(1);
//		}
//
//		Integer n = null;
//		try {
//			n = Integer.parseInt(args[0]);
//		} catch (NumberFormatException nfe) {
//			System.err.println("ERROR: expecting a single integer argument");
//			System.exit(1);
//		}
		int n = 9;

		String zeroToTen[] = new String[11];
		zeroToTen[0] = "zero";
		zeroToTen[1] = "one";
		zeroToTen[2] = "two";
		zeroToTen[3] = "three";
		zeroToTen[4] = "four";
		zeroToTen[5] = "five";
		zeroToTen[6] = "six";
		zeroToTen[7] = "seven";
		zeroToTen[8] = "eight";
		zeroToTen[9] = "nine";
		zeroToTen[10] = "ten";

		// TODO: write an enhanced for-loop to iterate over the zeroToTen array
		for(String s : zeroToTen) {
			if(s == zeroToTen[n]) {
				System.out.print(s + " = ");
				break;
			}
			else {
				System.out.print(s + " + ");

			}
		}
		
		// TODO: call your methods here and print the result
		System.out.println(sumWithFor(n));
		System.out.print(sumWithWhile(n));

		
		
	}
}
