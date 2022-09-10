// wap to prompt for radius in float. accept ass double, calculate volum and surfae area of spherei n double and print vlaue rounded to 2 decimal value 

import java.util.Scanner;

public class q16 {

    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner input = new Scanner(System.in);

        float radius;
        System.out.println("Enter radius");
        radius = input.nextFloat();

        System.out.println("Areaa of Sphere =  " + 4*pi*radius*radius);

        System.out.printf("Volume of Sphere = %.2f" ,(float)(4*pi*radius*radius*radius)/3);
        
    }
}
