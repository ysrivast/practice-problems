package soltion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirtelSolution {

	public boolean palindrome(String str)
	{    Map<Character, Integer> map = new HashMap<>();
	    for(int i=0; i<str.length(); i++){
	        if(map.containsKey(str.charAt(i))){
	            map.put(str.charAt(i), map.get(str.charAt(i))+1);
	        
	        }
	        else{
	            map.put(str.charAt(i), 0);
	        }
	        
	        
	    }
	    List<Integer> list =(List<Integer>) map.values();
	    int count =0;
	    for(int i=0; i<list<size();i++){
	        if(list.get(i)%2==1){
	            count++;
	        }
	        if(list.get(i)%2!=0 && count>1){
	            return false
	        }
	    }
	    
	    return true;
	}
}
