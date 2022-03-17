package Chapter07;
//(Simulation: coupon collector’s problem) Coupon collector is a classic statistics
//problem with many practical applications. The problem is to repeatedly pick
//objects from a set of objects and find out how many picks are needed for all the
//objects to be picked at least once. A variation of the problem is to pick cards from
//a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
//before you see one of each suit. Assume a picked card is placed back in the deck
//before picking another. Write a program to simulate the number of picks needed
//to get four cards from each suit and display the four cards picked (it is possible a
//card may be picked twice). Here is a sample run of the program:
//Queen of Spades
//5 of Clubs
//Queen of Hearts
//4 of Diamonds
//Number of picks: 12

public class exercise24 {
    //I'm very proud of what I've made here
    public static void main(String[] args) {
        //set up decks and names
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] deck = new int[52];
        for (int i = 0; i < 52; i++) {
            deck[i] = i;
        }

        int[] the4Cards = new int[4];  //set up 4 card array and initialize all to -1
        for (int i = 0; i < 4; i++) {
            the4Cards[i] = -1;
        }
        int cardPickingCounter = 0; //set up counter

        while (!allCardsPicked(the4Cards)) { //while the cards haven't all been picked
            shuffleDeck(deck); //shuffle deck
            int topCard = deck[0]; //pull a card
            cardPickingCounter++; //up the card counter
            int topCardSuit = getSuit(topCard); //get the card's suit
            if (suitExists(topCardSuit, the4Cards)) { //if the suit exists, just up the counter
                cardPickingCounter++;
            } else {
                the4Cards[topCardSuit] = topCard; //if suit doesn't exist, save card and up counter
                cardPickingCounter++;
            }
            if (allCardsPicked(the4Cards)) { //if all the cards have been picked, print and exit
                printDeck(the4Cards, suits, cards);
                System.out.println("Number of picks: " + cardPickingCounter);
            }
        }
    }


    public static boolean allCardsPicked(int[] the4Cards) {
        for (int i = 0; i < 4; i++) {
            if (the4Cards[i] == -1) {
                return false;
            }
        }
        return true;
    }


    public static void shuffleDeck(int[] deck) {
        for (int i = 0; i < 52; i++) {
            int tempLocation = (int) (Math.random() * 52);
            int temp = deck[tempLocation];
            deck[tempLocation] = deck[i];
            deck[i] = temp;
        }
    }

    public static int getSuit(int card) {
        return card / 13;
    }

    public static boolean suitExists(int suit, int[] the4Cards) {
        if (the4Cards[suit] == -1) {
            return false;
        }
        return true;
    }

    public static void printDeck(int[] deck, String[] suits, String[] cards) {
        for (int i = 0; i < deck.length; i++) {
            System.out.print(cards[deck[i] % 13] + " of ");
            System.out.println(suits[deck[i] / 13]);
        }
    }

    //helper methods that I will copy/paste to exercises for speeding up testing purposes
    public static void printArray(double[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }

    public static void printArray(String[] array) {
        System.out.println("The array is: " + java.util.Arrays.toString(array));
    }
}
