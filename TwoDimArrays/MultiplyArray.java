package TwoDimArrays;

public class MultiplyArray {
    public static void main(String[] args) {
        int A[][] = {{1, 1, 1}, {2, 2, 2}};
        int B[][] = {{3, 4}, {3, 4}, {3, 4}};

        // Number of rows in A
        int rowsA = A.length;
        // Number of columns in A / rows in B
        int colsA = A[0].length;
        // Number of columns in B
        int colsB = B[0].length;

        // Resultant matrix
        int res[][] = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
