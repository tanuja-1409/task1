import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }

        System.out.println("Total Electricity Bill aagya: ₹" + bill);
    }
}
