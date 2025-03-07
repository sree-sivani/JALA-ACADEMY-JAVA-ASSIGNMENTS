import java.util.Scanner;

public class P18 {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        int[] uniqueArr = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            uniqueArr[i] = temp[i];
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Array without duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
