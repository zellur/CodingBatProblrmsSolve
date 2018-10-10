/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic1;

/**
 *
 * @author rakib
 */
public class LastDigit {
    
    public boolean lastDigit(int a, int b, int c) {
  
  int modA = a%10;
  int modB = b%10;
  int modC = c%10;
  
  if(modA == modB || modB == modC || modC==modA)return true;
  return false;
}

}
