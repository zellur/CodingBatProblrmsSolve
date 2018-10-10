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
public class ParenBit {
    
    public String parenBit(String str) {
  
 int len = str.length();
 
 if(str.charAt(0)!='('){
   
   if(str.charAt(len-1)!=')'){
     return parenBit(str.substring(1,len-1));
   }
   return parenBit(str.substring(1));
 }
 
 if(str.charAt(len-1)!=')'){
   return parenBit(str.substring(0,len-1));
 }
 return str;
}

}
