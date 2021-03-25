package io.learnstuff.tutorial.text_processing;

public class TextProcessing implements TextProcessingInterface {

    private String text;
    private String wordToBeReplaced;

    public TextProcessing(String text, String wordToBeReplaced){
        this.text = text;
        this.wordToBeReplaced = wordToBeReplaced;
    }

    @Override
    public void split(String[] array) {
        for( String item : array ){
            if (wordToBeReplaced.equals(item)) {
                item = reverse(wordToBeReplaced);
            }
        }
    }

    @Override
    public void split(int indexOf) {

    }

    private static String reverse(String input){
        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }
    public String toString(){
        return text;
    }
 }
