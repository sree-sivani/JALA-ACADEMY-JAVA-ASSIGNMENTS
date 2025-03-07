import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found12 = false, found23 = false;

        for (int num : arr) {
            if (num == 12) found12 = true;
            if (num == 23) found23 = true;
        }

        if (found12 && found23) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }
    }
}
