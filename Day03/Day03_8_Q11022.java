package Day03;

import java.util.Scanner;

public class Day03_8_Q11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a,b;
		n=sc.nextInt();
		int[] a1 = new int[n];
		int[] b1 = new int[n];
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			a1[i] = a;
			b1[i] = b;
			arr[i] = a+b;
		}
		for (int i=0; i<n ;i++) {
			System.out.printf("Case #%d: %d + %d = %d\n",i+1, a1[i], b1[i], arr[i]);
		}
	}
}
