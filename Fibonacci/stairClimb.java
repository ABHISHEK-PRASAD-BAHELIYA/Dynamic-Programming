package Fibonacci;

public class stairClimb {
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    // public static int fib(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // return fib(n - 1) + fib(n - 2);
    // }

    public static void main(String[] args) {
        int n = 5; // n=3-> 3 & n=4 -> 5 => 8
        System.out.println(countWays(n));
    }

}