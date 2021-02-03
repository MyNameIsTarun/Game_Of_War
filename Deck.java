/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Of_War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Tarun
 */
public class Deck {
    
    private final String []suits = {"Hearts","Diamonds","Spades","Clubs"};
    private final String []ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    private List<Card> all_cards = new ArrayList<>();
    
    public Deck(){
        for(String suit : suits){
            for(String rank : ranks){
                all_cards.add(new Card(suit,rank));
            }
        }
    }
    
    public List<Card> getAllCards(){
        return all_cards;
    }
    
    public void shuffle(){
        Collections.shuffle(all_cards);
    }
    
    public Card deal_one(){
        return all_cards.remove(all_cards.size()-1);
    }
}
