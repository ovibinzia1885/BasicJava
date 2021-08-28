package String_loop;

import java.util.Scanner;

public class character_input_plus {
    public static void main(String[] args) {
        int sum=0;
        Scanner input =new Scanner(System.in);
        char ch=input.next().charAt(0);
        do{
             int num=input.nextInt();
            sum+=num;
            System.out.println(sum);
        }
        while(ch !='q');
    }
}
