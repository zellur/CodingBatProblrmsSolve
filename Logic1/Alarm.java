/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic1;

/**
 *
 * @author rakib
 */
public class Alarm {
    
    public String alarmClock(int day, boolean vacation) {
  if (day >=1 && day <=5) {
                return vacation ? "10:00" : "7:00";
            } else {
                return vacation ? "off" : "10:00";
            } 
}

}
