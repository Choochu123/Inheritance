package TwoD_Arrays;

import Utilities.Library;

public class As2_Vigenere {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void run() {
        char[] key = {'S', 'C', 'O', 'N', 'A'};
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);
        System.out.println(getChar(vigenere, 0,0));
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];

        int addRow = 0;
        for (int i = 0; i < alphabet.length; i++) {

            for (int j = 0; j < alphabet.length; j++) {
                if (j + addRow < 26) {
                    square[i][j] = alphabet[j + addRow];
                } else {
                    square[i][j] = alphabet[j + addRow - 26];
                }
            }
            addRow++;
        }
//code to be written

        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {
        System.out.print("  ");
        for (int i = 0; i < square.length; i++) {
            System.out.print(ANSI_YELLOW + square[i][0] + ANSI_RESET + " ");
        }
        System.out.println();

        for (int i = 0; i < square.length; i++) {
            System.out.print(ANSI_YELLOW + square[i][0] + ANSI_RESET + " ");
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }//end printSquare

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    public static char getChar(char[][] square, int rowNum, int colNum) {
        return square[rowNum][colNum];
    }

//    public static void decrypt(String crypt, char[] key, char[][] square){
//        char[] c = crypt.toCharArray();
//
//
//    }//decrypt

}//end class

