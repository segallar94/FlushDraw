package flushdraw;
import Cards_handler.*;

public class FlushDraw {

    public static void main(String[] args) {
        Deck HoldemDeck = new Deck();
        Board board = new Board();
        int numPlayers = 5;
        Player[] player = new Player[numPlayers];
        int cardcount = 0;
        int burncount = 0;
        int boardcount = 0;
        
        //shuffle 3 times
        for(int i=0;i<3;i++){
            HoldemDeck.shuffle();
        }
        
        //cut deck
        HoldemDeck.cutDeck();

        //initialize players
        for (int i=0;i<numPlayers;i++){
            player[i] = new Player();
        }
        
        //Deal cards to players
        for (int i=0;i<2;i++){
            for (int j=0;j<numPlayers;j++){
                player[j].setCard(HoldemDeck.getCard(cardcount++), i);
            }
        }
        
        // Burn one card before flop
        board.setBurnCard(HoldemDeck.getCard(cardcount++), burncount++);

        // deal flop
        for (int i=0; i<3;i++){
            board.setBoardCard(HoldemDeck.getCard(cardcount++), boardcount++);
        }

        // Burn one card before turn
        board.setBurnCard(HoldemDeck.getCard(cardcount++), burncount++);

        // deal turn
        board.setBoardCard(HoldemDeck.getCard(cardcount++), boardcount++);

        // Burn one card before river
        board.setBurnCard(HoldemDeck.getCard(cardcount++), burncount++);

        // deal river
        board.setBoardCard(HoldemDeck.getCard(cardcount++), boardcount++);
        
        System.out.println("The hand is complete...\n");

        // print deck
        //HoldemDeck.printDeck();

        //print board
        board.printBoard();

        // print player cards
        System.out.println("The player cards are the following:\n");
        for (int i=0;i<numPlayers;i++){
            player[i].printPlayerCards(i);
        }

        // print burn cards
        //board.printBurnCards();
    }  
}
