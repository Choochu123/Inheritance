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
            int number = myRandom(1, 75);
            System.out.println("The number chosen is: " + number);

                for (int i = 0; i < scorecard.length; i++) {
                    for (int j = 0; j < scorecard.length; j++) {
                        if (scorecard[i][j] == number) {
                            scorecard[i][j] = scorecard[i][j] * -1;
                        }
                    }
                }

            printCard(scorecard);
            if (testCol(scorecard)) {
                System.out.println("Congrats you win!");
                break;
            } else if (testRow(scorecard)) {
                System.out.println("Congrats you win!");
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

    public static boolean testRow(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int negative = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    negative += 1;
                }
            }
            if (negative == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean testCol(int[][] arr) {
        int colNum = 0;
        for (int i = 0; i < 4; i++) {
            int negative = 0;
            colNum += 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][colNum] < 0) {
                    negative += 1;
                }
            }
            if (negative == 5) {
                return true;
            }
        }
        return false;
    }


}//class