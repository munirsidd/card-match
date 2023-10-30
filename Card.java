/*
 * Card.java
 * 
 * A blueprint class for objects that represent a single playing card 
 * for a game in which cards have both colors and numeric values.
 * 
 */

public class Card {
    public static final int MIN_VALUE = 0;    
    public static final String[] COLORS = {"blue", "green", "red", "yellow"};
    public static final int MAX_VALUE = 9;
    private String color;
    private int value;

    /*
    * isValidColor - takes the name of a color and returns true if it is valid and false otherwise
    * inputs:
    *   color - a String representing the name of a color
    */
    public static boolean isValidColor(String color) {
        for (int i = 0; i < COLORS.length; i++) {
            if (COLORS[i].equals(color)) {
                return true;
            }
        }

        return false;
    }

    /* 
     * A constructor that calls the mutator methods to initialize the 
     * fields, so that they can perform the necessary error-checking.
     */
    public Card(String color, int value) {
        this.setColor(color);
        this.setValue(value);
    }
    
    /*
     * setColor - a mutator method that changes a Card's color
     *
     * precondition: color must be an element of COLORS
     */
    public void setColor(String color) {
        if (isValidColor(color) == false) {
            throw new IllegalArgumentException();
        }

        this.color = color;
    }

    /*
     * setValue - a mutator method that changes a Card's value
     *
     * precondition: value must be between MIN_VALUE and MAX_VALUE inclusive 
     */
    public void setValue(int value) {
        if (value < MIN_VALUE || value > MAX_VALUE) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /* 
     * getColor - an accessor method for a Card's color
     */
    public String getColor() {
        return this.color;
    }

    /* 
     * getvalue - an accessor method for a Card's value
     */
    public int getValue() {
        return this.value;
    }

     /*
     * toString - returns a string representation of the Card 
     * of the form "color value".
     */
    public String toString() {
        return this.color + " " + this.value;
    }    

    /* 
    * matches - takes another Card and returns true if the called Card
    * matches the color and/or value of the other Card, and false otherwise
    */
    public boolean matches(Card other) {
        if (other == null) {
            return false;
        }

        if (this.color == other.color || this.value == other.value) {
            return true;
        } else {
            return false;
        }
    }

    /*
    * equals - takes another Card and returns true if the two Card objects
    * have the same color and the same value, and false otherwise
    */
    public boolean equals(Card other) {
        if (other == null) {
            return false;
        }

        if (this.color == other.color && this.value == other.value) {
            return true;
        } else {
            return false;
        }
    }

}