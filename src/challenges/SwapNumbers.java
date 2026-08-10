package challenges;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to swapping stations\n\n");
        System.out.println("enter the value of A");
        int a =input.nextInt();
        System.out.println("enter the value of B");
        int b =input.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("swapping done");
        System.out.println("value of A="+a);
        System.out.println("value of B="+b);


    }
}
