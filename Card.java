/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Of_War;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tarun
 */
public class Card {
    
    private static final Map<String,Integer> values;
    
    static{
        values = new HashMap();
        values.put("Two",2);values.put("Three",3);
        values.put("Four",4);values.put("Five",5);
        values.put("Six",6);values.put("Seven",7);
        values.put("Eight",8);values.put("Nine",9);
        values.put("Ten",10);values.put("Jack",11);
        values.put("Queen",12);values.put("King",13);
        values.put("Ace",14);
    }
    
    private final String suit;
    private final String rank;
    private final int value;
    
    public Card(String suit,String rank){
        this.suit = suit;
        this.rank = rank;
        this.value = values.get(rank);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }    
    
    public int getValue() {
        return value;
    }
    
    @Override
    public String toString(){
        return rank+" of "+suit;
    }
}
