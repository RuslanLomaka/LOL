package dexter;

import java.util.*;
import java.util.Map.Entry;

public class Calc {
	
	  public int findCost( City myCity, TreeSet cityHolder){
		  myCity.setCost(0);
		  myCity.setAlreadyChecked(true);
		  
		  cityHolder.pollFirst()
		  for (int i = 0; i<cityHolder.size(); i++){
				
				for (Entry<Integer, Integer> entry : cityHolder.get(i).getNeighbors().entrySet())
				    System.out.println(cityHolder.get(i).getName()+"  " + entry.getKey() + "/" + entry.getValue());
				}
				System.out.println(" ----- ");
				
			}
	  
	 
	  

}
