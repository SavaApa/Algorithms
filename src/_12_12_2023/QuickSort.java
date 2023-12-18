package _12_12_2023;

public class QuickSort {
    public static void main(String[] args) {
        char[] testArray = {'p', 'o', 'i', 'u', 'y', 't', 'r', 'e', 'w', 'q', 'l', 'k', 'j', 'h', 'g', 'f', 'd', 's', 'a', 'm', 'n', 'b', 'v', 'c', 'x', 'z' };
        quickSort(testArray, 0, testArray.length - 1);
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = Character.toUpperCase(testArray[i]);
        }
        System.out.println(testArray);

    }

    public static void swap(char[] array, int first, int second) {
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int partition(char[] array, int start, int end) {
        int pivot = array[end];
        int indexPivot = start;
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, indexPivot);
                indexPivot++;
            }

        }
        swap(array, end, indexPivot);
        return indexPivot;
    }

    public static void quickSort(char[] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }
}


