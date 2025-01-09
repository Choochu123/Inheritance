package TwoD_Arrays;

import Utilities.Library;

public class Ex2_TicTacToe {
    public static void run() {

        String[][] tictactoe = new String[3][3];

        setupBoard(tictactoe);

        print2DString(tictactoe);
        System.out.println();

//        tictactoe[0][1] = "X";

//        tictactoe[0][2] = "x";
//        tictactoe[1][1] = "x";
//        tictactoe[2][0] = "x";


        print2DString(tictactoe);
        System.out.println();
        System.out.println("The winner is " + checkWinner(tictactoe));
        System.out.println();

        int moves = 1;
//        //Two Player version
//        while( true ){
//            System.out.println("Enter your row");
//            int row = Library.input.nextInt();
//            System.out.println("Enter your column");
//            int col = Library.input.nextInt();
//
//        if(moves%2 ==0){
//            tictactoe[row][col] = "O";
//        } else {
//            tictactoe[row][col] = "X";
//        }
//
//            moves++;
//            print2DString(tictactoe);
//            String winner = checkWinner(tictactoe);
//            System.out.println("The winner is " + winner);
//            if(!winner.equals("not decided yet!") || moves == 9){
//                break;
//            }
//
//
//        }//while
        while (true) {
            System.out.println("Enter your row");
            int row = Library.input.nextInt();
            System.out.println("Enter your column");
            int col = Library.input.nextInt();
            tictactoe[row][col] = "O";
            moves++;
            print2DString(tictactoe);
            String winner = checkWinner(tictactoe);
            System.out.println("The winner is " + winner);
            if (!winner.equals("not decided yet!") || moves == 9) {
                break;
            }
            getMove(tictactoe);
            moves++;
            print2DString(tictactoe);
            winner = checkWinner(tictactoe);
            System.out.println("The winner is " + winner);
            if (!winner.equals("not decided yet!") || moves == 9) {
                break;
            }
        }//while

    }// run

    public static String checkWinner(String[][] tictactoe) {
        //*** Only works for rows

        // use a for loop to check if a row is a winner
        for (int r = 0; r < tictactoe.length; r++) {
            if (!tictactoe[r][0].equals(" ") && tictactoe[r][0].equals(tictactoe[r][1]) && tictactoe[r][0].equals(tictactoe[r][2])) {
                return tictactoe[r][0];
            }
        }
        //check column
        for (int c = 0; c < tictactoe.length; c++) {
            if (!tictactoe[0][c].equals(" ") && tictactoe[0][c].equals(tictactoe[1][c]) && tictactoe[0][c].equals(tictactoe[2][c])) {
                return tictactoe[0][c];
            }
        }
        //diagonals
        if (!tictactoe[0][0].equals(" ") && tictactoe[0][0].equals(tictactoe[1][1]) && tictactoe[0][0].equals(tictactoe[2][2])) {
            return tictactoe[0][0];
        } else if (!tictactoe[1][1].equals(" ") && tictactoe[1][1].equals(tictactoe[0][2]) && tictactoe[1][1].equals(tictactoe[2][0])) {
            return tictactoe[1][1];
        }


        return "not decided yet!";
    }

    public static void print2DString(String[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print("|" + arr[r][c]);
            }
            System.out.println("|");
        }

    }// print2dString

    public static void setupBoard(String[][] tictactoe) {
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe[r].length; c++) {
                tictactoe[r][c] = " ";
            }
        }
    }// end

    public static void getMove(String[][] tictactoe) {
        if (tictactoe[1][1].equals(" ")) {
            tictactoe[1][1] = "X";
        } else if (tictactoe[0][0].equals(" ")) {
            tictactoe[0][0] = "X";
        } else if (tictactoe[0][2].equals(" ")) {
            tictactoe[0][2] = "X";
        } else if (tictactoe[2][0].equals(" ")) {
            tictactoe[2][0] = "X";
        } else if (tictactoe[2][2].equals(" ")) {
            tictactoe[2][2] = "X";
        }


    }


}
