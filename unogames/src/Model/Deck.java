/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author E0015796
 */
public class Deck {
    private final int NumofCards=108;
    private ArrayList<UNOCard> deck=new ArrayList<UNOCard>();
    
    public Deck()
    {
        
    }

    public void setDeck(ArrayList<UNOCard> deck) {
        this.deck = deck;
    }

    public int getNumofCards() {
        return NumofCards;
    }

    public ArrayList<UNOCard> getDeck() {
        return deck;
    }

    public void setCardToDeck (UNOCard card)
    {
        this.getDeck().add(card);
    }
    
    public UNOCard getCardFromDeck()
    {
        return this.getDeck().remove(0);
    }

    @Override
    public String toString() {
        return "Cards on deck"  + getDeck().size() + "\n"+ deck ;
    }
    
    
 
    public Deck addNewDeck()
    {
        String color[]={"Red","Yellow","Green","Blue","RYGB"};
        String type[]={"Normal","Skip","Reverse","Draw2","Wild","WildDrawFour"};
        
        UNOCard cards;      
        Deck deckcard=new Deck();
        
        
        for (int c=0;c<color.length;c++)
        {
            int typeIndex=0;
            
            for (int n=0;n<=12;n++)
            {
                int value=n;
                
                if (n>9){
                    typeIndex++;
                    value=20;
                }
                
                if(c!=4)
                {
                    cards=new UNOCard (color[c],type[typeIndex],value,color[c]+type[0]+value);
                    deckcard.setCardToDeck(cards);
                    
                    if (n!=0)deckcard.setCardToDeck(cards);
                }
            }
            
            if (c==4)
            {
               int counter=1;
               while (counter <=4)
               {
                   for (int t=4;t<type.length;t++)
                   {
                       cards=new UNOCard(color[c],type[t],50,color[c]+type[t]+50);
                       deckcard.setCardToDeck(cards);
                   }
                   
                   counter ++;
               }
            }
            
        }
       
         
        return deckcard;
    }
    
}
