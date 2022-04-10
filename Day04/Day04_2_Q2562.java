package Day04;

import java.util.Scanner;

public class Day04_2_Q2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max_n=0, max_index=0;
		
		for (int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			if (max_n < arr[i]) {
				max_n = arr[i];
				max_index = i+1;
			}
		}
	
		System.out.println(max_n);
		System.out.println(max_index);
	}
}
