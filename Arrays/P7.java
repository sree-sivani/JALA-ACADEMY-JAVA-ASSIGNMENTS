import java.util.Arrays;

public class P7 {
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            newArr[i] = (i == index) ? value : arr[j++];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("New Array: " + Arrays.toString(insertElement(arr, 2, 25)));
    }
}
