public class P8 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 1, 7};
        
        int min = arr[0]; // Assume first element is the minimum
        int max = arr[0]; // Assume first element is the maximum

        // Loop to find min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}
