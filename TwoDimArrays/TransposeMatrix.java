package TwoDimArrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = { {1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3}};
        int res[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
