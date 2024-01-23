package DataStructure.InsertionSort;

public class Main {
    public static void main(String [] args) {
        int array[] = {9,2,3,4,5,8,7,1,6};

        insertionArray(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }
}