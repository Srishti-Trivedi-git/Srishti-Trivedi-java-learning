package methods;
public class MethodsExamples {
    static void print2katable() {
        for(int i=1;i<=10;i++){
            int ans=2*i;
            System.out.println("->"+ans);

        }
    }
    static void printsum(int x ,int y){
        int ans=x*y;
        System.out.println(ans);
    }
    static void printsum (int x ,int y,int w){
        int ans2=x*y+w;
        System.out.println(ans2);}
    public static void main(){
//        print2katable();
        printsum(6,8);
        printsum(7,9,8);
    }
}
//method call stack:lifo.