package io.learnstuff.tutorial.oop;

public class Main {
    public static void main(String[] arg) {

        Professor professor;  // reference-> no memory allocated
        professor = new Professor(); // new operator -> allocate memory

        SecurityGuard securityGuard = new SecurityGuard();

        Student student = new Student();

        Janitor janitor = new Janitor();

        professor.doStuff(2, 5);
        securityGuard.doStuff();
        securityGuard.fights();
        student.doStuff();
        janitor.doStuff();


        Card card1 = new Card("ace", "spades");
        System.out.println(card1.toString());

        DeckOfCards deck = new DeckOfCards();
        deck.shuffleDeck(deck);
        System.out.println(deck.toString());

//        String[] suit = {"spades", "hearts", "clubs" , "diamonds"};
//        String[] rank = {"2","3","4","5","6","7","8","9","10"
//                ,"jack", "queen", "king", "ace"};
//        String[] deck1 = new String[52];
//
//        for (int i = 0; i < deck1.length; i++) {
//            deck1[i] = rank[i % 13] + suit[i / 13];
//            }
//



    }
}

