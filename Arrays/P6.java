public class P6 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copied = new int[original.length];

        // Manually copying elements
        for (int i = 0; i < original.length; i++) {
            copied[i] = original[i];
        }

        // Printing copied array
        System.out.print("Copied Array: ");
        for (int num : copied) {
            System.out.print(num + " ");
        }
    }
}
