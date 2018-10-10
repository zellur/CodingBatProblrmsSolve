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
public class Endy {
    
    public int[] copyEndy(int[] nums, int count) {
  int[]res = new int[count];
  int index = 0;
  for(int m : nums){
    if(isEndy(m) && index<count){
      res[index] = m;
      index++;
    }
  }
  return res;
}

public boolean isEndy(int n){
  if(n>=0 && n<=10)return true;
  if(n>=90 && n<=100)return true;
  return false;
}
}
