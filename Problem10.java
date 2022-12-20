public class Problem10 {
    public static void main(String[] args) {
        int numberOfPrimes = 50;
        int numberOfPrimesPerLine = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are ");

        while (count < numberOfPrimes) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;

                if (count % numberOfPrimesPerLine == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }

            number++;
        }
    }
}