import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n? ");
        int numberOfRows = scanner.nextInt();

        displayPattern(numberOfRows);
    }

    static void displayPattern(int number) {
        int space = number - 1;
        for (int r = 1; r <= number; r++) {
            for (int p = 0; p < space; p++) {
                System.out.print("  ");
            }

            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            space--;
        }
    }
}