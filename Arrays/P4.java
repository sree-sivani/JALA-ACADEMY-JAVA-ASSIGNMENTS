public class P4 {
    public static boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 12};
        System.out.println("Contains 7? " + contains(arr, 7));
    }
}
