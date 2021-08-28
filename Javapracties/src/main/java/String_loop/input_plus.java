package String_loop;

import java.util.Scanner;

public class input_plus {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("enter a number");
        Scanner input=new Scanner(System.in);
        int ch=0;
        while(ch!=-1){
            sum= input.nextInt()+sum;
            System.out.println(sum);
        }

    }


}
