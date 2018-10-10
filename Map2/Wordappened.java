/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map2;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author rakib
 */
public class Wordappened {
   
Map<String,Integer>map = new HashMap<>();

String result = "";

public String reultString(String[]str){

    for(String s : str){
    
        int i =0;
        
        if(map.containsKey(s)){
        
            i = map.get(s)+1;
            map.put(s, i);
            
            if(i%2 == 0){
            result = result+s;
            }
        }else{
        
        map.put(s, i);
        }
        
    }

return result;
}
    
    
}
