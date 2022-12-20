public class Problem10 {
    public static void main(String[] args) {

        System.out.println("i" + "         " + "m(i)");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-10.4f%n", i, m(i));
        }
    }

    static double m(int n) {
        double mi = 0;
        for (int i = 1; i <= n; i++) {
            mi += 1.0 * i / (i + 1);
        }
        return mi;
    }
}