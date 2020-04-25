package algorithms.array;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {
        run(System.in, System.out);
    }
    
    public static void run(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        PrintStream printer = new PrintStream(out, true);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }

            printer.println(n - sum);
        }
    }
}
