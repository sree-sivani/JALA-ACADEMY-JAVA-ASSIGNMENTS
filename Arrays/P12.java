public class P12 {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array to store unique elements
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

        // Creating the final array of correct size
        int[] uniqueArr = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            uniqueArr[i] = temp[i];
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
