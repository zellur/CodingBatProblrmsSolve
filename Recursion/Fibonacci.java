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
public class Fibonacci {
    
    public int getFibo(int n){
    if(n==0)return 0;
    if(n==1)return 1;
    return getFibo(n-1)+getFibo(n-2);
    }
}
