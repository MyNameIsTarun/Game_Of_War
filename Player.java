/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Of_War;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tarun
 */
public class Player {
    
    private String name;
    private LinkedList<Card> all_cards;
    
    public Player(String name){
        this.name = name;
        all_cards = new LinkedList();
    }
    
    //removing and returning card from the head(front) of the list
    public Card remove_one(){
        return all_cards.remove();
    }
    
    //OverLoaded methods
    //if List is passed in the parameter then first method will run
    //if single card object is passed then the second methos will run
    //Cards are added at the end
    //first overLoaded method
    public void add_cards(List cards){
        all_cards.addAll(cards);
    }
    //second overLoaded method
    public void add_cards(Card card){
        all_cards.add(card);
    }
    
    @Override
    public String toString(){
        return "Player "+name+" has "+all_cards.size()+" cards.";
    }
}
