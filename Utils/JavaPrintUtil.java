package Utils;

import java.util.Collection;

public class JavaPrintUtil {
    public static <T> void display(T[] array) {
        System.out.print("\n[ ");
        for (T element : array) {
            System.out.print(element + " , ");
        }
        System.out.print(" ]\n");
    }
    public static <T> void display(Collection<T> collection) {
        System.out.println(collection);   
    }

    public static <T> void display(T t){
        System.out.println(t);
    }
}
