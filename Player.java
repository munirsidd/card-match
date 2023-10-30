/*
 * Player.java
 * 
 * A class for a program that plays a card game called CardMatch.
 * Serves as a blueprint class for a Player object, which represents
 * a single CardMatch Player
 *
 */

import java.util.*;

public class Player {
    /* the name of the player */
    private String name;
    
    /* the cards in the player's hand */
    private Card[] hand;

    /* the number of cards currently in the player's hand */
    private int numCards;

    /*
     * constructor - takes the the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Card[CardMatch.MAX_CARDS];
        this.numCards = 0;
    }

    /* 
     * getName - an accessor method for the player's name
     */
    public String getName() {
        return this.name;
    }

    /* 
     * getNumCards - an accessor method for the number of cards in the player's hand
     */
    public int getNumCards() {
        return this.numCards;
    }

    /*
     * toString - overrides the default toString method to return the player's name
     */ 
    public String toString() {
        return this.name;
    }

    /*
     * addCard - a mutator method that takes a Card object and adds it to the player's hand
     *
     * precondition: the parameter must not be null and the player should not already have the max number of cards
     */
    public void addCard(Card newCard) {
        if (newCard == null || numCards == CardMatch.MAX_CARDS) {
            throw new IllegalArgumentException();
        }

        this.hand[this.numCards] = newCard;
        this.numCards++;
    }

    /* 
     * getCard - an accessor method that takes an integer index and returns the
     * Card at the specified position in the player's hand, without removing the card
     * 
     * precondition: the parameter must correspond to one of the cards in the hand
     */
    public Card getCard(int index) {
        if (index < 0 || index >= this.numCards) {
            throw new IllegalArgumentException();
        }

        return this.hand[index];
    }

     /* 
     * getHandValue - an accessor method that computes and returns the total value of the player's current hand
     */
    public int getHandValue() {
        int totalValue = 0;
        for (int card = 0; card < this.numCards; card++) {
            int cardValue = this.hand[card].getValue();
            totalValue += cardValue;
        }

        if (this.numCards == CardMatch.MAX_CARDS) {
            totalValue += CardMatch.MAX_CARDS_PENALTY;
        }

        return totalValue;
    }

     /* 
     * displayHand - an accessor method that prints the current contents of the player's hand
     * preceded by a heading that includes the player's name
     */
    public void displayHand() {
        System.out.println(this.name + "'s hand:");
        String str = "";

        for (int card = 0; card < this.numCards; card++) {
            str += "  " + card + ": ";
            str += this.hand[card].getColor() + " " + this.hand[card].getValue() + "\n"; 
        }

        System.out.println(str);
    }

    /* 
     * removeCard - a mutator method that takes an integer index and removes and returns the Card
     * at that position of the player's hand
     * 
     * precondition: the parameter must correspond to one of the cards in the hand
     */
    public Card removeCard(int index) {
        if (index < 0 || index >= this.numCards) {
            throw new IllegalArgumentException();
        }

        Card cardRemoved = this.hand[index];
        this.hand[index] = null;

        if (index != this.numCards - 1) {
            this.hand[index] = this.hand[numCards - 1];
            this.hand[numCards - 1] = null;
        }

        this.numCards--;
        return cardRemoved;
    }

    /* 
     * getPlay - an accessor method that determines and returns the number responding to the player's next play:
     * -1 if the player wants to draw a card, or the index of the card that the player wants to discard
     */
    public int getPlay(Scanner console, Card top) {
        int index;
        do {
            System.out.print(this.name + ": number of card to play (-1 to draw)? ");
            index = console.nextInt();
        } while (index < -1 || index >= this.numCards);

        return index;
    }
    
}
