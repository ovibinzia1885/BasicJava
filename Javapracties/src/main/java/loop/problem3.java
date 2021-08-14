package loop;

import java.util.Random;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        int count=0;

        for(int i=0;i<5;i++){

            Random rand = new Random();
            int   num1=rand.nextInt(100);
            int   num2=rand.nextInt(100);
            System.out.println("The random number is "+num1 +"and"+num2);
            int sum=num1+num2;
            System.out.println(sum);
            Scanner input=new Scanner(System.in);
            int  number=input.nextInt();
            if(number==75){
                System.out.println("Correct !");
                count++;
                System.out.println("total rong answare :" +count);

            }
            else{
                System.out.println("Wrong ! ");

                count++;

                System.out.println("total rong answare :" +count);
            }

        }

    }
}
