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
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Card card : deck){
            stringBuilder.append(card);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void shuffleDeck(DeckOfCards deck){
        for (int i = 0; i < deck.deck.size(); i++) {
            int j = (int)(Math.random() * deck.deck.size()); // Get a random index out of 52
            Card temp = deck.deck.get(i); // Swap the cards
            deck.deck.set(i, deck.deck.get(j));
            deck.deck.set(j,temp);
        }

    }
}
