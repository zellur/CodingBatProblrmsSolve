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
public class Find11 {
    public int array11(int[] nums, int index) {
  if(index == nums.length) return 0;

  int res = 0;
  if(nums[index] == 11) res+=1;
 
  return res+array11(nums,index+1) ;
  
}

}
