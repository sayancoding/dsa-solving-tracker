package Utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaInputUtil {
    static Scanner sc = new Scanner(System.in);

    public static <T> T[] inputArray(Class<T> type) {

        System.out.print("\nArray length : ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create an array of the specified type
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(type, n);

        System.out.println("Enter " + n + " elements of type " + type.getSimpleName() + ":");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            try {
                // Convert input to the specified type
                if (type == Integer.class) {
                    array[i] = type.cast(Integer.parseInt(input));
                } else if (type == Double.class) {
                    array[i] = type.cast(Double.parseDouble(input));
                } else if (type == String.class) {
                    array[i] = type.cast(input);
                } else {
                    throw new IllegalArgumentException("Unsupported type: " + type.getSimpleName());
                }
            } catch (Exception e) {
                System.out.println("Invalid input for type " + type.getSimpleName() + ". Try again.");
                i--; // Retry the current index
            }
        }
        return array;

    }

    public static <T> ArrayList<T> inputArrayList(Class<T> type) {
        System.out.print("\nNumber of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        ArrayList<T> list = new ArrayList<>();

        System.out.println("Enter " + n + " elements of type " + type.getSimpleName() + ":");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            try {
                // Convert input to the specified type
                if (type == Integer.class) {
                    list.add(type.cast(Integer.parseInt(input)));
                } else if (type == Double.class) {
                    list.add(type.cast(Double.parseDouble(input)));
                } else if (type == String.class) {
                    list.add(type.cast(input));
                } else {
                    throw new IllegalArgumentException("Unsupported type: " + type.getSimpleName());
                }
            } catch (Exception e) {
                System.out.println("Invalid input for type " + type.getSimpleName() + ". Try again.");
                i--; // Retry the current index
            }
        }
        return list;
    }

    public static <T> T input(Class<T> type) {
    System.out.print("Enter a value of type " + type.getSimpleName() + ": ");
    while (true) {
        String input = sc.nextLine();
        try {
            // Convert input to the specified type
            if (type == Integer.class) {
                return type.cast(Integer.parseInt(input));
            } else if (type == Double.class) {
                return type.cast(Double.parseDouble(input));
            } else if (type == String.class) {
                return type.cast(input);
            } else {
                throw new IllegalArgumentException("Unsupported type: " + type.getSimpleName());
            }
        } catch (Exception e) {
            System.out.println("Invalid input for type " + type.getSimpleName() + ". Try again.");
        }
    }
}

}
