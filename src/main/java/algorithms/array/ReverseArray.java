package algorithms.array;

public class ReverseArray {
    
    public static int[] reverse(int[] arr) {
        return reverse(arr, 0, arr.length);
    }
    
    public static int[] reverse(int[] arr, int offset, int length) {
        for (int i = offset, j = offset + length - 1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            //ArrayUtil.print(arr);
        }
        
        return arr;
    }
}
