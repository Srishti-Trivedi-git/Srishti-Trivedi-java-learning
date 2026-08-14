package basicMaths;

public class SumOfNumbers {
    static int SumOfNumbers(int num){
        int sum=0;

        while(num!=0) {
            int digit = num % 10;
            sum=sum+digit;

            num = num / 10;

        }
        return sum;
    }
    public static void  main(String[]args){
        int num =123456;
        int sum=SumOfNumbers(num);
        System.out.println(sum);
    }
}
