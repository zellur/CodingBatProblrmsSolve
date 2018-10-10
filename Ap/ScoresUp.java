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
public class ScoresUp {
    
    public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  
  for(int i =0; i<key.length;i++){
    if(key[i] == answers[i]){
      score = score+4;
    }
    if(key[i] != answers[i] && answers[i] != "?"){
      score = score - 1;
    }
  }
  return score;
}

}
