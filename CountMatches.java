import java.util.*;
/**
 * Write a description of class CountMatches here.
 * 
 * @colinbowen
 * @0.1
 */
public class CountMatches
{
    // instance variables - replace the example below with your own
    private PileOfCards cards;
    private DisplayCardPair displayCP;
    private Card card1;
    private Card card2;

    /**
     * Constructor for objects of class CountMatches.
     */
    public CountMatches()
    {
        playGame();
    }

    /**
     * Create a full deck of cards and shuffle it.
     */
    public void playGame()
    {
        cards = new PileOfCards();
        cards.createFullDeck();
        cards.shuffle();
        displayCP = new DisplayCardPair();
        displayCards();
        countPairs();
    }

    public void displayCards()
    {
        boolean finished = false;
        while (!cards.isEmpty()) 
        {
            card1 = cards.dealTopCard();
            card2 = cards.dealTopCard();
            displayCP.setCards(card1, card2);
            blank();
        }
        finished = true;
    }

    public void blank()
    {
        long t0,t1;
        t0=System.currentTimeMillis();
        do
        {
            t1=System.currentTimeMillis();
        }
        while (t1-t0<1000);
        
        
        do
        {
            displayCP.blankWindow();
        }
        while(t1-t0<1000);
    }

    public void countPairs()
    {

    }
}
