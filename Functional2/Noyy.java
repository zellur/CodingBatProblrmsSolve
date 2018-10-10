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
public class Noyy {
    
    public List<String> noYY(List<String> strings) {
 
  List<String>res = new ArrayList();
  
  for(String s : strings){
    s=s+"y";
    if(!s.contains("yy")) res.add(s);
  }

  return res;
}


}
