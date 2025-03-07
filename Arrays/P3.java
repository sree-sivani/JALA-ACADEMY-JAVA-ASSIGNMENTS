public class P3 {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        System.out.println("Index of 15: " + findIndex(arr, 15));
    }
}

