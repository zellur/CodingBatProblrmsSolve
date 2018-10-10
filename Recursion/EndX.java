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
public class EndX {
    public String endX(String str) {
  if(str.length()<1)return str;
  
  String first  = "";
  String last = "";
  
  if(str.charAt(0)=='x'){
    last+="x";
  }else{
    first+=str.charAt(0);
  }
  
  return first+endX(str.substring(1))+last;
}

}
