package io.learnstuff.tutorial.assignment2;

public class Main {
    public static void main(String[] arg){

        Professor professor ;  // reference-> no memory allocated
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
        System.out.println(deck.toString());

    }
}
