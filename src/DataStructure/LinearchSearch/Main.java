package DataStructure.LinearchSearch;

public class Main {
    public static void main(String []args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int invalid = -1;

        int index = linearSearch(array, 5);

        if (index != invalid) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
