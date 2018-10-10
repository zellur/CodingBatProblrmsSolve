/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author rakib
 */
public class MergeTwo {
    
    public String[] mergeTwo(String[] a, String[] b, int n) {
  int totalLength = a.length+b.length;
  String [] bothArray = new String[totalLength];
  int j = 0;
  for(int i = 0; i < totalLength; i++){
    if(i<a.length){
    bothArray[i] = a[i];
    }else{
      bothArray[i] = b[j];
      j++;
    }
  }
  
 Set<String> set = new HashSet<String>();
  
  for(int i = 0; i < totalLength; i++){
  set.add(bothArray[i]);
}

List<String> list = new ArrayList<String>(set);
String [] res = new String[n];
String [] again =  new String[set.size()];

for(int i = 0; i<again.length; i++){
  
  again[i] = list.get(i);
}

Arrays.sort(again);

for(int i = 0; i<res.length; i++){
  
  res[i] = again[i];
}
return res;
}

}
