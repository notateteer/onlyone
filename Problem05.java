import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        int a = scanner.nextInt();
        System.out.print("B = ");
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.print("GCD(0, 0) is not defined.");
        } else if (a == b) {
            System.out.printf("GCD(%d, %d) = %d", a, b, a);
        } else {
            System.out.printf("GCD(%d, %d) = %d", a, b, gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {
        int greatestDivisor = 0;

        while (a - b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
            greatestDivisor = Math.min(a, b);
        }
        return greatestDivisor;
    }
}
