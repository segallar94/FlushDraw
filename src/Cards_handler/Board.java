package Cards_handler;

public class Board {
    private Card[] board = new Card[5];
    private Card[] burnCards = new Card[3];

    //constructor
    public Board(){
    }
   
    public Card getBoardCard(int cardNum){
        return this.board[cardNum];
    }

    public Card getBurnCard(int cardNum){
        return this.burnCards[cardNum];
    }

    protected int boardSize(){
        return board.length;
    }
    
    public void setBurnCard(Card card, int cardNum){
        this.burnCards[cardNum] = card;
    }
    
    public void setBoardCard(Card card, int cardNum){
        this.board[cardNum] = card;
    }
    
    public void printBoard(){
        System.out.println("The board contains the following cards:");
        for(int i =0; i<board.length;i++){
            System.out.println(i+1 + ": " + getBoardCard(i).toString());
        }
        System.out.println("\n");
    }

    public void printBurnCards(){
        System.out.println("The burn cards are:");
        for(int i =0; i<burnCards.length;i++){
            System.out.println(i+1 + ": " + getBurnCard(i).toString());
        }
        System.out.println("\n");
    }
}
