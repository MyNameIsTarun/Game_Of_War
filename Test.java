/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Of_War;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tarun
 */
public class Test {
    public static void main(String[] args) {
        List<Card> list = new ArrayList();
        Deck deck = new Deck();
        deck.shuffle();
        for(Card card : deck.getAllCards()){
            System.out.println(card);
        }
        System.out.println("");
        System.out.println(deck.getAllCards().size());
        
        Player p = new Player("Tarun");
        System.out.println(p);
        System.out.println(deck.getAllCards().size());
        
        p.add_cards(deck.deal_one());
        System.out.println(p);
        System.out.println(deck.getAllCards().size());
        
        list.add(deck.deal_one());list.add(deck.deal_one());list.add(deck.deal_one());
        p.add_cards(list);
        System.out.println(p);
        System.out.println(deck.getAllCards().size());
        
        for(int i=0;i<4;i++){
            System.out.println(p.remove_one());
        }
    }
}
