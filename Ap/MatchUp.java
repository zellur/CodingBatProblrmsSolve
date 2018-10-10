/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ap;

/**
 *
 * @author rakib
 */
public class MatchUp {
    
    public int matchUp(String[] a, String[] b) {
  int count = 0;
  
  for(int i =0; i<a.length;i++){
    if( a[i] != "" && b[i] != "" ){
    if(a[i].charAt(0) == b[i].charAt(0)){
      count ++;
    }
    }
  }
  return count;
}

}
