package searching;

public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] num = new int[12];

        fill(arr);
        print(arr);
        System.out.println();
        selectionSort(arr);
        print(arr);
        System.out.println();

        fill(num);
        print(num);
        System.out.println();
        insertionSort(num);
        print(num);
        System.out.println();

        System.out.println(linearSearch(arr, 12));
        System.out.println(binarySearch(arr, 19));
        System.out.println(binarySearch(arr, 18, 0, arr.length));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    private static void insertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int temp = num[i];
            int j = i;
            while (j >= 0 && num[j - 1] > temp) {
                num[j] = num[j - 1];
                j--;
            }
            num[j] = temp;
        }
    }

    private static int binarySearch(int[] arr, int find, int min, int max) {
        int mid = (min + max) / 2;

        if (arr[mid] == find) {
            return mid;
        } else if (arr[mid] > find) {
            return binarySearch(arr, find, mid + 1, max);
        } else {
            return binarySearch(arr, find, min, mid - 1);
        }
    }

    private static int binarySearch(int[] arr, int find) {
        int min = 0, max = arr.length;

        while (min < max) {
            int mid = (min + max) / 2;
            if (arr[mid] == find) {
                return mid;
            } else if (arr[mid] > find) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int find) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == find) {
                return j;
            }
        }
        return -1;
    }

    // private static void insertionSort(int[] num) {
    // for (int i = 1; i < num.length; i++) {
    // int min = num[i];
    // int j = i;
    // while (j >= 0 && num[j - 1] > min) {
    // num[j] = num[j - 1];
    // j--;
    // }
    // num[j] = min;

    // }
    // }

    // private static void selectionSort(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int min = 0;

    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < arr[min]) {
    // min = j;
    // }
    // }

    // int temp = arr[i];
    // arr[i] = arr[min];
    // arr[min] = temp;
    // }
    // }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
    }
}
