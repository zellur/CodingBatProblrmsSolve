/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic2;

/**
 *
 * @author rakib
 */
public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
  int temp;
	if(b > a)
	{
		temp = a;
		a = b;
		b = temp;
	}
	if(c > b)
	{
		temp = b;
		b =c;
		c = temp;
	}
	if(b > a)
	{
		temp = a;
		a = b;
		b = temp;
	}
	return(a - b == b - c);
}

}
