public class P4 {
    public static void main(String[] args) {
        int a = 10, b = 80, c = 30;
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest number: " + largest);
    }
}
