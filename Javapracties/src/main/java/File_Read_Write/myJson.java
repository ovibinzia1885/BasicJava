package File_Read_Write;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class myJson {
    public static void main(String[] args) throws IOException {
        jsonWrite();

    }
    public static void jsonWrite() throws IOException {
        JSONObject emp=new JSONObject();
        emp.put("name" ,"Namzul Hoque ovy");
        emp.put("Department", "IT");
        emp.put("Designation", "Software Engineer");
        emp.put("Contact", "013545485");
        JSONObject  addressobj=new JSONObject();
        addressobj.put("Area","Farmgate");
        addressobj.put("post_office", "Farmgate");
        addressobj.put( "city", "Dhaka");

//        System.out.println(emp);
        FileWriter writer= new FileWriter("employee.json");
        writer.write(emp.toJSONString());
        writer.flush();
        writer.close();


    }
}
