import java.util.Arrays;

public class SortableArray {
    public static void main(String[] args) {
        
        int[] intArray = {4, 2, 7, 1, 9, 5};
        System.out.println("Original Integer Array:");
        printIntArray(intArray);
        Arrays.sort(intArray);
        System.out.println("\nSorted Integer Array:");
        printIntArray(intArray);

        
        String[] strArray = {"banana", "apple", "orange", "grape"};
        System.out.println("\nOriginal String Array:");
        printStrArray(strArray);
        Arrays.sort(strArray);
        System.out.println("\nSorted String Array:");
        printStrArray(strArray);
    }

    public static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printStrArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}