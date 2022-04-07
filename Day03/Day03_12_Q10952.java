package Day03;

import java.util.Scanner;

public class Day03_12_Q10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, cnt=0;
		int[] res = new int[100];
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a!=0 && b!=0) {
				res[cnt]=a+b;
				cnt+=1;
			}
			else {
				break;
			}
		}
		for (int i=0; i<cnt; i++) {
			System.out.println(res[i]);
		}
	}
}
