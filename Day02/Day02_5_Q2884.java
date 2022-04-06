package Day02;

import java.util.Scanner;

public class Day02_5_Q2884 {
    public static void main(String[] ar){
        int h, m;
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		if (m < 45) {
			if (h==0){
				h = h+24-1;
			}
			else {
				h = h-1;
			}
			m = m+60-45;
		}
		else {m = m-45;}
		System.out.println(h + " " + m);
    }
}
