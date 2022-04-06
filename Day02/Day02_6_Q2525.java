package Day02;

import java.util.Scanner;

public class Day02_6_Q2525 {
    public static void main(String[] ar){
        int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		b = b+c;
		if (b>59){
			c = (int)(b/60);
			a=a+c;
			b=b%60;
		if (a>=24) {a=a-24;}
		}
		System.out.println(a + " " + b);
    }
}
