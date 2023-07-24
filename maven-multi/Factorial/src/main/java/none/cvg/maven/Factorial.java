package none.cvg.maven;

public class Factorial {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1 (since 0! and 1! are both 1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: call the factorial function with n-1 and multiply by n
            return n * factorial(n - 1);
        }
    }
}
