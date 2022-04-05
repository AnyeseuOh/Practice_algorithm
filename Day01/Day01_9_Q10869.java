package Day01;

import java.util.Scanner;

public class Day01_9_Q10869 {
    public static void main(String[] ar){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d\n%d\n%d\n%d\n%d", a+b,a-b,a*b,a/b,a%b);
    }
}
