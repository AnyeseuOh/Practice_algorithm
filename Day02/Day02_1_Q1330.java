package Day02;
import java.util.Scanner;
import java.lang.Math;

public class Day02_1_Q1330 {
	    public static void main(String[] ar){
		    int a, b, c, money, max;
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a==b && a==c) {
				money=10000+a*1000;
			}
			else if (a==b || a==c || b==c){
				if (a==b||a==c) {money=1000+a*100;}
				else {money=1000+b*100;}
			}
			else {
				max = Math.max(a,b);
				max = Math.max(max,c);
				money=max*100;
			}
			System.out.println(money);
	    }
}
