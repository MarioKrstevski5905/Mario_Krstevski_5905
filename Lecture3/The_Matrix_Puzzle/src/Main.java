public class Main {
    public static void main(String[] args) {

        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber % 2 == 0) {
                    matrix[i][j] = 'O';
                } else {
                    matrix[i][j] = 'X';
                }
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        boolean xWins = false;
        boolean oWins = false;
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                if (matrix[i][0] == 'X') {
                    xWins = true;
                } else if (matrix[i][0] == 'O') {
                    oWins = true;
                }
            }
            if (matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
                if (matrix[0][i] == 'X') {
                    xWins = true;
                } else if (matrix[0][i] == 'O') {
                    oWins = true;
                }
            }
        }
        if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
            if (matrix[0][0] == 'X') {
                xWins = true;
            } else if (matrix[0][0] == 'O') {
                oWins = true;
            }
        }
        if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            if (matrix[0][2] == 'X') {
                xWins = true;
            } else if (matrix[0][2] == 'O') {
                oWins = true;
            }
        }
        if (xWins) {
            System.out.println("'X' wins!");
        } else if (oWins) {
            System.out.println("'O' wins!");
        } else {
            System.out.println("There is no winner.");
        }
    }
}