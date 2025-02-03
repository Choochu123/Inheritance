package TwoD_Arrays;

import Utilities.Library;

import static Utilities.Library.generateArray;
import static Utilities.Library.myRandom;

public class As1_Bingo {
    public static char[] sidewaysBingo = new char[]{'B', 'I', 'N', 'G', 'O'};

    public static void run() {

        int[][] scorecard = new int[5][5];
        boolean isWin = false;

        scorecard[0] = generateArray(5, 1, 15);
        scorecard[1] = generateArray(5, 16, 30);
        scorecard[2] = generateArray(5, 31, 45);
        scorecard[3] = generateArray(5, 46, 60);
        scorecard[4] = generateArray(5, 61, 75);

        printCard(scorecard);

        while (true) {
            Library.input.nextLine();
            int number = myRandom(1, 1);
            System.out.println("The number chosen is: " + number);

            for (int i = 0; i < scorecard.length; i++) {
                for (int j = 0; j < scorecard.length; j++) {
                    if(scorecard[i][j] == number){
                        scorecard[i][j] = scorecard[i][j] * -1;
                    }
                }
            }
            printCard(scorecard);
            boolean colTest = true, rowTest = true;

            for (int i = 0; i < scorecard.length; i++) {
                colTest = testCol(scorecard, i);
                rowTest = testRow(scorecard, i);
            }
            if(!colTest || !rowTest){
                System.out.println("Congrats, you win!");
                break;
            }

        }//while

    }//run

    public static void printCard(int[][] card) {
        for (int row = 0; row < 5; row++) {
            System.out.print(sidewaysBingo[row] + ": ");
            for (int col = 0; col < 5; col++) {
                if (card[row][col] < 10 && card[row][col] > 0) {
                    System.out.print(card[row][col] + "  ");
                } else {
                    System.out.print(card[row][col] + " ");
                }
            } // col
            System.out.println();
        } // row
    }// printSudoku

    public static boolean testRow(int[][] grid, int eachRow){
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][eachRow] < 0){
                return false;
            }
        }
        return true;
    }//testRow

    public static boolean testCol(int[][] grid, int colNum){
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][colNum] < 0){
                return false;
            }
        }
        return true;
    }//testCol


}//class
