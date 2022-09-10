import java.util.Scanner;

class question_12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        num = input.nextInt();

        if (num < 25) {
            System.out.println("F");
        } else {
            if (num > 25 && num < 45) {
                System.out.println("E");
            } 
            else if (num > 45 && num < 50) {
                System.out.println("D");
            } 
            else if (num > 50 && num < 60) {
                System.out.println("C");
            } 
            else if (num > 60 && num < 80) {
                System.out.println("B");
            } 
            else {
                System.out.println("A");
            }
        }

    }
}