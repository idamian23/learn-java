package io.learnstuff.tutorial.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] arg){

        try{
            FileWriter fileWriter = new FileWriter("D:\\FEAA SIA\\SEM 1\\JAVA\\FolderForSearching\\createdFile2.txt");
            fileWriter.write("Writing in java is not easy but not so hard.");
            fileWriter.write("\nThis is line 2.");
            fileWriter.write("\n Hello Bianca!");
            fileWriter.close();
            System.out.println("Succesfully wrote to the file!");
        }catch(IOException e){
            System.out.println("An error occured!");
            e.printStackTrace();
        }

    }
}
