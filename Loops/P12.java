import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        switch (Character.toUpperCase(gender)) {
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
            default -> System.out.println("Invalid Input");
        }
        sc.close();
    }
}
