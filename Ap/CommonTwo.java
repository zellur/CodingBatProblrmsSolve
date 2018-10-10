/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rakib
 */
public class CommonTwo {
    
    public int commonTwo(String[] a, String[] b) {
  
  int res = 0;
  
  Set<String> set1 = new HashSet<String>();
  Set<String> set2 = new HashSet<String>();
  
  for(int i = 0; i < a.length; i++){
  set1.add(a[i]);
}

for(int i = 0; i < b.length; i++){
  set2.add(b[i]);
}

List<String> list1 = new ArrayList<String>(set1);
List<String> list2 = new ArrayList<String>(set2);
  
  for(int i = 0; i < list1.size(); i++){
    
    for(int j = 0; j <list2.size(); j++){
      
      if(list1.get(i)==list2.get(j)){
        res++;
      }
    }
  }
  return res;
}

}
