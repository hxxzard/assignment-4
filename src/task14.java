import java.util.Scanner;

public class task14 {

    static int transformDigits(int n) {

        int result = 0;
        int multiplier = 1;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                digit++;
            } else {
                digit--;
            }

            result += digit * multiplier;

            multiplier *= 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(transformDigits(n));
    }
}