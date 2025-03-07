import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), originalNum = num, sum = 0, digit;

        while (num > 0) {
            digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        System.out.println(originalNum == sum ? "Armstrong Number" : "Not an Armstrong Number");
        sc.close();
    }
}
