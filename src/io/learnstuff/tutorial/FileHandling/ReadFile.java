package io.learnstuff.tutorial.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] arg){
        try{
            File myFile = new File("D:\\FEAA SIA\\SEM 1\\JAVA\\FolderForSearching\\createdFile.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();

        }
    }
}
