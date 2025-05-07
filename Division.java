import java.util.*;

public class Division {
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a first number: ");
            int number = scan.nextInt();
            System.out.println("Enter a second number: ");
            int number2 = scan.nextInt();
            int result = number / number2;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }catch(InputMismatchException e){
            System.out.println("Error: Invalid input");
        }finally{
            System.out.println("End of Program");
        }
    }
}
