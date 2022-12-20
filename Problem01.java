import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int userX = scanner.nextInt();
        System.out.print("Coordinate of 1st point: ");
        int x1 = scanner.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        int x2 = scanner.nextInt();

        int d1 = myAbs(x1 - userX);
        int d2 = myAbs(x2 - userX);

        if (d1 < d2) {
            System.out.println("1st point is closer. Distance " + d1);
        } else if (d2 < d1) {
            System.out.println("2nd point is closer. Distance " + d2);
        } else {
            System.out.println("Distance is the same: " + d1);
        }
    }


    static int myAbs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }

}
