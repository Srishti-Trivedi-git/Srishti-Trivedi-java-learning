package basicMaths;

public class ArmstrongNumber {
    static boolean AmsNumber(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            int cubedigit = digit * digit * digit;
            sum = sum + cubedigit;
            num = num / 10;
        }
        if (sum == originalNum) {
            System.out.println("it is armstrong");
            return true;
        } else {
            System.out.println("it is not armstrong");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(ArmstrongNumber.AmsNumber(153));
    }
}


