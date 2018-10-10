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
public class CopyEvents {
    public int[] copyEvens(int[] nums, int count) {
  int[] res = new int[count];
  int index = 0;
  for(int i =0;i<nums.length;i++){
   if(nums[i]%2 == 0 && index<count){
     res[index]=nums[i];
     index++;
   }
  }
  return res;
}

}
