package io.learnstuff.tutorial.RecursiveFileAndFolder;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;


        public class RecursiveFileAndFolder {
            static  File dir = new File("D:/FEAA SIA/SEM 1/JAVA/FolderForSearching");
            static String[] extensions = new String[]{"png" , "pdf"};
            static FilenameFilter extension_filter = (dir, name) -> {
                 for (String extension : extensions) {
                     if (name.endsWith("." + extension)) {
                         return true;
                     }
                 }
                     return false;
            };


        public static void main(String[] arg) {
            new RecursiveFileAndFolder().listFolder(new File(String.valueOf(dir)));
        }


        public void listFolder(File dir){
            File[] subDirs = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isDirectory();
                }
            });
            System.out.println("\n Directory of " + dir.getAbsolutePath());
            listFile(dir);
            for (File folder : subDirs){
                listFolder(folder);
                }


        }

        private void listFile(File dir) {
            File[] files = dir.listFiles(extension_filter);
                for (File file : files){
                    System.out.println(file.getName());
                }
            }



    }






