package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number n: ");
		int n = in.nextInt();
		
		boolean[] A = new boolean[n];
		for (int i = 0; i < n; i++) {
			A[i] = true;
		}

		double sqrtn = Math.sqrt(n);
		for (int j = 2; j < sqrtn; j++) {
			if (A[j] == true) {
				for (int k = j*j; k < n; k += j) {
					A[k] = false;
				}
			}
		}
		for (int l=0;l<n;l++) {
			if (A[l]==true) {
				System.out.println(l);
			}
		}
	}
}
