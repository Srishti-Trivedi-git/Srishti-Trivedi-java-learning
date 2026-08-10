package strings;

public class StringMethods {

        public static void main(String[] args) {

            String str = "srishti trivedi";

            // length()
            System.out.println("Length: " + str.length());

            //  charAt()
            System.out.println("Character at index 1: " + str.charAt(1));

            // substring()
            System.out.println("Substring: " + str.substring(0, 5));

            // contains()
            System.out.println("Contains 'World': " + str.contains("World"));

            // toUpperCase()
            System.out.println("Uppercase: " + str.toUpperCase());

            //toLowerCase()
            System.out.println("Lowercase: " + str.toLowerCase());

            //split()
            String fruits = "Apple,Banana,Mango";
            String[] fruitArray = fruits.split(",");

            System.out.println("Split:");
            for (String fruit : fruitArray) {
                System.out.println(fruit);
            }

            // startsWith()
            System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
            // endsWith()
            System.out.println("Ends with 'World': " + str.endsWith("World"));

            // valueOf()
            int number = 100;
            String numberString = String.valueOf(number);

            System.out.println("ValueOf: " + numberString);

            // toCharArray()
            char[] characters = str.toCharArray();

            System.out.println("To Character Array:");
            for (char ch : characters) {
                System.out.println(ch);
            }

            // isEmpty()
            String emptyString = "";
            System.out.println("Is empty: " + emptyString.isEmpty());

            // isBlank()
            String blankString = "   ";
            System.out.println("Is blank: " + blankString.isBlank());
            // replace()
            String replacedString = str.replace("World", "Java");
            System.out.println("Replace: " + replacedString);
        }
    }

