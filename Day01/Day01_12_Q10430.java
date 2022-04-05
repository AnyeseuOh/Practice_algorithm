package Day01;

import java.util.Scanner;

public class Day01_12_Q10430 {
    public static void main(String[] arg){
        int A,B,C;
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d\n",(A+B)%C,((A%C)+(B%C))%C,(A*B)%C,((A%C)*(B%C))%C);
    }
}
