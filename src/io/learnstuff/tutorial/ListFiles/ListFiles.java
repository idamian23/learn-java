package io.learnstuff.tutorial.ListFiles;

import java.io.File;

public class ListFiles {

    public static void main(String[] args) {


        }
    public static void listFiles(String directoryName) {

        String extension;
        String fileName;
        int filesCount = 0;
        File file = new File(directoryName);
        File[] fileList = file.listFiles();// list files inside main dir

    }
}

