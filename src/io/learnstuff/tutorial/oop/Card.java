package io.learnstuff.tutorial.oop;

import java.util.Arrays;
import java.util.List;

public class Card {

    private String rank , suit;


    public Card(String rank, String suit){
        setRank(rank);
        setSuit(suit);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        List<String> validRank = getValidRank();
        rank = rank.toLowerCase();

        if(validRank.contains(rank))
            this.rank = rank;
        else
            throw new IllegalArgumentException("Valid ranks are: " + validRank);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuit = getValidSuit();
        suit = suit.toLowerCase();

        if (validSuit.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Valid suits are: " + getValidSuit());
    }

    public static List<String> getValidRank(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10"
                            ,"jack", "queen", "king", "ace");
    }

    public static List<String> getValidSuit(){
        return Arrays.asList("spades","hearts","clubs","diamonds");
    }


    public String toString(){
        return String.format("%s of %s", rank , suit);
    }

}
