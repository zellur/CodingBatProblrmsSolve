/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic2;

/**
 *
 * @author rakib
 */
public class RoundSum {
    
    public int roundSum(int a, int b, int c) {
  return round10(a)+round10(b)+round10(c);
}

public int round10(int num){
  int rem = num%10;
  if(rem >= 5)return num+(10-rem);
  return num-rem;
}

}
