/*
 * Wap to find Fibonacci to print hthe first 20 Fibonacci number f(n) where
 * Fn = f(n-1) + f(n-2) and 
 * f(1)=F(2)=1 . also averages
 */
import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ,prevPrevNum;
        
        int current = 1;
        int prev = 0;
        System.out.println("Enter Number: ");
        num = input.nextInt();
        for(int i=1;i<=num;i++)
        {
            prevPrevNum = prev;
            prev =  current;
            current = prev + prevPrevNum;
            i++;
        }
        System.out.println(current);
    }
    
}

public class recur{
    public static void main(String[] args) {
        
        if (number == 0)
        {
            System.out.println(0);
        }
        else if (number ==1){
            System.out.println(1);
        }
        else{
            System.out.println( (number - 1) + (number - 2));
        }
    }
}
