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
public class LessThan10 {
    public boolean lessBy10(int a, int b, int c) {
  if(Math.abs(a-b) >= 10)return true;
  if(Math.abs(b-c) >= 10)return true;
  if(Math.abs(c-a) >= 10)return true;
  return false;
}

}
