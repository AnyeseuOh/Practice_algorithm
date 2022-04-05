package Day01;

import java.util.Scanner;

public class Day01_13_Q2588 {
    public static void main(String[] arg){
        int a, b, ab_1, ab_2, ab_3, result;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        ab_1=a*(b%10);
        ab_2=a*(((b%100)-(b%10))/10);
        ab_3=a*(b/100);
        result=ab_3*100 + ab_2*10 + ab_1;
        System.out.printf("%d\n%d\n%d\n%d",ab_1,ab_2,ab_3,result);
    }
}
