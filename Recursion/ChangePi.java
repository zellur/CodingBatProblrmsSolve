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
public class ChangePi {
    public String changePi(String str) {
	if(str.length() < 2)
		return str;
	if(str.substring(0, 2).equals("pi"))
		return "3.14" + changePi(str.substring(2));
	return str.charAt(0) + changePi(str.substring(1));
}

}
