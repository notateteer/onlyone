import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grades;
        double sum = 0;
        double count = 0;

        do {
            grades = scanner.nextDouble();
            sum += grades;
            count++;
        } while (grades != 0);
        count -= 1;
        double arithmeticMean = sum / count;

        if (arithmeticMean>0 && arithmeticMean<6) {
            System.out.println("The arithmetic mean is " + arithmeticMean);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}
