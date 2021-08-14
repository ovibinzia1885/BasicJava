package loop;

import java.util.Scanner;
//Take a number as input from the user. Now write a program to show table of the given numbers

public class problem_5 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        System.out.print("Take a number as input from the user: ");
        int number = input.nextInt();
        for(i=1;i<=number;i++){
            System.out.println("The number is :"+number*i);
        }

    }
}
