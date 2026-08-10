package arrays;

public class TwoDarray {
    public static void main(String[]args){
        int[][]arr;
        arr=new int[3][4];
        int[][] brr={
                {4,5},
                {6,7,89,7,6,5,7,},
                {8,9,6,7,9,9,7},
                {8,4},
                {2,23}
        };
        int rowlength=brr.length;

        for(int row=0;row<=rowlength-1;row++){
            int collength=brr[row].length;
            for(int col=0;col<=collength-1;col++){
                System.out.print(brr[row][col]);
            }
        }
        int[][]arr2;
        arr=new int[3][4];
        int[][] brr2={
                {4,5},
                {6,7},
                {8,9},
                {8,4},
                {2,23}
        };
        int rowlength2=brr.length;

        for(int row=0;row<=rowlength2-1;row++){
            int collength2=brr[row].length;
            for(int col=0;col<=collength2-1;col++){
                System.out.print(brr[row][col]);
            }
        }
    }


}
