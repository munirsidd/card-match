# CardMatch

## Overview

CardMatch is a two-player card game inspired by Uno. This README provides an overview of the key components, functionality of the game, and the rules to play.

## Game Rules

**Objective**: The objective of the CardMatch game is to earn points by making strategic plays and managing your hand of cards effectively.

### Game Setup

1. **Players**: The game is played between two players - a human player and a computer player.

2. **Deck**: A standard deck of cards is used, which consists of cards with four different colors (blue, green, red, and yellow) and values from 0 to 9 for each color.

3. **Initial Hands**: At the beginning of the game, both players are dealt an initial hand of cards, typically with an equal number of cards.

### Gameplay

1. **Start of Game**: The game starts with a card placed face-up on the discard pile. This card is referred to as the "top card."

2. **Player Turns**: Players take turns to play cards or draw cards. The player who goes first is typically the human player.

3. **Making Plays**:
   - On your turn, you can choose to play a card from your hand if it matches the color or value of the top card on the discard pile. To play a card, you must specify the index of the card in your hand.
   - If you don't have a matching card or prefer to draw a card instead, you can choose to draw a card by entering -1. This option allows you to add a card to your hand from the deck.

4. **Matching Rules**:
   - A card matches if it has the same color or the same value as the top card on the discard pile.
   - For example, if the top card is "blue 3," you can play any card with the color "blue" or a card with the value "3."

5. **Winning the Game**:
   - The game can end in one of two ways:
     - If a player successfully matches and discards a card, reducing their hand to zero cards.
     - If a player accumulates the maximum allowed number of cards in their hand (as specified in the game rules), the game ends, and there is a penalty associated with this situation.

6. **Points**:
   - Points are earned based on the cards played by the winning player. Each card's value contributes to the player's total points.
   - The winner receives points equal to the total value of the cards in the opponent's hand, excluding any penalty for accumulating the maximum number of cards.

7. **Tiebreaker**: If the total points are tied at the end of the game, it's considered a tie, and no points are earned.

## Files

### 1. **Card.java**

- This file defines the `Card` class, which represents a playing card in the game.
- It provides methods to set and retrieve the card's color and value.
- The class includes methods for checking the validity of colors, setting color and value, accessing color and value, and checking for matches and equality between cards.

### 3. **Deck.java**

- The `Deck` class represents a deck of CardMatch cards.
- It provides methods for constructing, shuffling, and drawing cards from the deck.
- The deck can be reset to its initial state, ensuring the same ordering of cards upon reset.

### 4. **Player.java**

- The `Player` class serves as a blueprint for a player in the CardMatch game.
- It includes fields for the player's name, their hand of cards, and the number of cards in their hand.
- The class provides methods for retrieving the player's name, the number of cards in their hand, getting a specific card in the hand, calculating the total value of the hand, displaying the hand, removing a card from the hand, and determining the player's next play.

### 5. **ComputerPlayer.java**

- The `ComputerPlayer` class is an extension of the `Player` class.
- It is designed for computer-controlled players in the CardMatch game.
- The class includes overridden methods for displaying the computer player's hand, as well as making intelligent plays based on card values and colors.

### 2. **CardMatch.java**

- The `CardMatch` class is the main class for the CardMatch game.
- It serves as a blueprint class for a `CardMatch` object, which maintains the state of the game.
- The class includes constants for the number of players, initial cards per player, maximum cards, and maximum cards penalty.
- It contains methods for game initialization, dealing initial hands, playing the game, printing game state, executing one play, checking if the game is over, and reporting results.
- The game is played between a human player and a computer player.

## How to Play

1. Run the `CardMatch` class with the provided Java program.
2. Enter your name when prompted.
3. The game will start, and you'll play against the computer player.
4. Make strategic plays to match the top card on the discard pile or draw a card when necessary.
5. The game ends when a player has no cards or reaches the maximum allowed number of cards.
6. The winner and points earned are reported at the end of the game.

## Strategy Tips

- Keep an eye on the top card on the discard pile and try to match it if possible.
- Manage your hand effectively to avoid accumulating the maximum number of cards and incurring a penalty.
- Consider the point values of cards when making plays to maximize your score.

Remember, the CardMatch game is about strategy and making the right decisions at the right time. Enjoy the game and have fun competing with the computer player!