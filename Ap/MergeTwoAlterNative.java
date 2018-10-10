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
public class MergeTwoAlterNative {
    
    public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] arr = new String[n];
    int aIndex = 0;
    int bIndex = 0;
        
    for(int index = 0; index < n; index++) {
        if(a[aIndex].compareTo(b[bIndex]) < 0) {
            arr[index] = a[aIndex];
            aIndex++;
        } else if(a[aIndex].compareTo(b[bIndex]) > 0) {
            arr[index] = b[bIndex];
            bIndex++;
        } else {
            arr[index] = a[aIndex];
            aIndex++;
            bIndex++;
        }
    }
                                                                        
    return arr;
}
}
