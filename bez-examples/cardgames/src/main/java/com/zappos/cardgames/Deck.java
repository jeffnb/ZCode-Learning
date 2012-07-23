package com.zappos.cardgames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Deck {
    List<Card> cards = new ArrayList<Card>();

    public static Deck getMultiDeck(int deckCount){
        Deck rval = new Deck();

        for(int i = 0; i < deckCount; i++){
            for(Card.Suit suit : Card.Suit.values()){
                for(Card.Rank rank : Card.Rank.values()){
                    rval.addCard(new Card(suit, rank));
                }

            }
        }

        return rval;
    }

    public static Deck getStandardDeck(){
        return Deck.getMultiDeck(1);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public int getCardCount(){
        return cards.size();
    }

    synchronized public List<Card> dealCards(int count){
        List<Card> rval = new ArrayList<Card>();
        Random rand = new Random(System.currentTimeMillis());

        for(int i = 0; i<count; i++){
            int index = rand.nextInt(cards.size());
            rval.add(cards.get(index));
            cards.remove(index);
        }

        return rval;
    }

    public void printDeck(){
        for(Card card : cards){
            System.out.println(card);
        }
    }
}
