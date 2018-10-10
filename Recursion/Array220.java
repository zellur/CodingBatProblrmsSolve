/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author rakib
 */
public class Array220 {
    
    public boolean array220(int[] nums, int index) {
  if(nums.length<2 || index == nums.length-1 )return false;
  
  if(nums[index]*10 == nums[index+1]) return true;
  
  return array220(nums,index+1);
}

}
