package TwoD_Arrays;

public class Ex3_Sudoku {
    public static void run() {
        int[][] sudoku1 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        }; // fully solved
        int[][] sudoku2 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 9, 7, 9}
        }; // one error
        int[][] sudoku3 = {
                {5, 3, 4, 6, 0, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 0, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 4, 3, 5},
                {3, 4, 5, 2, 0, 6, 1, 7, 9}
        }; // three empty squares, one error

        System.out.println("Sudoku Tester");
        System.out.println();

        int[][] sudoku4 = new int[9][9];

        sudoku3[3][2] = 9;

        printSudoku(sudoku3);

        System.out.println("Testing rows");
        for (int i = 0; i < 9; i++) {
            System.out.println(testRow(sudoku3[i]));

        }
        System.out.println();
        System.out.println("Testing Columns");
        for (int i = 0; i < 9; i++) {
            System.out.println(testCol(sudoku3, i));

        }

    }// run

    public static void printSudoku(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    System.out.print("  ");
                } else{
                    System.out.print(grid[row][col] + " ");
                }
            } // col
            System.out.println();
        } // row
    }// printSudoku

    public static boolean testRow(int[] eachRow){
        for (int i = 0; i < eachRow.length; i++) {
            if(eachRow[i] == 0){
                return false;
            }
            for(int j = i+1; j<eachRow.length; j++){
                if(eachRow[i] == eachRow[j]){
                    return false;
                }
            }
        }
        return true;
    }//testRow

    public static boolean testCol(int[][] grid, int colNum){
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][colNum] == 0){
                return false;
            }
            for (int j = i+1; j < grid.length; j++) {
                if(grid[i][colNum] == grid[j][colNum]){
                    return false;
                }
            }
        }
        return true;
    }//testCol

}//class
