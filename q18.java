/*
 * Wap user input of postive int and reverse it
 */

import java.util.*;

public class q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, rev = 0, i;
        System.out.println("Enter Mark");
        num = input.nextInt();

        /*
            * 321 % 10 = 1
            * 0 * 10 + 1 = 1
            * 321 / 10 = 32
         */
        while (num > 0) {
            i = num % 10;
            rev = rev * 10 + i;
            num = num / 10;
        }
        System.out.println("Reverse :: " + num);

    }
}
