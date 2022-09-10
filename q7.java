// wap to find odd and evn using tranry operator
import java.util.*;
public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.printf("Enter the number: ");
        num = input.nextInt();
/*

    if (num%2 === 0) {
        System.out.printf("Even number");
    } else {
        System.out.printf("Odd  number");
    }
 */

        String result = (num%2==0)? "Even Number":"Odd Number";
        System.out.printf(result);
}
}
