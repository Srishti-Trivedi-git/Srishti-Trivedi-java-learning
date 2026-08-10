package challenges;
import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing Bitwise Right Shift Operator!");
        System.out.println("please enter your number:");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.println("Result is :" + result);
    }
}