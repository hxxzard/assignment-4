import java.util.Scanner;

public class task8 {

    static String decimalToBinary(int n) {

        if (n == 0) {
            return "0";
        }

        String result = "";

        while (n > 0) {
            int remainder = n % 2;
            result = remainder + result;
            n = n / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));
    }
}