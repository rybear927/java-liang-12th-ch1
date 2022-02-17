package Chapter03;
//(Game: pick a card) Write a program that simulates picking a card from a deck
//of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
//Here is a sample run of the program:
//The card you picked is Jack of Hearts

public class exercise24 {
    public static void main(String[] args) {
            System.out.println("The card you picked is " + getRank() + " of " + getSuit());
    }

    public static String getSuit(){
        int suit = (int)(Math.random() * 4) + 1;
        switch (suit) {
            case 1: return "Clubs";
            case 2: return "Diamonds";
            case 3: return "Hearts";
            case 4: return "Spades";
            default: return null;
        }
    }

    public static String getRank() {
        int rank = (int)(Math.random() * 13) + 1;
        switch (rank) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return null;
        }
    }
}
