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
public class CleanChar {
    public String stringClean(String str) {
  if(str.length() < 2)
		return str;
	if(str.charAt(0) == str.charAt(1))
		return stringClean(str.substring(1));
	return str.charAt(0) + stringClean(str.substring(1));
}

}
