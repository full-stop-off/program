// wap to fkeep a string input and isplay week day using hint
import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String week;
        System.out.printf("Welcome to Schedule Model ");
        System.out.printf("Enter Week Day: ");
        week = input.next();
        switch (week) {
            case "sun": 
                System.out.printf("Sunday") ;
                break;
            case "mon":
                System.out.printf("Monday") ;
            case "tue":
                System.out.printf("Tuesday") ;
            case "wed":
                System.out.printf("Wednessday") ;
            case "thus":
                System.out.printf("Thusday") ;
            case "fri":
                System.out.printf("Friday") ;
            case "sat":
                System.out.printf("Staurday :)") ;
                break;
            default:
                System.out.printf("Invalid");
                break;
        }
}
}
