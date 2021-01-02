package org.wbl.JacksonLibrary;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

                                       //DESERIALIZATION----JsonObj to JavaObj(POJO)--Read

public class JsonToObject {
    @Test
    public  void convertJsonToPJOJO() throws IOException {
        ObjectMapper om = new ObjectMapper();

       try {
           Users users = om.readValue(new File("src/test/java/org/wbl/JacksonLibrary/Users.json"), Users.class);
           System.out.println(users.toString());
           System.out.println(users.getId());
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) throws IOException {
        JsonToObject jo = new JsonToObject();
        jo.convertJsonToPJOJO();

    }

}
