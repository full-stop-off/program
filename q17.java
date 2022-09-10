/*Wap to swa2 integer that prompt user fortwo integers and print */

import java.util.*;
public class q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2,temp;
        System.out.println("Enter First number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second number: ");
        num2 = input.nextInt();

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(" /n Swap Value ");
        System.out.println("first = "+num1);
        System.out.println("second = "+num2);
        
    }
}
