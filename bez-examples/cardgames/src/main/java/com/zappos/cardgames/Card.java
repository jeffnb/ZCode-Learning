package com.zappos.cardgames;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Card implements Comparable<Card>{
    public static enum Suit{
        SPADE (1), HEART (2), DIAMOND (3), CLUB (4);

        private final int index;

        Suit(int index) {
            this.index = index;
        }

        public int index() {
            return index;
        }
    }

    public static enum Rank {
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE(9),
        TEN (10),
        JACK (11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private final int index;

        Rank(int index) {
            this.index = index;
        }

        public int index() {
            return index;
        }
    }

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Card:{").append(rank).append(" of ").append(suit).append("}");

        return sb.toString();
    }

    @Override
    public int compareTo(Card card) {
        int rval = 0;

        if(this.getRank() == card.getRank() && this.getSuit() == card.getSuit()){
            rval = 0;
        }
        else if(this.getRank() == card.getRank()){
            rval = -1 * this.getSuit().compareTo(card.getSuit());
        }
        else{
            rval = this.getRank().compareTo(card.getRank());
        }

        return rval;
    }
}
