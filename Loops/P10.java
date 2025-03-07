import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), originalNum = num, reversedNum = 0, digit;

        while (num > 0) {
            digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println(originalNum == reversedNum ? "Palindrome Number" : "Not a Palindrome Number");
        sc.close();
    }
}
