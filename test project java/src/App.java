import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        //Making Scanner
        Scanner calculator = new Scanner(System.in);
        // Initializing Variables
        int v1 = 0;
        int v2 = 0;
        int choice = 0;
        boolean done = false;
        // Asking for v1 , handles incorrect values
        while(!done){
            try{
                System.out.println("Please enter a value");
                v1 = calculator.nextInt();
                done = true;
            }catch(InputMismatchException e){
                calculator.nextLine();
                System.out.println("Invalid. Enter a whole integer");
            }
        }
        
    }
}
