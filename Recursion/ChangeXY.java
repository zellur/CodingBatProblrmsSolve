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
public class ChangeXY {
    
    public String changeXY(String str) {
  if(!str.contains("x"))return str;

  String res = "";
  if(str.charAt(0) != 'x') {
    res+=String.valueOf(str.charAt(0));
  }
  if(str.charAt(0) == 'x'){
   res+="y";
  }
  return res+=changeXY(str.substring(1));
}

}
