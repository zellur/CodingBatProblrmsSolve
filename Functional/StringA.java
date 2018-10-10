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
public class StringA {
    public List<String> addStar(List<String> strings) {
  
  List<String>res = new ArrayList();
  
  for(String str : strings ){
    String a = str+"*";
    res.add(a);
  }
  return res;
}


}
