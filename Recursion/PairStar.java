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
public class PairStar {
    
    public String pairStar(String str) {
  if(str.length()<2)return str;
  
  String res = "";
  
  if(str.charAt(0)==str.charAt(1)){
    res += str.charAt(0)+"*";
  }else{
    res+=str.charAt(0);
  }
  return res+pairStar(str.substring(1));
}

}
