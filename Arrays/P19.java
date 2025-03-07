import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array (should be 99, missing one number from 1-100): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements (sorted from 1 to 100, missing one number):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = 100 * 101 / 2; // Sum of first 100 natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

