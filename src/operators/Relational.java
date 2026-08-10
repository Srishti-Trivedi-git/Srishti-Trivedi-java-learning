package operators;
import java.util.Scanner;
public class Relational {
    public static void main(String[]args){
     Scanner input= new Scanner(System.in);
        System.out.println("Welcome to DRIVING LICENSE Portal!");
        System.out.println("Please enter your AGE:");
        int age= input.nextInt();
        if(age>=18){
            System.out.println("YOUR ARE ELIGIBLE FOR YOUR DRIVING LICENSE!");
        }else{
            System.out.println("SORRY YOU ARE NOT ELIGIBLE!");
        }
    }
}
