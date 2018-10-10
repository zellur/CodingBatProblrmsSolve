/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rakib
 */
public class FirstSwap {
    
    public String[] firstSwap(String[] strings) {
  
  
  Map<String, Integer> map = new HashMap<String, Integer>();
     
  for (int i = 0; i < strings.length; i++) {
     
    String key = String.valueOf(strings[i].charAt(0));
     
    if (map.containsKey(key)) {
       
      int val = map.get(key);
      if (val == -1) {
        continue;
      }
       
      // swap
      int    pos   = map.get(key); 
      String tmp   = strings[pos];
      strings[pos] = strings[i];
      strings[i]   = tmp ;
       
      // set a flag
      map.put(key, -1);
       
    } else {
      map.put(key, i);
    }
     
  }
   
  return strings;
}
    
    
}
