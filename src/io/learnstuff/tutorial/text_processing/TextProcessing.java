package io.learnstuff.tutorial.text_processing;
import java.util.Scanner;

public class TextProcessing implements TextProcessingInterface {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void split(String string) {

        String[] splits = string.split("\\s");//This regEx splits the String on the WhiteSpaces

        for(String splits2: splits) {
            System.out.println(splits2);
        }
    }

    @Override
    public void indexOf(int indexOf) {

    }

    @Override
    public void indexOf(int indexOf, String replaceTxt) {

    }

}
