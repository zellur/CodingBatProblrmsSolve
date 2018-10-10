/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author rakib
 */
public class CountHi {
    
    public int countHi(String str) {
  
  if(str.length()<2)return 0;
  int count = 0;
  
  if(str.charAt(0) == 'h' && str.charAt(1)=='i') count++;
  
  return count+ countHi(str.substring(1));
}

}
