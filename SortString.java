import java.util.Arrays;

public class SortableArray {
    public static void main(String[] args) {
    	
    	
    	 String[] strArray = {"banana", "apple", "orange", "grape"};
         System.out.println("\nOriginal String Array:");
         printStrArray(strArray);
         Arrays.sort(strArray);
         System.out.println("\nSorted String Array:");
         printStrArray(strArray);
     }
    
    public static void printStrArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    