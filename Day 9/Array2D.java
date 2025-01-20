public class Array2D {
    public static void printArr(int matrix[][], int row, int col){
        for(int i =0; i<row;i++){
            for(int j =0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][], int row, int col, int key){
        for(int i = 0; i<row; i++){
            for(int j =0; j<col; j++){
                if(matrix[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i =0; i<row;i++){
            for(int j =0; j<col; j++){
                matrix[i][j] = 2  + (i*j);
            }
        }

        printArr(matrix, row, col);
        System.out.println(search(matrix, row, col, 6));
    }
}
