/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanogridapp;

import nanogridgame.GridSolution;
import nanogridgame.GridSolutions;
import nanogridgame.NanoGridBoard;
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
        GridSolution s = new  GridSolution();
        Integer[] cnt = {1};
        s.createSolutions(cnt, 5);
        
        NanoGridParameters p = new NanoGridParameters();
        p.Columns =15;
        p.Rows =15;
        p.MaxColumnSquares=10;
        p.MaxRowSquares=10;
            
        NanoGridBoard control = new NanoGridBoard(p);
        control.printBoard(System.out);
        GridSolutions sols = new GridSolutions(p);
        boolean dup = sols.checkDuplicateSolitions(control);
        System.out.printf("\nDuplcate found  =  %s\n",dup );
    }
    
}
