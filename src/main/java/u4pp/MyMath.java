package u4pp;

public class MyMath {
//     - `static int abs(int x)` which returns the absolute value of the parameter.
    public static int abs(int x) {
        if (x > 0) {
            return x;
        }
        return -x;
    }
// - `static double abs(double x)` which returns the absolute value of the parameter.
    public static double abs(double x) {
        if (x >= 0) {
            return x;
        }
        return -x;
    }
// - `static double pow(double base, int exponent)` which raises the base to the power of the exponent. You can assume that the exponent is greater than or equal to 0.
    public static double pow(double base, int exponent) {
        double output = 1.0;
        for(int i = 0; i < exponent; i++) {
            output *= base;
        }
        return output;
    }

// - `static int perfectSqrt(int x)` which returns the square root of x if there is a whole number that is a square root. It returns -1 otherwise.
    public static int perfectSqrt(int x) { 
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        for(int i = 0; i < x; i++) {
            if(i * i == x) {
                return i;
            }
            if(i * i > x) {
                return -1;
            }
        }
        return -1;
    }
}
