
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nene Wann
 * @modified by Nene wann
 * 2022-02-31
 * 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        
         Card c = new Card();
         for (int i=0; i<magicHand.length; i++)
        {
           
           magicHand[i]=c;
           break;
         }
        
          for (Card magicHand1 : magicHand)
        {
            
            c.setValue(c.pickValue());
            c.setSuit(c.SUITS[c.pickSuit()]);
            System.out.println(magicHand1.getValue());
             System.out.println(magicHand1.getSuit());
            
        
              
           System.out.println("Pick the value of any card from 1 to 13");
          
            int value = sc.nextInt();
        
            System.out.println("PICK!! Hearts; Diamonds, Spades; clubs;");
        
             String suit= sc.next();
           System.out.print("The card you picked is : "+value);
           System.out.println(" of " +suit);
           
        
        
           if (c.getValue()==value && suit==c.getSuit())
           
              c.printInfo();
    } 
    }

} 

    
                
                
                
          
    


