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
public class Allswap {
    
  public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i=0; i<strings.length; i++) {
    String key = strings[i].substring(0, 1);
    if (map.containsKey(key)) {
      int match = map.get(key);
      String temp = strings[match];  // swap strings at match/i
      strings[match] = strings[i];
      strings[i] = temp;
      map.remove(key);  // so this old one won't match anything
    }
    else {
      map.put(key, i);
    }
  }
  return strings;
}

}
