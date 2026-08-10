package strings;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[]args){
//        input
        Scanner sc=new Scanner(System.in);
        System.out.println("provide the string content");
        String str=sc.nextLine();
        System.out.println("value"+" " +str);
          String str2=sc.next();
        System.out.println("value of new:"+str2);
//        string
        String firstName="srishti";
        String lastName="trivedi";
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(5));
//        comparision
        String name1="qwerty";
        String name2="qwerty";
        if(name1==name2){
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are not equal");
        }
//        using .equals().
        String name3="QWERTY";
        String name4="qwerty";
        if(name3.equals(name4)){
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are not equal");
        }
//        using .equalsIgnoreCase()
        String name5="qwerty";
        String name6="QWERTY";
        if(name5.equalsIgnoreCase(name6)){
            System.out.println("they are equal");
        }
        else {
            System.out.println("they are not equal");
        }
    }
}
