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
public class UserCompare {
    
    public int userCompare(String aName, int aId, String bName, int bId) {
  if (aName.equals(bName) && aId == bId)
    return 0;
  
  int result = aName.compareTo(bName);
  if (result < 0)
    return -1;
  else if (result > 0)
    return 1;
  else if (aId > bId)
    return 1;
  else
    return -1;
}

}
