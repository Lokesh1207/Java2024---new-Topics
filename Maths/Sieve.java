package Maths;

public class Sieve {

	public static void main(String[] args) {
		int n = 40;
		boolean primes[] = new boolean[n + 1];
		seive(n, primes);

	}

	private static void seive(int n, boolean[] primes) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (primes[i] == false) {
				for (int j = i * 2; j <= n; j += i) {
					primes[j] = true;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (primes[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}


//basically there are two types 
//1.find a number is prime or not (Previious program)
//2.print all the prime numbers in the given range (This program)

//WATCH KUNAL.

