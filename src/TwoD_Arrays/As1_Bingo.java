package TwoD_Arrays;

import Utilities.Library;

public class As1_Bingo {
    public static void run() {
        char[] sidewaysBingo = new char[]{'B', 'I', 'N', 'G', 'O'};

    }//run

    public static int[] generateArray(int arrLength, int minVal, int maxVal) {
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = Library.myRandom(minVal, maxVal);
        }
        return arr;
    }//generateArray

    public static void createGrid(int[][] grid) {
        for (int row = 0; row < 5; row++) {

            if(row == 0){
                generateArray(5,1,15);
                }
            if(row == 1){
                generateArray(5,16,30);
            }
            if(row == 2){
                generateArray(5,31,45);
            }
            if(row == 3){
                generateArray(5,46,60);
            }
            if(row == 4){
                generateArray(5,61,75);
            }
        }
    }//createGrid


}//class
