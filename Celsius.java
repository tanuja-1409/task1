import java.util.Scanner;

public class Celsius{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();

            
            double fahrenheit = (celsius * 9.0/5.0) + 32;

    
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        } else {
            System.out.println("Invalid input. Please enter a numerical value.");
        }

        
    }
}

