import java.util.Scanner;

public class LargestNumber {
    static int findLargest(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int result = findLargest(x, y, z);
        System.out.println("Largest number is: " + result);
    }
}
