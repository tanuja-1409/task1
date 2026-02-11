import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your monthly salary: $");

        
        double monthlySalary = scanner.nextDouble();

       
        double yearlySalary = monthlySalary * 12;

        System.out.println("Your yearly salary is: $" + yearlySalary);

        
        scanner.close();
    }
}
