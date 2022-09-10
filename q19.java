/*
 * WAP  that prompt user for input and sum of all its digits
 */

import java.util.*;
public class q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,i,sum =0 ,rev=0;
        System.out.println("[*] Enter Numbes");
        num = input.nextInt();
        while (num>0) {
            i = num%10;
            rev = rev * 10 +1;
            num = num /10;
        }
        sum += rev;
        System.out.println(sum);
        
    }
}
