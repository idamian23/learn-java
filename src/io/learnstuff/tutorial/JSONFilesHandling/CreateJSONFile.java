package io.learnstuff.tutorial.JSONFilesHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class CreateJSONFile {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Damian Ionut");
        jsonObject.put("location", "Vaslui");

        JSONArray list = new JSONArray();
        list.add("Java");
        list.add("JSON");
        list.add("Files");

        jsonObject.put("courses", list);

        try(FileWriter fileWriter = new FileWriter("jsonFile.json")){
            fileWriter.write(jsonObject.toString());
            fileWriter.flush();



        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(jsonObject);
    }
}
