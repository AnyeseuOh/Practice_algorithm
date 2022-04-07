package Day03;

import java.util.Scanner;

public class Day03_14_Q1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b, fn, cnt=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fn=n;
		while (true) {
			if (n<10) {
				a = 0;
				b = n;
				if(a+b >= 10) {
					n = b*10 + (a+b-10);
				}
				else {n = b*10 + (a+b);}
				cnt+=1;
				if (fn == n) { break; }
			}
			else {
				a = n/10;
				b = n%10;
				if(a+b >= 10) {
					n = b*10 + (a+b-10);
				}
				else {n = b*10 + (a+b);}
				cnt+=1;
				if (fn == n) { break; }
			}
		}
		System.out.println(cnt);
	}

}
