package DataStructure.QuickSort;

public class Main {
    public static void main(String [] args) {
        int[] array = {9,1,4,5,6,7,8,3,2,};

        quickSort(array, 0, array.length  - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end < start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        i++;
        int tmp = array[i];
        array[i] = array[end];
        array[end] = tmp;
        return i;
    }
}
