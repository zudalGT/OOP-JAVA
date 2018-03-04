/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Playerdota;

/**
 *
 * @author zudal
 */
public class Play {
    
 
    public static void main(String[] args) {
        
        //membuat objek player_dota
        Player_dota windranger = new Player_dota();
        Player_dota earthseker = new Player_dota();
        
        //mengisi atribut player_dota
        
        windranger.name = "Windranger";
        windranger.hit = 50;
        
        
        earthseker.name = "Earthseker";
        earthseker.hit = 125;
        
        
        
        //menjalankan method
        windranger.atk();
        earthseker.atk();
        
        if (windranger.hit >= earthseker.hit){
            System.out.println(windranger.name +" VICTORY");
        } else {
            System.out.println(earthseker.name +" VICTORY");
        }
    }
}
