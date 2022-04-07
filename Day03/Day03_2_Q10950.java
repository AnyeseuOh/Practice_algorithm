package Day03;

import java.util.Scanner;

public class Day03_2_Q10950 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n, a, b;
		n=sc.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i]=a+b;
		}
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
