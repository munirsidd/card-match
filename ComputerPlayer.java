/*
 * ComputerPlayer.java
 * 
 * A class for a program that plays a card game called CardMatch.
 * Serves as a blueprint class for a ComputerPlayer object, which represents
 * a single CardMatch computer player
 *
 */

import java.util.*;

public class ComputerPlayer extends Player {
    
    /*
     * constructor - takes the the name of the player and calls the super's constructor
     */
    public ComputerPlayer(String name) {
        super(name);
    }

     /* 
     * displayHand - an accessor method that overrides the inherited version and prints
     * the number of cards in the ComputerPlayer's hand
     */
    public void displayHand() {
        System.out.println(this.getName() + "'s hand:");
        if (this.getNumCards() == 1) {
            System.out.println("  1 card");
        } else {
            System.out.println("  " + this.getNumCards() + " cards");
        }
    }

    /*
     * getPlay - an accessor method that overrides the inherited version
     */
    public int getPlay(Scanner console, Card top) {
        int[] possiblePlays = new int[CardMatch.MAX_CARDS];
        int numPossiblePlays = 0;

        for (int i = 0; i < this.getNumCards(); i++) {
            Card card = this.getCard(i);

            if (card.getValue() == top.getValue() || card.getColor() == top.getColor()) {
                possiblePlays[numPossiblePlays] = i;
                numPossiblePlays++;
            }
        }

        if (numPossiblePlays == 0) {
            return -1;
        } else {
            int best = 0;
            int bestIndex = 0;

            for (int i = 0; i < numPossiblePlays; i++) {
                int index = possiblePlays[i];
                Card card = this.getCard(index);
                
                if (card.getValue() > best) {
                    best = card.getValue();
                    bestIndex = index;
                }
            }
            
            return bestIndex;
        }
    }

}
