package algorithms.array;

public class RotateArray {
    
    public static int[] rotate(int[] arr, int n) {
        if (arr.length > 0) {
            int d = n % arr.length;

            ReverseArray.reverse(arr, 0, d);
            //ArrayUtil.print(arr);
            
            ReverseArray.reverse(arr, d, arr.length - d);
            //ArrayUtil.print(arr);
            
            ReverseArray.reverse(arr);
            //ArrayUtil.print(arr);
        }
        
        return arr;
    }
}
