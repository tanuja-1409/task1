import java.util.*; 

public class MiniCalculator {

    public static void main(String[] args) {
        
        double number1, number2, result;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = sc.nextDouble(); 
        
        System.out.println("Enter the second number:");
        number2 = sc.nextDouble(); 
        
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0); 
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                
                if (number2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    
                    sc.close();
                    return; 
                }
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Error: Invalid operator entered.");
        }
        
       
    }
}
