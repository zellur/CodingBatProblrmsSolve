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
public class CountAbc {
    
    public int countAbc(String str) {
  if(str.length()<3) return 0;
  int count = 0;
  if(str.substring(0,3).contains("abc")||str.substring(0,3).contains("aba")) count++;
  
  return count+countAbc(str.substring(1));
}

}
