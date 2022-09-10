// wap to chck the user ninput is postiv or negative
import java.util.*;
public class  q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int num ;
        while (true) {
            num = input.nextInt();
            if(num > 0){
                System.out.printf("The number [%d] is postive.",num);
            }
            else if(num < 0)
            {
                System.out.printf("The Number [%d] is negative. ",num);
            }
            else
            {
                System.out.printf("The number is neither postive nor negative.");
            }
            
        }
    }
}

    

