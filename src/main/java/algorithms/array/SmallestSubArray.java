package algorithms.array;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SmallestSubArray {

    public static void main(String[] args) {
        run(System.in, System.out);
    }
    
    public static void run(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        PrintStream printer = new PrintStream(out, true);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int x = n;
            for (int i = 0; i < n; i++) {
                int sum = arr[i];
                for (int j = i + 1; j <= n; j++) {
                    if (sum > d) {
                        int len = j - i;
                        if (len < x) {
                            x = len;
                            //ArrayUtil.print(arr, i, len);
                            //System.out.println("i: " + i + ", j: " + j + ", x: " + x);
                        }
                        break;
                    }

                    if (j < n) {
                        sum += arr[j];
                    }
                }
            }
            
            printer.println(x);
        }
    }
}
