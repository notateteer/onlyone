import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("An integer? ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.print(num + " is a palindrome");
        } else {
            System.out.print(num + " is not a palindrome");
        }
    }

    public static int reverse(int number) {
        int rem, sum = 0;
        while (number > 0) {
            rem = number % 10;
            sum = (sum * 10) + rem;
            number = number / 10;
        }

        return sum;
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
}