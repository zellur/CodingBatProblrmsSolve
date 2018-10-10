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
public class AvverageScores {
    
    public int scoresAverage(int[] scores) {
  
  int halfArray = scores.length/2;
  
  int first = 0;
  
  int last =0;
  
  for(int i =0; i<halfArray; i++){
    first = first+scores[i];
  }
  
   for(int i = halfArray; i<scores.length; i++){
    last = last+scores[i];
  }
  
  if(first/halfArray>last/halfArray)return first/halfArray;
  return last/halfArray;
  
  
}

}
