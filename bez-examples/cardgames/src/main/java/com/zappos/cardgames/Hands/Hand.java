package com.zappos.cardgames.Hands;

import com.zappos.cardgames.Card;
import com.zappos.cardgames.Deck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 5:02 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Hand {
    public List<Card> cardsInHand = new ArrayList<Card>();
    public int maxCards = 0;

    public int getMaxCards() {
        return maxCards;
    }

    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
    }

    public abstract void deal(Deck deck);

    public void addCard(Card card){
        if(cardsInHand.size() <= maxCards){
            cardsInHand.add(card);
            maxCards += 1;
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Too many Cards");
        }
    }

    public void addCards(List<Card> cards){
        if(cardsInHand.size() + cards.size() <= maxCards){
            cardsInHand.addAll(cards);
            maxCards += cards.size();
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Too many Cards");
        }
    }

    public List<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
}
