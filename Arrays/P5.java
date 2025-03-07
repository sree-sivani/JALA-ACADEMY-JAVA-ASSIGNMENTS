import java.util.Arrays;

public class P5 {
    public static int[] removeElement(int[] arr, int value) {
        return Arrays.stream(arr).filter(num -> num != value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        System.out.println("New Array : " + Arrays.toString(removeElement(arr, 2)));
      
    }
}
