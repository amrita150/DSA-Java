import java.util.Arrays;

class SetMatrixZero {
    /****************************** brute force approach  *********************************/
    public static void setZeroesBruteForce(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int ansMatrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ansMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < col; k++) {
                        ansMatrix[i][k] = 0;
                    }
                    for (int k = 0; k < row; k++) {
                        ansMatrix[k][j] = 0;
                    }
                }
            }
        }

        // In-place update
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = ansMatrix[i][j];
            }
        }
    } //Time Complexity: O((mn)∗(m+n)), Space Complexity: O(mn)


    /****************************** better approach ******************************************/ 
    //in this we only use two 1D arrays
    public static void setZeroesBetterApproach(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int rowArray[] = new int[row];
        int colArray[] = new int[col];
        Arrays.fill(rowArray,1);
        Arrays.fill(colArray,1);

        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(matrix[i][j]==0){
                    rowArray[i] = 0;
                    colArray[j] = 0;
                }
            }
        }

        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(rowArray[i] ==0 || colArray[j] == 0 ){
                    matrix[i][j] = 0;
                }
            }
        }
    } //Time: O(mn), Space: O(m+n)

    /****************************** optimal approach ******************************************/ 
    //we can use the 0th row and 0th column of the given matrix itself instead of using two separate arrays

    public static void setZeroesOptimalApproach(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean setFirstRow = false;
        boolean setFirstCol = false;

        // Check if first row contains zero
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) {
                setFirstRow = true;
                break;
            }
        }

        // Check if first column contains zero
        for (int j = 0; j < row; j++) {
            if (matrix[j][0] == 0) {
                setFirstCol = true;
                break;
            }
        }

        // Mark zeroes in the first row and first column
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark the start of the row
                    matrix[0][j] = 0;  // Mark the start of the column
                }
            }
        }

        // Set zeroes for the rows (based on the first column)
        for (int i = 1; i < row; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set zeroes for the columns (based on the first row)
        for (int i = 1; i < col; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 1; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        // Set first row to zero if necessary
        if (setFirstRow) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }

        // Set first column to zero if necessary
        if (setFirstCol) {
            for (int j = 0; j < row; j++) {
                matrix[j][0] = 0;
            }
        }
    }//Time: O(mn), Space: O(1)

    public static void printMatrix(int matrix[][], int row, int col){
        for(int i =0; i<row;i++){
            for(int j =0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 2, 3},
            {3, 4, 5, 2},
            {0, 2, 0, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix,3,4);

        // setZeroesBruteForce(matrix);
        // setZeroesBetterApproach(matrix);
        setZeroesOptimalApproach(matrix);


        System.out.println("Matrix After setZeroes:");
        printMatrix(matrix,3,4);
    }
}
