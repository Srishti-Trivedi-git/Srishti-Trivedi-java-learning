package basicMaths;

public class PrimeNumber {
    static int ReverseNumber(int num) {
        int revnum = 0;
        while (num != 0) {
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num = num / 10;

        }
        return revnum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversednum = ReverseNumber(num);
        if (originalNum == reversednum) {
            System.out.println("it is palindrome.");
            return true;
        } else {
            System.out.println("it is not a palindrome.");
            return false;
        }

    }
static boolean isprimeornot(int num){
        for (int i=2;i<=num;i++){
            if(num%i==0){
             return false;
            }
        }
        return true;
}
    public static void main(String[] args) {
        boolean ans = isPalindrome(123);
        System.out.println(ans);
    }
}
