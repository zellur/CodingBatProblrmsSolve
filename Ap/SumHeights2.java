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
public class SumHeights2 {
    
    public int sumHeights2(int[] heights, int start, int end) {
  int res = 0;
  
  for(int i = start; i<end; i++){
    int add = Math.abs(heights[i]-heights[i+1]);
    if(heights[i] < heights[i+1]){
      res += 2*add;
    }else{
      res+=add;
    }
  }
  return res;
}

}
