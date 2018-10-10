/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rakib
 */
public class Square {
    public List<Integer> square(List<Integer> nums) {
  
  List<Integer>res = new ArrayList();
  
  for(int num : nums ){
    int a = num*num;
    res.add(a);
  }
  return res;
}



}
