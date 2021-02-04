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
public class Game_Logic {
    public static void main(String[] args) {
        
        //Game Setup
        //Creating Players
        Player p1 = new Player("One");
        Player p2 = new Player("Two");
        
        //Creating Deck and shuffling it
        Deck deck = new Deck();
        deck.shuffle();
        
        //Dividing the deck evenly between two players
        //26 because half of 52 cards is 26
        for(int i=0;i<26;i++){
            p1.add_cards(deck.deal_one());
            p2.add_cards(deck.deal_one());
        }
        
        //On Game
        boolean gameOn = true;
        int roundNo = 0;
        
        while(gameOn){
            roundNo += 1;
            System.out.println("Round No. "+roundNo);
            
            //Checking if Players are out of cards
            if(p1.size() == 0){
                System.out.println("Player One, out of cards! Player Two wins!");
                break;
            }
            if(p2.size() == 0){
                System.out.println("Player Two, out of cards! Player One wins!");
                break;
            }
            
            //On each new round
            List<Card> p1_cards = new ArrayList();
            p1_cards.add(p1.remove_one());
            
            List<Card> p2_cards = new ArrayList();
            p2_cards.add(p2.remove_one());
            
            //Assuming at war
            boolean atWar = true;
            while(atWar){
                if(p1_cards.get(p1_cards.size()-1).getValue() > p2_cards.get(p2_cards.size()-1).getValue()){
                    System.out.println(p1_cards.get(p1_cards.size()-1).getValue()+" > "+p2_cards.get(p2_cards.size()-1).getValue());
                    p1.add_cards(p2_cards);
                    p1.add_cards(p1_cards);
                    System.out.println("Player One won this round and now has "+p1.size()+" cards and player Two cards reduces to "+p2.size()+".\n");
                    break;
                }
                else if(p1_cards.get(p1_cards.size()-1).getValue() < p2_cards.get(p2_cards.size()-1).getValue()){
                    System.out.println(p1_cards.get(p1_cards.size()-1).getValue()+" < "+p2_cards.get(p2_cards.size()-1).getValue());
                    p2.add_cards(p1_cards);
                    p2.add_cards(p2_cards);
                    System.out.println("Player Two won this round and now has "+p2.size()+" cards and player One cards reduces to "+p1.size()+".\n");
                    break;
                }
                //atWar
                else{
                    System.out.print(p1_cards.get(p1_cards.size()-1).getValue()+" = "+p2_cards.get(p2_cards.size()-1).getValue());
                    System.out.println("\tAt War!!!");
                    //Checking if players has minimum 5 cards or not
                    if(p1.size() < 5){
                        System.out.println("Player One unable to declare war.");
                        System.out.println("PLAYER TWO WINS!");
                        gameOn = false;
                        break;
                    }
                    if(p2.size() < 5){
                        System.out.println("Player Two unable to declare war.");
                        System.out.println("PLAYER ONE WINS!");
                        gameOn = false;
                        break;
                    }
                    
                    //adding 5 5 cards to both player hands
                    for(int i=0;i<5;i++){
                        p1_cards.add(p1.remove_one());
                        p2_cards.add(p2.remove_one());
                    }
                }
            }
        }
    }
}
