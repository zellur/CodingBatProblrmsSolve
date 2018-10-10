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
public class TolowerCase {
    
    public List<String> lower(List<String> strings) {
  
  List<String>res = new ArrayList();
  
  for(String s : strings ){
    String a = new String(s);
    res.add(a.toLowerCase());
  }
  return res;
}

}
