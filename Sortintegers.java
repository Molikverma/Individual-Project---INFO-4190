import java.util.Arrays;

public class SortableArray {
    public static void main(String[] args) {
        
        int[] intArray = {4, 2, 7, 1, 9, 5};
        System.out.println("Original Integer Array:");
        printIntArray(intArray);
        Arrays.sort(intArray);
        System.out.println("\nSorted Integer Array:");
        printIntArray(intArray);

        public static void printIntArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
