package challenges;
import java.util.Scanner;
public class Temperature {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to Temperature converter");
        System.out.println("Enter your Temperature in F:");
        float Fah=input.nextFloat();
        float cel= (Fah-32)*5/9;
        System.out.println("Your temperature is:"+cel+"C");


    }
}
