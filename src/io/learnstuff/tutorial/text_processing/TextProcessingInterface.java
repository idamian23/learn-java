package io.learnstuff.tutorial.text_processing;

public interface TextProcessingInterface {
    public void split(String string, String wordToBeReversed);
    public String reverse(String word, String text);
    public StringBuffer reverse(String word, StringBuffer text);

}
