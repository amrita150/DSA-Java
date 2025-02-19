public class MatrixTranspose {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Get the transpose of the matrix
        int[][] transpose = transposeMatrix(matrix);
        
        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }
}
