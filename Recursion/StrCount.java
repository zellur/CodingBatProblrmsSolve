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
public class StrCount {
    public int strCount(String str, String sub) {
   int len = sub.length();
  if(str.length() < len) return 0;
 
  
  if(str.substring(0,len).equals(sub)){
    return 1+strCount(str.substring(len),sub);
  }
  return strCount(str.substring(1),sub);
}

}
