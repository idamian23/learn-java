package io.learnstuff.tutorial.FileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File myFile = new File("D:\\FEAA SIA\\SEM 1\\JAVA\\FolderForSearching\\createdFile2.txt");
        if(myFile.delete()){
            System.out.println(myFile.getName() + " has been deleted.");
        }else System.out.println("Failed to delete " + myFile.getName());
    }
}
