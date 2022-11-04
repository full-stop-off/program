// Wap that accepts user input and implement the grading system .

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter Marks: ");
        marks = input.nextInt();
        if (marks > 80) {
            System.out.println(" A  ");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("B ");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("  C ");
        } else if (marks > 45 && marks <= 50) {
            System.out.println(" d");
        } else if (marks > 25 && marks <= 45) {
            System.out.println("e");
        } else {
            System.out.println("Not sufficient Marks ");
        }

    }
}
