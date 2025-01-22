package day5;

public class Arrays2DExample_v2 {
    public static void main(String[] args) {
        int[][] nums = new int[5][3];
        populate2DArray(nums);
        print2DArray(nums);
        System.out.println();
        // System.out.println();

        // print1DArray(nums[0]);

        int[] sumRow = arrRowSum(nums);
        print1DArray(sumRow);

        System.out.println("");

        int sum = sumCol(nums, 1);

        System.out.println(sum);

        int[] sumCols = arrrColSUm(nums);
        print1DArray(sumCols);;
    }

    private static int[] arrrColSUm(int[][] arr2D) {
        int[] result = new int[arr2D[0].length];
        for (int i = 0; i < result.length; i++) {
            result[i] = sumCol(arr2D, i);
        }
        return result;
    }

    private static int sumCol(int[][] arr2D, int col) {
        int sum = 0;
        for (int[] row : arr2D) {
            sum += row[col];
        }

        return sum;
    }

    private static int[] arrRowSum(int[][] arr2D) {
        int[] result = new int[arr2D.length];

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                result[i] += arr2D[i][j];
            }
        }
        return result;
    }

    private static void populate2DArray(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = (int) ((Math.random() * 10) + 1);
            }
        }
    }

    private static void print1DArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static void print2DArray(int[][] arr2D) {
        // for (int i = 0; i < arr2D.length; i++) {
        // System.out.println();
        // for (int el : arr2D[i]) {
        // System.out.print(el + " ");
        // }
        // }

        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
