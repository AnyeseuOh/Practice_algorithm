package Day03;

import java.util.Scanner;

public class Day03_7_Q11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,a,b;
		t = sc.nextInt();
		int[] arr = new int[t];
		for (int i=0; i<t ;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			arr[i]=a+b;
		}
		for (int i=0; i<t; i++) {
			System.out.printf("Case #%d: "+arr[i]+"\n",i+1);
		}
	}
}
