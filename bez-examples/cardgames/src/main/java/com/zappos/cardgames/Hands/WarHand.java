package com.zappos.cardgames.Hands;

import com.zappos.cardgames.Card;
import com.zappos.cardgames.Deck;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class WarHand extends Hand implements Comparable<WarHand> {

    public WarHand(Deck deck){
        setMaxCards(1);

        addCards(deck.dealCards(1));
    }

    @Override
    public void deal(Deck deck) {
        throw new UnsupportedOperationException();
    }

    public Card getOne(){
        return getCardsInHand().get(0);
    }

    @Override
    public int compareTo(WarHand hand) {
        return this.getOne().compareTo(hand.getOne());
    }
}
