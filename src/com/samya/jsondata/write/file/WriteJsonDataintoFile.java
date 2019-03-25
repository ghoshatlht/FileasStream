/**
 * 
 */
package com.samya.jsondata.write.file;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Samya Ghosh 
 *
 */
public class WriteJsonDataintoFile {
	
	
	public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("Home", "Frankfurt Am Main, Germany");
        obj.put("Name", new Integer(100));

        JSONArray list = new JSONArray();
        list.add("My name is samya ghosh");
        list.add("I am a Java Developer & Software Engineer");
        list.add("I am from India ");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("test.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    

}

}
