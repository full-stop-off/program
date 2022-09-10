import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Enter Mark");
        num = input.nextInt();
        for ( int i = 1; i <= 10; i++) {  
            System.out.printf("%d * %d = %d \n",num,i,num*i);
        } 
    }
}
 