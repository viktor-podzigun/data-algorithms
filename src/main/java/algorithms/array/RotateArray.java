package algorithms.array;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        run(System.in, System.out);
    }
    
    public static void run(InputStream in, OutputStream out) {
        PrintStream printer = new PrintStream(out, true);
        
        Scanner scanner = new Scanner(in);
        int t = scanner.nextInt();
        while (t > 0) {
            t--;
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            rotate(arr, d);
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    printer.print(" ");
                }
                printer.print(arr[i]);
            }
            printer.println();
        }
    }
    
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
