/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanogridapp;

import nanogridgame.NanoGridGame;

/**
 *
 * @author Gateway1
 */
public class NanoGridApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NanoGridAppHost host = new NanoGridAppHost();
       host.CreateGame(5,10);
       host.displayGame();
    }
    
}
