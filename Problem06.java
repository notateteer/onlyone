import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int data;
        int sum = 0;
        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = scanner.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println("The sum is " + sum);
    }
}