/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author E0015796
 */
public class Player {
    
    private String playerId;
    private String playerName;
    private ArrayList<UNOCard> playerhand = new ArrayList<UNOCard>();
    
public Player()
{
    
}

    public Player(String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public UNOCard getCardFromHand(int i)
    {
        return playerhand.remove(i);
    }
    
    public void setCardToHand(UNOCard card)
    {
         this.playerhand.add(card);
    }

    
//    public void removecard(String removecard)
//    {
//        for(int i=0;i<getCardholder().size();i++)
//        {
//            if(getCardholder().get(i)==removecard)         
//                getCardholder().remove(i);
//               break;
//           
//        }
//    }

    @Override
    public String toString() {
        return "Player:" + "playerId=" + playerId + ", playerName=" + playerName + "\nCards in hand:\n\t\t\t" + playerhand+"\n\t" ;
    }
    
    

}
