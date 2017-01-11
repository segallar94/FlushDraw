package Cards_handler;
import java.util.*;

public class Card {
    public short rank, suit;
    public static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
    public static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
        "9", "10", "Jack", "Queen", "King"};
    
    public static String rankAsString( int __rank ) {
        return ranks[__rank];
    }

    Card(short suit, short rank)
    {
        this.suit=suit;
        this.rank=rank;
    }
 
    public @Override String toString()
    {
          return ranks[rank] + " of " + suits[suit];
    }
 
    public short getRank() {
         return rank;
    }
 
    public short getSuit() {
        return suit;
    }
    
    public static boolean sameCard(Card card1, Card card2){
        return (card1.rank == card2.rank && card1.suit == card2.suit);
    }
    
    class rankComparator implements Comparator<Object>{
        public int compare(Object card1, Object card2) throws ClassCastException
        {
        // verify two Card objects are passed in
            if (!((card1 instanceof Card) && (card2 instanceof Card))){
                throw new ClassCastException("A Card object was expeected.  "
                        + "Parameter 1 class: " + card1.getClass() + " Parameter"
                        + " 2 class: " + card2.getClass());
        }
            short rank1 = ((Card)card1).getRank();
            short rank2 = ((Card)card2).getRank();
            return rank1 - rank2;
        }
    }
    
    class suitComparator implements Comparator<Object>{
        public int compare(Object card1, Object card2) throws ClassCastException
       {
        // verify two Card objects are passed in
            if (!((card1 instanceof Card) && (card2 instanceof Card))){
                throw new ClassCastException("A Card object was expeected.  "
                        + "Parameter 1 class: " + card1.getClass() 
                        + " Parameter 2 class: " + card2.getClass());
        }
            short suit1 = ((Card)card1).getSuit();
            short suit2 = ((Card)card2).getSuit();
            return suit1 - suit2;
        }
    }
}
