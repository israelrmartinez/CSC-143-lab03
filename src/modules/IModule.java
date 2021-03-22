package modules;

import java.util.Arrays;

public class IModule {

    public static int binarySearch(int[] list, int target) {
        int min = 0;
        int max = list.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static  void bubbleSort(int[] list) {
        int n = list.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static boolean contains(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (target == list[i]) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int[] list, int target) {
        if (contains(list, target) == false) {
            return -1;
        }

        for (int i = 0; i < list.length; i++) {
            if (target == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }

    public static int linearSearch(int [] numbers, int key) {
        int i;

        for (i = 0; i < numbers.length; ++i) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    private static void merge(int[] list, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < list.length; i++) {
            if (rightIndex >= right.length || (leftIndex < left.length
                    && left[leftIndex] <= right[rightIndex])) {
                list[i] = left[leftIndex];
                leftIndex++;
            } else {
                list[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] left = Arrays.copyOfRange(list, 0, list.length / 2);
            int[] right = Arrays.copyOfRange(list, list.length / 2, list.length);

            mergeSort(left);
            mergeSort(right);

            merge(list, left, right);
        }
    }

    private static int partition(int[] list, int low, int high) {
        int mid = (low + high) / 2;
        swap(list, low, high);
        int pivotIndex = low;
        int pivotValue = list[high];

        for (int i = low + 1; i <= high; i++) {
            if (list[i] < pivotValue) {
                pivotIndex++;
                swap(list, pivotIndex, i);
            }
        }
        swap(list, low, pivotIndex);

        return pivotIndex;
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int low, int high) {
        if (low < high) {
            int pivotPoint = partition(list, low, high);

            quickSort(list, low, pivotPoint - 1);

            quickSort(list, pivotPoint + 1, high);
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[smallest]) {
                    smallest = j;
                }
            }

            swap(list, i, smallest);
        }
    }

    private static int[] splitFirstHalf(int[] list) {
        return null;
    }

    private static int[] splitSecondHalf(int[] list) {
        return null;
    }

    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

}
