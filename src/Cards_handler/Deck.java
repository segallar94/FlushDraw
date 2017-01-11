package Cards_handler;
import java.util.Random;

public class Deck
{
    public Card[] cards = new Card[52];
    
    public Deck()
    {
        int i = 0;
        for(short a=0; a<4; a++)
        {
            for(short b=0; b<13; b++)
            {
                cards[i++] = new Card(a,b);
            }
        }
    }
    
    public void shuffle(){
        int len = cards.length;
        Random random = new Random();
        for (int i=0; i<len; i++){
            int change = i + random.nextInt(len - i);
            swapCards(i, change);
        }
    }
  
    public Card getCard(int cardNum){
        return cards[cardNum];
    }
    
    public void printDeck(){
        for(int i=0; i<cards.length; i++){
            System.out.println((i+1) + ": " + cards[i].toString());
        }
        System.out.println("\n");
    }
    
    public int findCard(Card card){
        for (int i=0;i<52;i++){
            if (Card.sameCard(cards[i], card)){
                return i;
            }
        }
        return -1;
    }
    
    private void swapCards(int i, int change){      
        Card temp = cards[i];
        cards[i] = cards[change];
        cards[change] = temp;
    }
    
    public void cutDeck(){
    Card[] temp = new Card[52];
    Random random = new Random();
    int cutNum = random.nextInt(52);

    System.arraycopy(this.cards,      0, temp, 52-cutNum,   cutNum);
    System.arraycopy(this.cards, cutNum, temp,         0, 52-cutNum);

    this.cards = temp;
    }
}
