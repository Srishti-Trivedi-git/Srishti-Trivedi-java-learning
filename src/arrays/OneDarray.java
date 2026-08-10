package arrays;

import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {


        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++)

        {
            System.out.println("provide input for index" + i);
            arr[i] = sc.nextInt();
        }
    }
}
//    public static void main(String[] args) {
//        int arr[];
//        arr = new int[5];
//        int brr[] = {12, 34, 345};
//
//        System.out.println(brr[2]);
//        int n = brr.length;
//        for (int index = 0; index <= n - 1; index++) {
//            System.out.println(brr[index]);
//        }
//    }
//}