package Function_Array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Find the date difference (year, day, hour, min, sec) between your birthdate and today
public class differcen_Date_time {
    public static void main(String[] args) throws ParseException {
        DifferenceDate();

    }
    public static void DifferenceDate() throws ParseException {
        String thatDay="17/11/1997 5:30:00 PM";
        SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss aa");
        Date date1=formatter.parse(thatDay);
        Date date2=new Date();
        long d=date2.getTime()-date1.getTime();
        long year=d/(10001*60*60*24*365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);

    }

}
