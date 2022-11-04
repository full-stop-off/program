// Wap to accept number and display the week to their crossponding
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Enter a number: ");
        System.out.println("Dont user zero");
        choice = input.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tueday");
                break;
            case 4:
                System.out.println("Wednessday");
                break;
            case 5:
                System.out.println("Thusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.print("Invalid Input");
                break;
        }
    }
}
