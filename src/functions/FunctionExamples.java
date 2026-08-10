package functions;
public class FunctionExamples {
    public static void main(String[]args) {
        greeting();
        firstPattern();
        secondPattern();
        thirdPattern();
    }
        public static void firstPattern() {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
        }
    public static void secondPattern() {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
    public static void thirdPattern(){
        System.out.println("     *");
        System.out.println("    **");
        System.out.println("   ***");
        System.out.println("  ****");
        System.out.println(" *****");


    }
    public static void greeting(){
        System.out.println("good morning");
    }
}
