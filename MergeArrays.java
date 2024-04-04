import java.util.Arrays;

public class MergeArrays {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        // Pointer for last element in X
        int xIndex = m - 1;

        // Pointer for next vacant cell in X
        int vacantIndex = 0;

        // Merge arrays while elements in Y are remaining
        for (int yIndex = 0; yIndex < n; yIndex++) {
            // Find next vacant cell in X
            while (vacantIndex < m && X[vacantIndex] != 0) {
                vacantIndex++;
            }

            // If no vacant cell found, break the loop
            if (vacantIndex >= m) {
                break;
            }

            // Replace vacant cell with element from Y
            X[vacantIndex++] = Y[yIndex];
        }

        // Sort the merged array
        Arrays.sort(X);
    }

    public static void printArray(int[] X) {
        int m = X.length;
        for (int i = 0; i < m; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        mergeArrays(X, Y);
        printArray(X);
    }
}