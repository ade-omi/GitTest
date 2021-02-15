/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICE1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @modifier Adedapo Omiyale
 * @studentNumber 991618304
 * @author dancye
 */
public class CardTrick {
//change

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // random number gen
            int randValue = (int) (Math.random() * 13 + 1);
            int randSuit = (int) (Math.random() * 4);
            c.setValue(randValue);
            c.setSuit(Card.SUITS[randSuit]);
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card any card, Enter value(1 to 13)");
        int userValue = sc.nextInt();

        System.out.println("Pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int userSuit = sc.nextInt();
        //user card
        Card userC = new Card();
        userC.setSuit(Card.SUITS[userSuit]);
        userC.setValue(userValue);
        System.out.println("Heres your Card: " + userC);

        // and search magicHand here
        boolean match = false;
        for (Card card : magicHand) {
            if (card.getValue() == userC.getValue()
                    && card.getSuit().equals(userC.getSuit())) {
                match = true;
                break;
            }
        }
        //LUCKYCARD 
        Card luckCard = new Card();
        luckCard.setValue(7);
        luckCard.setSuit(Card.SUITS[2]);
        
        //Then report the result here
        System.out.println("Your guess was: " + match);

        System.out.println("Here is the cards in the hand:\n =======================");
        for (Card card : magicHand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }
    }

}
