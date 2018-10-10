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
public class Pair {
    public int countPairs(String str) {
  if(str.length()<3)return 0;
  int count =0;
  if(str.charAt(0)==str.charAt(2)) count++;
  
  return count+countPairs(str.substring(1));
}

}
