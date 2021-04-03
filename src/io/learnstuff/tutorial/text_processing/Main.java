package io.learnstuff.tutorial.text_processing;

public class Main {
    public static void main(String[] arg){

        var textProcessing = new TextProcessing();
        textProcessing.split("This is going to split the string and reverse the chosen word.", "reverse");
        TextProcessing.println(textProcessing.reverse("xes", "I want lots of xes with dirty bitches."));
        TextProcessing.println(textProcessing.reverse("15","Am de ridicat un colet in 15 minute."));
    }
}
