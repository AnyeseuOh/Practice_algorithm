package Day04;

import java.util.Scanner;

public class Day04_1_Q10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max_n=0, min_n=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (i == 0) { max_n = arr[0]; min_n = arr[0];}
			else {
				max_n = Math.max(max_n, arr[i]);
				min_n = Math.min(min_n, arr[i]);
			}
		}
		System.out.println(min_n+" "+max_n);
	}

}
