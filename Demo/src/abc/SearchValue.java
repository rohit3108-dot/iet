
package abc;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define an array of integers
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println("Enter a value to search in the array:");
        int valueToSearch = sc.nextInt();
        
        // Call the search method and store the result
        int index = linearSearch(array, valueToSearch);
        
        // Display the result
        if (index != -1) {
            System.out.println("Value " + valueToSearch + " found at index: " + index);
        } else {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }
        
        sc.close();
    }
    
    // Method to perform linear search
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }
}
