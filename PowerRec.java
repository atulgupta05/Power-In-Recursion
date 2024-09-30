package Recursion;

public class PowerRec{

    // Recursive method to calculate power (x^n)
    public static int power(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: x * x^(n - 1)
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 4;  // You can change this value for testing
        int result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

