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
public class StrDist {
    public int strDist(String str, String sub) {
  int stLen = str.length();
	int sbLen = sub.length();
	if(stLen < sbLen)
		return 0;
	if(str.substring(0, sbLen).equals(sub))
	{
		if(str.substring(stLen - sbLen, stLen).equals(sub))
			return stLen;
		return strDist(str.substring(0, stLen - 1), sub);
	}
	return strDist(str.substring(1), sub);
}

}
