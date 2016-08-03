/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author E0015796
 */
public class UNOGame {
    
    private String gameId;
    private ArrayList<Player> playerlist;
    private String gameStatus;
    private Deck deckcard;
    private UNOCard discardPile;

    public UNOGame(String gameId, ArrayList<Player> playerlist, String gameStatus, Deck deckcard, UNOCard discardPile) {
        this.gameId = gameId;
        this.playerlist = playerlist;
        this.gameStatus = gameStatus;
        this.deckcard = deckcard;
        this.discardPile = discardPile;
    }

    public UNOGame(String gameId, ArrayList<Player> playerlist, String gameStatus, Deck deckcard) {
        this.gameId = gameId;
        this.playerlist = playerlist;
        this.gameStatus = gameStatus;
        this.deckcard = deckcard;
    }
    

    public String getGameId() {
        return gameId;
    }

    public ArrayList<Player> getPlayerlist() {
        return playerlist;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public Deck getDeckcard() {
        return deckcard;
    }

    public UNOCard getDiscardPile() {
        return discardPile;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setPlayerlist(ArrayList<Player> playerlist) {
        this.playerlist = playerlist;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setDeckcard(Deck deckcard) {
        this.deckcard = deckcard;
    }

    public void setDiscardPile(UNOCard discardPile) {
        this.discardPile = discardPile;
    }
    
//    public void AddnewPlayer(Player p)
//    {
//        playerlist.add(p);
//    }
//   
//    public void takeCardPile (String discard)
//    {
//        for (int i=0; i<cardPile.size();i++)
//        {
//            if (cardPile.get(i)==discard)
//            {
//                cardPile.remove(i);
//            }
//        }
//    }
//    
//    
//    public void changeStatus(String status)
//    {
//        setGameStatus(gameStatus);
//        getGameStatus();
//    }
    
    public Deck ShuffleDeck(Deck d)
    {
        Collections.shuffle(d.getDeck());
        return d;
    }
    
    public void startPlay()
    {
        deckcard=this.ShuffleDeck(deckcard.addNewDeck());
        int counter=1;
        while(counter<=7)
        {
            for(Player player:playerlist)
            {
                UNOCard handcard=deckcard.getCardFromDeck();
                player.setCardToHand(handcard);
            }
            
            counter ++;
        }
        
        discardPile=deckcard.getCardFromDeck();
        
    }

    @Override
    public String toString() {
        return "Game id="+gameId+"\nDiscard Card="+ discardPile+"\nStatus="+gameStatus+"\n"+deckcard +"\n\t"+playerlist;
    }
    
    
    
}
