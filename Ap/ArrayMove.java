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
public class ArrayMove {
    
    public String[] wordsFront(String[] words, int n) {
  
        String[]arr = new String[n];
        for(int i=0;i<n;i++){
        arr[i]=words[i];
        }
        return arr;
}

}
