package io.learnstuff.tutorial.text_processing;
import java.util.Scanner;

public class TextProcessing implements TextProcessingInterface {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void split(String string , String wordToBeReversed) {

        String[] splits = string.split("\\s");//This regEx splits the String on the WhiteSpaces
        for(int i = 0; i < splits.length; i++){
            if (splits[i].toLowerCase().equals(wordToBeReversed.toLowerCase())){
                splits[i] = reverse(wordToBeReversed);
            }
        }
        System.out.println(String.join(" ", splits));


    }

    @Override
    public String reverse(String word, String text) {
        StringBuilder newString = new StringBuilder();

        int oldIndex = 0;
        int newIndex = text.indexOf(word, oldIndex);
        while (newIndex != -1) {
            newString.append(text.substring(oldIndex, newIndex));
            newString.append(reverse(word));
            oldIndex = newIndex + word.length();
            newIndex = text.indexOf(word, oldIndex);
        }
        newString.append(text.substring(oldIndex));

        return newString.toString();
    }


    @Override
    public StringBuffer reverse(String word, StringBuffer text) {
        StringBuffer newString = text;
        int oldIndex = 0;
        int newIndex;
        do {
            newIndex = newString.indexOf(word, oldIndex);
            if (newIndex != -1) {
                StringBuffer stringBuffer = new StringBuffer();
                oldIndex = newIndex;
                newString = stringBuffer.replace(newIndex, oldIndex + word.length(), reverse(word));
            }
        } while (newIndex != -1);
        return newString;

    }


    // Utils
    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }


    public static void println(String s) {
        System.out.println(s);
    }

}
