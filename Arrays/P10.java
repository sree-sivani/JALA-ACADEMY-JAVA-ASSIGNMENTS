import java.util.HashSet;

public class P10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicates: ");
        for (int num : arr) {
            if (!seen.add(num)) System.out.print(num + " ");
        }
    }
}
