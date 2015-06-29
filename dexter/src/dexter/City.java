package dexter;

import java.util.HashMap;

public class City implements Comparable<City>{

	String name;
	int index;
	boolean alreadyChecked;
	int cost = 20000;
	HashMap<Integer, Integer> neighbors = new HashMap<Integer, Integer>();

	City(){};
	City (int cost){
		this.cost = cost;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isAlreadyChecked() {
		return alreadyChecked;
	}

	public void setAlreadyChecked(boolean alreadyChecked) {
		this.alreadyChecked = alreadyChecked;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public HashMap<Integer, Integer> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(HashMap<Integer, Integer> neighbors) {
		this.neighbors = neighbors;
	}
	
	public void addNeighbour(int index, int cost){
		
		if (!this.neighbors.containsKey(index)){
			this.neighbors.put(index, cost);
		}
		else  {System.out.println("City already presented");}
	}
	
	public void modifyNeighbour(int index, int cost){
		this.neighbors.put(index, cost);
		
	}
	@Override
	public int compareTo(City o) {
		
		return o.getCost() - this.getCost()  ;
	}

}


