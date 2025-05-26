package TwoDimArrays;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mat2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        System.out.println(Arrays.deepToString(add(mat1, mat2)));
    }

    static int[][] add(int mat1[][], int mat2[][]) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            return new int[0][0];
        }
        int add[][] = new int[mat1.length][mat1[0].length];// row,col
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return add;
    }
}
