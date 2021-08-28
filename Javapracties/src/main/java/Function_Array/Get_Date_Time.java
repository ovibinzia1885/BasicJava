package Function_Array;


import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Get_Date_Time {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss:aa");
       String d1= sdf.format(date);
       System.out.println(d1);
    }
}
