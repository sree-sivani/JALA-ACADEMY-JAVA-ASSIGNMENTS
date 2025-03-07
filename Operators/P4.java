import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == y)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");
        sc.close();
    }
}
