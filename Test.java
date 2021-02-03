/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game_Of_War;

/**
 *
 * @author Tarun
 */
public class Test {
    public static void main(String[] args) {
        Card c = new Card("Hearts","Two");
        System.out.println(c);
        System.out.println(c.getSuit());
        System.out.println(c.getRank());
        System.out.println(c.getValue());
        
        Card d = new Card("Spades","Four");
        System.out.println(d);
        System.out.println(d.getSuit());
        System.out.println(d.getRank());
        System.out.println(d.getValue());
        
        System.out.println("\n"+(d.getValue()>c.getValue()));
    }
}
