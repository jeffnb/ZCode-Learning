package com.zappos.cardgames.Games;

import com.zappos.cardgames.Deck;
import com.zappos.cardgames.Hands.Hand;
import com.zappos.cardgames.Hands.WarHand;

/**
 * Created with IntelliJ IDEA.
 * User: ocx
 * Date: 7/22/12
 * Time: 8:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class WarGame {

    private Deck deck;

    //Set up the deck
    public WarGame(){
        deck = Deck.getStandardDeck();
    }

    public void Play(){
        System.out.println("Player 1: Getting Hand");
        WarHand player1 = new WarHand(deck);
        System.out.println("Player 1 got:" + player1.getOne().toString());
        System.out.println("Player 2: Getting Hand");
        WarHand player2 = new WarHand(deck);
        System.out.println("Player 2 got:" + player2.getOne().toString());

        int winner = player1.getOne().compareTo(player2.getOne());

        if(winner > 0){
            System.out.println("Player 1 wins!");
        }
        else if(winner < 0){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("Tie");
        }
    }

}
