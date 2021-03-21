package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciTest {
    public static int call;

    public static long fib(int n) {
        //TODO : COMPLETE BODY OF RECURSIVE METHOD
        call++;

        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static long mfib(int n) {
        //TODO : COMPLETE BODY OF RECURSION WITH MEMOIZATION
        long[] sequence = new long[n + 1];

        for (int i = 0; i < sequence.length; i++) {
            if (i <= 1) {
                sequence[i] = i;
            } else {
                sequence[i] = -1;
            }
        }

        if (n > 1) {
            memo(n, sequence);
        }

        return sequence[n];
    }

    private static long memo(int n, long[] x) {
        //TODO : COMPLETE BODY OF HELPER METHOD
        call++;
        if (n < 0) {
            return 0;
        }
        if (x[n] != -1) {
            return x[n];
        }
        x[n] = memo(n - 1, x) + memo(n - 2, x);
        return x[n];
    }

    public static long ifib(int n) {
        //TODO : COMPLETE BODY OF ITERATIVE METHOD
        long[] sequence = new long[n + 1];

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                sequence[i] = i;
            } else {
                sequence[i] = -1;
            }
        }

        if (n <= 1) {
            return sequence[n];
        }
        for (int i = 2; i <= n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence[n];
    }

    public static void testRecursive(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
    }

    public static void testMemoization(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(mfib(i) + "\t");
        }
        System.out.println();
    }
    public static void testIterative(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(ifib(i) + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("fib number: " + fib(8));
        System.out.println("fib number: " + mfib(8));
        System.out.println("fib number: " + ifib(8));
        System.out.println();
        System.out.println("fib number: " + fib(21));
        System.out.println("fib number: " + mfib(21));
        System.out.println("fib number: " + ifib(21));
        System.out.println();
        System.out.println("fib number: " + fib(42));
        System.out.println("fib number: " + mfib(42));
        System.out.println("fib number: " + ifib(42));

//        testRecursive();
//        testMemoization();
//        testIterative();

    }

}
