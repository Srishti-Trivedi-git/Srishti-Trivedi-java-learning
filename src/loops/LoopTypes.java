package loops;
import java.util.Scanner;
public class LoopTypes {
    public static void main(String[]args){
        int num=1;
        while(num<=10){
            System.out.println(num);
            num= num+1;
        }
        int count=500;
                while(count>=200){
                    System.out.println(count);
                    count =count-1;

                }
                Scanner input=new Scanner(System.in);
                int i=0;
                while(i<=10){
                    int inp=input.nextInt();
                    System.out.println("number:"+inp);
                    i=i+1;

                }
        // For Loop
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("The value of i is: " + i);
//        }
//        // Do-While Loop
//
//        int i = 1;
//
//        do {
//            System.out.println("The value of i is: " + i);
//            i++;
//        } while (i <= 10);
    }


}
