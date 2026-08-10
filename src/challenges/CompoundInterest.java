package challenges;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of P:");
        System.out.println("enter the value of T:");
        System.out.println("enter the value of R:");
        int P =input.nextInt();
        int R =input.nextInt();
        int T=input.nextInt();

        int SI=(P*T*R)/100;
        System.out.println("your simple interestis:"+SI);

    }
}
