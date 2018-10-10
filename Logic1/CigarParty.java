/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic1;

/**
 *
 * @author rakib
 */
public class CigarParty {
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
         
        if(cigars >= 40 && (cigars <= 60 || isWeekend)) return true;
  return false;
}
    
}
