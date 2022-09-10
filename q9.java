// wap to find the nuber is prime or not
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ,count=0;
        System.out.printf("Enter the number: ");
        num = input.nextInt();
        for (int i = 1; i < num; i++) {
            
            if(num%i==0){
                count ++;
            }
        }
        if(count == 2)
        {
            System.out.printf("The number is Prime : %d",num);
        }
        else{
            System.out.printf("The number is not Prime: %d");
            for (int i = 1; i < num; i++) {
                if(num%i ==0){
                    System.out.print("%d \n");
                }
            }
        }
        }
}
