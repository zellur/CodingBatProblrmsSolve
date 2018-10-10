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
public class ReachGoal {
    
    public int makeChocolate(int small, int big, int goal) {
  
  int maxBig = goal/5;
	if(maxBig <= big)
		goal -= maxBig*5;
	else
		goal -= big*5;
	if(goal <= small)
		return goal;
	return -1;
}

    
}
