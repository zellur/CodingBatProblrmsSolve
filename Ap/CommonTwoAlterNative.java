/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ap;

/**
 *
 * @author rakib
 */
public class CommonTwoAlterNative {
    
    public int commonTwo(String[] a, String[] b) {  
  int count = 0;
  String str = "";
  for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < a.length; j++) {

      if (a[j].equals(b[i]) && !str.contains(a[j])) {

        str += a[j];
        count++;
      }
    }

  }

  return count;

}

}
