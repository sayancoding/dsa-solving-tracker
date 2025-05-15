package Utils;

import java.util.Scanner;

import java.util.*;

public class InputOutputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    // Read a single integer
    public static int readInt() {
        return scanner.nextInt();
    }

    // Read a single line
    public static String readString() {
        scanner.nextLine(); // consume leftover newline
        return scanner.nextLine();
    }

    // Read an array of integers
    public static int[] readIntArray() {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Read an array of strings
    public static String[] readStringArray() {
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        return arr;
    }

    // Read a 2D integer matrix
    public static int[][] readIntMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Print integer array
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Print 2D integer array
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Print list
    public static <T> void printList(List<T> list) {
        System.out.println(list.toString());
    }

    // Close the scanner (optional for some environments)
    public static void closeScanner() {
        scanner.close();
    }
}
