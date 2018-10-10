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
public class Hi2 {
    public int countHi2(String str) {
 
	if(str.length() < 2)
		return 0;
	if(str.length() == 2)
		return (str.equals("hi")) ? 1 : 0;
	if(str.charAt(0) == 'x')
	{
		if(str.substring(1, 3).equals("hi"))
			return countHi2(str.substring(3));
		return countHi2(str.substring(1));
	}
	if(str.substring(0, 2).equals("hi"))
		return 1 + countHi2(str.substring(2));
	if(str.substring(1, 3).equals("hi"))
		return 1 + countHi2(str.substring(3));
	return countHi2(str.substring(2));
}

}
