import java.util.Scanner;

public class Demo {

    /*
     * Print an Integer entered by an user
     * Step1: Creates a reader instance which takes
     * Step2: Input any number from keyboard
     * Step3: nextInt() reads the next integer by the user
     * Step4: output
     */

    public static void main(String[] args) {
        // Step1: Creates a reader instance which takes
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        //Step2: Input any number from keyboard
        System.out.println("Enter the first number: ");
        //Step3: nextInt() reads the next integer by the user
        firstNumber = scanner.nextInt();
        //Step4: output
        System.out.println("You entered: " + firstNumber);
        scanner.close();
    }
}
