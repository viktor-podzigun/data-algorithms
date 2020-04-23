package algorithms.array;

public class ArrayUtil {

    public static void print(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            
            sb.append(arr[i]);
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
}
