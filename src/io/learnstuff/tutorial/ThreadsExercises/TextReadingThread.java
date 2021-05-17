package io.learnstuff.tutorial.ThreadsExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReadingThread implements Runnable{

    private String wordToFind;
    private String pathToFile;

    public TextReadingThread(String pathToFile,String wordToFind){
        this.wordToFind = wordToFind;
        this.pathToFile = pathToFile;
    }

    @Override
    public void run() {
        try{
            File myFile = new File(pathToFile);
            Scanner myReader = new Scanner(myFile);
            String[] words=null;
            int count = 0;
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                words = data.split(" ");
                for (String word : words) {
                    if (word.equals(wordToFind)) {
                        count++;
                    }
                }
            }
            if(count != 0 ){
                System.out.println("The word " + "'" + wordToFind +"'"+ " has been found: " + count + " time(s) on : " + Thread.currentThread().getName());
            }else {
                System.out.println("The given word has not been found.");
            }

            myReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();

        }

        }


    }

