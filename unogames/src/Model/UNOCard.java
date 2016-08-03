/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author E0015796
 */
public class UNOCard {
    private String CardColor;
    private String CardType;
    private int CardValue;
    private String CardImage;

    public UNOCard()
    {
        
    }
    /**
     * @return the CardColor
     */
    public UNOCard(String CardColor, String CardType, int CardValue, String CardImage) {
        this.CardColor = CardColor;
        this.CardType = CardType;
        this.CardValue = CardValue;
        this.CardImage = CardImage;
    }

    public String getCardColor() {
        return CardColor;
    }

    /**
     * @param CardColor the CardColor to set
     */
    public void setCardColor(String CardColor) {
        this.CardColor = CardColor;
    }

    /**
     * @return the CardType
     */
    public String getCardType() {
        return CardType;
    }

    /**
     * @param CardType the CardType to set
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * @return the CardValue
     */
    public int getCardValue() {
        return CardValue;
    }

    /**
     * @param CardValue the CardValue to set
     */
    public void setCardValue(int CardValue) {
        this.CardValue = CardValue;
    }

    /**
     * @return the CardImage
     */
    public String getCardImage() {
        return CardImage;
    }

    /**
     * @param CardImage the CardImage to set
     */
    public void setCardImage(String CardImage) {
        this.CardImage = CardImage;
    }
      
    @Override
    public String toString() {
        return "UNOCard:" + "CardColor=" + CardColor + ", CardType=" + CardType + ", CardValue=" + CardValue + ", CardImage=" + CardImage + "\n\t\t\t";
    }

}
