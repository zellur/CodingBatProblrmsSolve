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
public class ScoresClump {
    
  public boolean scoresClump(int[] scores) {
      
  if (scores.length < 3)

    return false;

   
  for (int i = 0; i < scores.length-2; i++) {
    if (scores[i+2] - scores[i+1] <= 2 && scores[i+2] - scores[i] <= 2)

      return true;

  }

  return false;


}
}