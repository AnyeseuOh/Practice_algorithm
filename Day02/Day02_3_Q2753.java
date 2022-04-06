package Day02;

import java.util.Scanner;

public class Day02_3_Q2753 {
    public static void main(String[] ar){
        int year, result;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (year%4==0 && (year%100!=0||year%400==0)) {result=1;}
		else {result=0;}
		System.out.println(result);
    }
}
