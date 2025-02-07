import java.util.Scanner;

public class EvenOdd {

    /*
     * Print an Integer entered by an user
     * Step1: Creates a reader instance which takes
     * Step2: Input any number from keyboard
     * Step3: nextInt() reads the next integer by the user
     * Step4: if number is even print " is even", else " is odd."
     * Step5: output
     */

    public static void main(String[] args) {
        // Step1: Creates a reader instance which takes
        Scanner scanner = new Scanner(System.in);
        int num;
        //Step2: Input any number from keyboard
        System.out.println("Enter any number: ");
        //Step3: nextInt() reads the next integer by the user
        num = scanner.nextInt();
        //Step4: if number is even print " is even", else " is odd."
        // Step5 output: You entered a number of 15 which is even/odd.
        if (num %2==0)
            System.out.println("You entered " + num + " which is even");
        else 
            System.out.println("You entered " + num + " which is odd");
     
        scanner.close();
    }
}
