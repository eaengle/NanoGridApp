/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanogridapp;

import java.lang.reflect.Array;
import nanogridgame.INanoGridHost;
import nanogridgame.NanoGridBoard;
import nanogridgame.NanoGridGame;
import nanogridgame.NanoGridParameters;

/**
 *
 * @author Gateway1
 */
public class NanoGridAppHost implements INanoGridHost{
  
    NanoGridGame Game;
    public void CreateGame(int cols,int rows){
        NanoGridParameters p = new NanoGridParameters();
        Game = new NanoGridGame(p);
        Game.create(cols,rows);
        
    }
    
    public void displayGame(){
        
        NanoGridBoard board = Game.getBoard();
       
        Integer [][]rcnts = board.getRowCounts();
        int rmax = GetMaxLength(rcnts);
        
        displayColumnCounts(rmax*2);
        
        for(int r=0;r <board.getColumnSize();r++){
            displayRowCounts(r,rcnts,rmax);
            for(int c=0;c<board.getRowSize();c++){
                
                System.out.printf("%c ",board.getCell(r, c));
                
            }
            
            System.out.println();
            
        }
    }

    private int GetMaxLength(Integer[][] cnts) {
        int max = 0;
        for(int i=0;i < cnts.length;i++){
            if (cnts[i].length > max)
                max = cnts[i].length;
        }
        return max;
    }

    private String GetPadding(int rmax) {
        char[]chars = new char[rmax];
        Array.setChar(chars, 0, ' ');
        return new String(chars,0,rmax);
    }

    private void displayColumnCounts(int rmax) {
        NanoGridBoard board = Game.getBoard();
        Integer [][]ccnts = board.getColumnCounts();
        int cmax = GetMaxLength(ccnts);
        for(int i = cmax;i>0;i--){
            System.out.printf(GetPadding(rmax));
                for(Integer[] col : ccnts){
            
                if (col.length >= i){
                   Integer c = col[col.length-i];
                   System.out.printf("%s ",c.toString());
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }}

    private void displayRowCounts(int r, Integer[][] rcnts, int rmax) {
        Integer[]row = rcnts[r];
        for(int i = 0;i<rmax;i++){
           if (i < row.length){
               System.out.printf("%s ", row[i].toString());
               
           }else {
               System.out.print("  ");
           }
        }
    }
}
