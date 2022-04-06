package Day02;

import java.util.Scanner;

public class Day02_2_Q9498 {
    public static void main(String[] ar){
        int score;
		String result ="";
		Scanner sc = new Scanner(System.in);
		score=sc.nextInt();
		if (score <= 100 && score >= 90){result="A";}
		else if (score < 90 && score >= 80) {result="B";}
		else if (score < 80 && score >= 70) {result="C";}
		else if (score < 70 && score >= 60) {result="D";}
		else {result="F";}
		System.out.println(result);
    }
}
