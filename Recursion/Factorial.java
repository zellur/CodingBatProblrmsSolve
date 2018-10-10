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
public class Factorial {
    
    public int getFact(int n){
    if(n==0)return 0;
    return n*getFact(n-1);
    }
}
