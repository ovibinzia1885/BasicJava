package File_Read_Write;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_write {
    public static void main(String[] args) throws IOException {
        File_Read();
    }


    public static void FIle_read()throws IOException {
        FileWriter fw=new FileWriter("myfile.txt", true);
        fw.write("\nhello kocu");
        fw.close();
    }

    public static void File_Read() throws IOException {
        FileReader rd = new FileReader("myfile.txt");
        int character;
        while ((character = rd.read()) != -1) {
            System.out.print((char) character);
        }
        rd.close();

    }
}
