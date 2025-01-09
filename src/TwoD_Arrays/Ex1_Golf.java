package TwoD_Arrays;

public class Ex1_Golf {

    public static void run() {
        String[] names = {"Joe", "Serena", "Gill", "Stu"};

        int[][] scorecard = new int[4][18];

        scorecard[0][0] = 4;
        scorecard[1][0] = 5;
        scorecard[2][0] = 6;
        scorecard[3][0] = 7;

        scorecard[0][1] = 5;
        scorecard[1][1] = 5;
        scorecard[2][1] = 8;
        scorecard[3][1] = 9;


        for (int row = 0; row < scorecard.length; row++) {
            int totalScore = 0;
            for (int col = 0; col < scorecard[row].length; col++) {
                System.out.print(scorecard[row][col] + "  ");
                totalScore += scorecard[row][col];
            }
            System.out.println("  " + names[row] + ":  " + totalScore);
        }
        for(int col = 0; col<18; col++){
            int holeTotal = 0;
            for (int row = 0; row < scorecard.length; row++){
                holeTotal += scorecard[row][col];
            }
            System.out.print(holeTotal + " ");
        }


    }//run
}
