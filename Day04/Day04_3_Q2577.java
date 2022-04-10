package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class Day04_3_Q2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, n;
		int[] num = new int[10];
		Arrays.fill(num, 0);
		String result;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		result = String.valueOf(a*b*c);
		n = Integer.parseInt(result.substring(0, 1));
		for (int i=0; i<result.length(); i++) {
			n = Integer.parseInt(result.substring(i, i+1));
			num[n] += 1;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(num[i]);
		}
	}

}
