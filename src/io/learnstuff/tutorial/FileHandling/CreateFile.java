package io.learnstuff.tutorial.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] arg){

    try{
        File createdFile = new File("D:\\FEAA SIA\\SEM 1\\JAVA\\FolderForSearching\\createdFile2.txt");
        if(createdFile.createNewFile()){
            System.out.println("File created : " + createdFile.getName());
        }else System.out.println("File already exists.");

    }catch (IOException e){
        System.out.println("An error occured!");
        e.printStackTrace();
    }

    }
}
