import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        final int MIN_TEST_VALUE = 0;
        final int MAX_TEST_VALUE = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of tests? ");
        int testCount = scanner.nextInt();
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        for (int i = 0; i < testCount; i++) {
            int num1 = (int) (MIN_TEST_VALUE + Math.random() * (MAX_TEST_VALUE - MIN_TEST_VALUE + 1));
            int num2 = (int) (MIN_TEST_VALUE + Math.random() * (MAX_TEST_VALUE - MIN_TEST_VALUE + 1));
            System.out.printf("%d + %d = ", num1, num2);
            int answer = scanner.nextInt();
            int sum = num1 + num2;
            if (answer == sum) {
                correctAnswers++;
            } else {
                incorrectAnswers++;
            }
        }
        System.out.printf("Number of correct answers: %d%n" + "Number of incorrect answers: %d%n", correctAnswers, incorrectAnswers);
    }
}