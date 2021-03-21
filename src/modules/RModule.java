package modules;

public class RModule {

    public static int binarySearch(int[] list, int target) {
        return binarySearch(list, target, 0, list.length - 1);
    }

    private static int binarySearch(int[] list, int target, int min, int max) {
        if (min > max) {
            return - 1;
        } else {
            int mid = (max + min) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                return binarySearch(list, target, mid + 1, max);
            } else {
                return binarySearch(list, target, min, mid - 1);
            }
        }
    }

    public static void selectionSort(int[] list) {
        selectionSort(list, 0);
    }

    private static void selectionSort(int[] list, int start) {
        int min = start;
        for (int j = min + 1; j < list.length; j++) {
            if (list[j] < list[min]) {
                min = j;
            }
        }
        swap(list, start, min);
        if (start + 1 < list.length) {
            selectionSort(list, start + 1);
        }
    }

    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

}
