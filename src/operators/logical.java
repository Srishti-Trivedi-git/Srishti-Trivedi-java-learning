package operators;
import java.util.Scanner;
public class logical {
    public static void main(String[]args){
         Scanner input=new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.println("please enter your age:");
        int age=input.nextInt();
        System.out.println("are you a female:");
        boolean isFemale=input.nextBoolean();
    if(age<5){
    System.out.println("you got 75% discount.");
} else if (isFemale) {
        System.out.println("you got 50% discount.");
    }else if( age>60 && !isFemale||age<5){
        System.out.println("you got 25% discount");
    }else{
        System.out.println("SORRY!no discount for you today.");
    }
    }
}
