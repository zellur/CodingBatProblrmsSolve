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
public class WordsCount {
    
  public int wordsCount(String[] words, int len) {
  int count = 0;
  for(String word : words){
    if(word.length() == len) count++;
  }
  return count;
}

}
