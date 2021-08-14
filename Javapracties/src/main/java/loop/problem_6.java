package loop;
//Write a program to print prime numbers from 2 to n

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a start  number");
        int num=input.nextInt();
        System.out.println("Enter  a end number");
        int num1=input.nextInt();
        for(int i=num;i<=num1;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    count ++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                count=0;
            }

        }



    }

}
