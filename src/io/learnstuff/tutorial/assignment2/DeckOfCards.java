package io.learnstuff.tutorial.assignment2;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
    private String suit;
    private String rank;

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCards(){
        List<String> suits = Card.getValidSuit(); //static method

        List<String> ranks = Card.getValidRank();

        deck = new ArrayList<>();
        for (String suit : suits){
            for (String rank : ranks)
                deck.add(new Card(rank,suit));
        }
    }

}
