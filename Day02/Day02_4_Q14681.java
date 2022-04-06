package Day02;

import java.util.Scanner;

public class Day02_4_Q14681 {
    public static void main(String[] ar){
        int x, y, quandant;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		if (x>0 && y>0) {quandant=1;}
		else if (x<0 && y>0) {quandant=2;}
		else if (x<0 && y<0) {quandant=3;}
		else {quandant=4;}
		System.out.println(quandant);
    }
}
