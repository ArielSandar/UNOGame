/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoapp;
import Model.Deck;
import Model.UNOCard;
import Model.Player;
import Model.UNOGame;
import java.util.ArrayList;

/**
 *
 * @author Ei
 */
public class UNOApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UNOApp unoapp=new UNOApp();
        Deck unodeck=new Deck();
        UNOGame unogame;
        
        Player p1 = new Player("id0001", "Ei Sandar");
        Player p2 = new Player("id0002", "Ariel");
        Player p3 = new Player("id0003", "May Thin");
        Player p4 = new Player("id0004", "Kaung Myat");
        Player p5 = new Player("id0005", "Zell");
        
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);
        
        String gameId="g001";
        String status="Waiting";
        
        unogame=new UNOGame(gameId, playerList, status, unodeck);
        unogame.startPlay();
        
        System.out.println(unogame);
        //unodeck=unogame.ShuffleDeck(unodeck.addNewDeck());
        //System.out.println(unodeck);

    }
    
}
