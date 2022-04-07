package Day03;

import java.util.Scanner;

public class Day03_11_Q10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x,cnt=0;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int[] arr = new int[n];
		int[] anw = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i]<x) {
				anw[cnt]=arr[i];
				cnt+=1;
			}
		}
		
		for (int i=0; i<cnt; i++) {
			System.out.printf("%d ",anw[i]);
		}
		
	}
}
