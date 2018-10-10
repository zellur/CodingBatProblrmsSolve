/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rakib
 */
public class Square6 {
    public List<Integer> square56(List<Integer> nums) {
 
  List<Integer>res = new ArrayList();
  
  for(int num : nums){
   int a = (num*num)+10;
   if(!(a%10==5)&&!(a%10==6)) res.add(a);
  }
  
  return res;
}
 

}
