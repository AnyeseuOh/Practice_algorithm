package Day04;

import java.util.Scanner;

public class Day04_5_Q1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max_n=0;
		double sum=0;
		int n = sc.nextInt();
		int[] score = new int[n];
		double[] d_sc = new double[n];
		
		for (int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			max_n = Math.max(max_n, score[i]);
		}
		
		for (int i=0; i<n; i++) {
			d_sc[i] = (double)((double) score[i] / max_n) * 100;
			sum = sum + d_sc[i];
		}
		System.out.println(sum/n);
	}

}
