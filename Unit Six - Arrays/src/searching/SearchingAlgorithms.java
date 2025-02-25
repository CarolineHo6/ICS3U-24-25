package searching;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[25];

        populateArr(arr, 1, 100);

        print(arr);

        int index = linearSearch(arr, 23);
        System.out.println(index);

        Arrays.sort(arr);
        print(arr);

        index = binarySearch(arr, 23);
        System.out.println(index);
        System.out.println();

        index = binarySearch(arr, 23, 0, arr.length - 1);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int findMe) {
        int min = 0, max = arr.length - 1;

        while (min < max) {
            int mid = (min + max) / 2;
            if (arr[mid] == findMe) {
                return mid;
            } else if (arr[mid] > findMe) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int findMe, int min, int max) {
        int mid = (min + max) / 2;
        if (min > max) {
            return -1;
        }
        if (arr[mid] == findMe) {
            return mid;
        } else if (arr[mid] > findMe) {
            return binarySearch(arr, findMe, min, mid-1);
        } else {
            return binarySearch(arr, findMe, min+1, max);
        }
    }

    private static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void populateArr(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
    }
}
