package basicMaths;

public class LcmOfNumber {
    static int getGCD(int a,int b){
//        gcd(a,b)=gcd(b,a%b)
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int ans=a;
        return ans;
    }
    static int getLcm(int a,int b){
        int gcd=getGCD(a,b);
                int prod=a*b;
        int lcm=prod/gcd;
        return lcm;
    }


    public static void main(String[]args){
        System.out.println(getLcm(12,18));
    }
}
