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
public class Two2 {
    
    public List<Integer> two2(List<Integer> nums) {
  
  List<Integer>res = new ArrayList();
  
  for(int num : nums){
    int a = num*2;
    if(!(a%10 == 2)){
      res.add(a);
    }
  }
  
  return res;
}

}
