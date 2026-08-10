package challenges;

import java.util.Scanner;
public class Userinput {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=input.nextLine();
        System.out.println("good morning "+ name);
        System.out.println(name + " Also tell me your age :");
        int age= input.nextInt();
        System.out.println("your age is :"+age);
    }
}
