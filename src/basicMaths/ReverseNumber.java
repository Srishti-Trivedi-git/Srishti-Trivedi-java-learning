package basicMaths;

public class ReverseNumber {
    static int ReverseNumber(int num) {
        int revnum = 0;
        while (num !=0){
     int digit=num%10;
    revnum=revnum*10+digit;
    num=num/10;

        }
        return revnum;
    }

    public static void main(String[]args){
        int num=1232;
        int revnum=ReverseNumber(num);
        System.out.println(revnum);
    }
}
