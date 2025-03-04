import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TO GET MATRIX USER INPUT.
//        System.out.print("Enter the number of rows: ");
//        int m = sc.nextInt();
//        System.out.print("Enter the number of columns: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements of the matrix:");
//        int[][] arr = new int[m][n];
//        createMatrix(m, n, arr, sc);
//        printMatrix(m, n, arr);

        // MATRIX MULTIPLICATION.
        System.out.print("Enter the number of rows for first matrix: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the number of columns for first matrix: ");
        int n1 = sc.nextInt();
        int arr1[][] = new int[m1][n1];

        System.out.println("Enter the elements of the first matrix:");
        createMatrix(m1, n1, arr1, sc);

        System.out.print("Enter the number of rows for second matrix: ");
        int m2 = sc.nextInt();
        System.out.print("Enter the number of columns for second matrix: ");
        int n2 = sc.nextInt();
        int arr2[][] = new int[m2][n2];

        System.out.println("Enter the elements of the second matrix:");
        createMatrix(m2, n2, arr2, sc);

        if (n1 != m2) {
            System.out.println("Matrix multiplication is not possible (columns of first matrix must match rows of second matrix).");
            return;
        }

        int result[][] = new int[m1][n2];
        matrixMultiply(m1, n1, arr1, m2, n2, arr2, result);
        printMatrix(m1, n2, result);
    }

    private static void matrixMultiply(int m1, int n1, int[][] arr1, int m2, int n2, int[][] arr2, int[][] result) {
        for (int i = 0; i < m1; i++) { // Iterates through rows of matrix A (i=0 to depends on result array)
            for (int j = 0; j < n2; j++) { // Iterates through columns of matrix B (j=0 to depends on result array)
                for (int k = 0; k < n1; k++) { // Iterates through columns of A / rows of B (k=0 to 2)
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }


    private static void printMatrix(int m, int n, int[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void createMatrix(int m, int n, int[][] arr, Scanner sc) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
