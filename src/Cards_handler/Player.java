package Cards_handler;

public class Player {
    public Card[] holeCards = new Card[2];

    //constructor
    public Player(){
    }

    public Player(Card card1, Card card2){
        holeCards[0] = card1;
        holeCards[1] = card2;
    }

    //methods
    public void setCard(Card card, int cardNum){
        holeCards[cardNum] = card;
    }

    public Card getCard(int cardNum){
        return holeCards[cardNum];
    }

    public int holeCardsSize(){
        return holeCards.length;
    }

    public void printPlayerCards(int playerNumber){
        System.out.println("Player " + (playerNumber+1) + " hole cards:");
        for (int i=0;i<2;i++){
            System.out.println(holeCards[i].toString());
        }
        System.out.println("\n");
    }    
}
