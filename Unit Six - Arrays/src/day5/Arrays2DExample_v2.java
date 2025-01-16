package day5;

public class Arrays2DExample_v2 {
    public static void main(String[] args) {
        int[][] nums = new int[5][3];

        nums[2] = new int[7];

        print2DArray(nums);
        System.out.println();
        System.out.println();

        print1DArray(nums[0]);
    }

    private static void print1DArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static void print2DArray(int[][] arr2D) {
        // for (int i = 0; i < arr2D.length; i++) {
        //     System.out.println();
        //     for (int el : arr2D[i]) {
        //         System.out.print(el + " ");
        //     }
        // }

        for (int[] row : arr2D) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
