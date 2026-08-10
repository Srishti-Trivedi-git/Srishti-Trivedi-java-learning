package basics;

public class Patterns {
    public static void main (String[]args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
class righthandpatterns extends Patterns {
    public static void main(String[]args){
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}
class lefthandpatterns extends Patterns {
    public static void main(String[]args){
        System.out.println("     *");
        System.out.println("    **");
        System.out.println("   ***");
        System.out.println("  ****");
        System.out.println(" *****");
    }
}