/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanogridapp;

import nanogridgame.GridSolution;
import nanogridgame.NanoGridGame;
import nanogridgame.NanoGridParameters;

/**
 *
 * @author Gateway1
 */
public class NanoGridApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NanoGridParameters p = new NanoGridParameters();
        //NanoGridGame game = new NanoGridGame(p);
        
        GridSolution grid = new GridSolution();
        int[] cnts = new int[2];
        cnts[0] =2;
        cnts[1] =3;
        int sz =10;
        grid.createSolutions(cnts, sz);
        System.out.printf("%d\n", grid.getSolutionCount());
        grid.printSolutions((System.out));
    }
    
}
