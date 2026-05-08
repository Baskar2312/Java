import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] chocolates = {7, 3, 2, 4, 9};
        int m = 3; // Number of students
        System.out.println(new ChocolateDistribution().findMinDiff(chocolates, m));
    }
    
    public int findMinDiff(int[] chocolates, int m) {
        if (chocolates == null || chocolates.length == 0 || m <= 0) {
            return -1; // Invalid input
        }
        
        Arrays.sort(chocolates); // Sort the array to find the minimum difference easily
        int minDiff = Integer.MAX_VALUE;
        
        // Traverse the sorted array and find the minimum difference between the first and last chocolate in each group of size m
        for (int i = 0; i + m - 1 < chocolates.length; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}
