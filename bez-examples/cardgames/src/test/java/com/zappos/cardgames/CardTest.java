package com.zappos.cardgames;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class CardTest {

    @Test
    public void toStringTest(){
        Card card = new Card(Card.Suit.SPADE, Card.Rank.ACE);

        String value = card.toString();

        assertEquals("toString not working", "Card:{ACE of SPADE}", value);
    }

    @Test
    public void compareTest(){

        //Test the compare when one card is clearly lower than the other
        Card card = new Card(Card.Suit.SPADE, Card.Rank.ACE);
        Card card2 = new Card(Card.Suit.HEART, Card.Rank.TWO);

        int compVal = card.compareTo(card2);
        assertEquals("Sorting incorrect on rank value", 12, compVal);

        //Now try when the numbers are the same
        Card card3 = new Card(Card.Suit.HEART, Card.Rank.ACE);
        compVal = card.compareTo(card3);
        assertEquals("Sorting incorrect on suit", 1, compVal);

    }

}
