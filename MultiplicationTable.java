import java.util.Scanner; 
public class MultiplicationTable {
    // Create a method to print the multiplication table of a number
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // The number for which the multiplication table is to be printed
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        // Print the multiplication table of the number
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
