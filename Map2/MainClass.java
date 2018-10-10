/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import Ap.ScoresClump;

/**
 *
 * @author rakib
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ScoresClump clum = new ScoresClump();
        int [] scores = {3,4,5};
        System.out.println(clum.scoresClump(scores));
        
    }
    
}
