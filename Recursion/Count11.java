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
public class Count11 {
    public int count11(String str) {
  
   if(str.length()<2) return 0;
  int count = 0;
  if(str.substring(0,2).contains("11")) {
  count++;
   if(str.length()>2){
  if(str.substring(2,3).contains("1")){
    return count+count11(str.substring(2));
  } 
   }
   return count+count11(str.substring(1));
}
 return count11(str.substring(1));
}


}
