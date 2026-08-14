package basicMaths;

public class PrintDigits {
    static void printDigits(int num){
        while(num!=0){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;

        }
    }
    public static void main(String[]args){
int num= 12345678;
printDigits(num);
    }
}
