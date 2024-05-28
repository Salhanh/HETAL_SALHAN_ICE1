/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @ModifiedBy salhanh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card userCard = new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a suit first and then a number");
        userCard.setSuit(input.next());
        userCard.setValue(input.nextInt());
        // and search magicHand here
        boolean found = false;
        for (Card n: magicHand)
        {
            if (n.getValue() == userCard.getValue() && n.getSuit().equals(userCard.getSuit()))
            {
                found = true;
                break;
            }
        }
        //Then report the result here
        
        if (found)
        {
            System.out.println("Your card was found!");
        }
        else
        {
            System.out.println("Your card was not found");
        }
        // add one luckcard hard code 2,clubs

        Card luckyCard = new Card();

        luckyCard.setValue = 4;
        luckyCard.setSuit = "Hearts";

        boolean lcFound = false;
        for (Card n: magicHand)
            {
                if (n.getValue() == luckyCard.getValue() && n.getSuit().equals(luckyCard.getSuit()))
                {
                    lcFound = true;
                }

        if (lcFound)
        {
            System.out.println("Your lucky card was found");
        }
        else 
        {
            System.out.println("Your lucky card was not found");
        }
    }
    }
    
}
