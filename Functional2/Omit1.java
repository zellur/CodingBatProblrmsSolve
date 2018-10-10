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
public class Omit1 {
    
    public List<Integer> noNeg(List<Integer> nums) {
  List<Integer>res = new ArrayList();
  
  for(int num : nums){
    if(num>=0){
      res.add(num);
    }
  }
  return res;
}

}
