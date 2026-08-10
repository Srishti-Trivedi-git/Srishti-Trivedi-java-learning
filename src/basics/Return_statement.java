package basics;
import java.util.Scanner;
public class Return_statement {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.println("Please enter first number");
        int first=input.nextInt();
        System.out.println("Please enter second number");
        int second=input.nextInt();
        int sum=first+second;
        System.out.println(sum);
    }
   public static int readNumber(){
       Scanner input=new Scanner(System.in);
       System.out.println("Please enter first number");
       int first=input.nextInt();
       return first;
   }
}
