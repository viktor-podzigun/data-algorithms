package algorithms.array;

public class ArrayUtil {

    public static void print(int[] arr) {
        print(arr, 0, arr.length);
    }
    
    public static void print(int[] arr, int offset, int length) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = offset, until = offset + length - 1; i <= until; i++) {
            if (i > offset) {
                sb.append(", ");
            }
            
            sb.append(arr[i]);
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
}
