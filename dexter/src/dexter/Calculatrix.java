package dexter;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Calculatrix {
	
	public static void main(String[] args) {
		
		List <City> cityHolder = new ArrayList<City>();
		
		City gdansk = new City();
		City bydgoszcz = new City();
		City torun = new City();
		City warszawa = new City();
		
		gdansk.setIndex(1);
		bydgoszcz.setIndex(2);
		torun.setIndex(3);
		warszawa.setIndex(4);
		
		gdansk.getNeighbors().put(2, 1);
		gdansk.getNeighbors().put(3, 3);
		gdansk.setName("gdansk");
		
		bydgoszcz.getNeighbors().put(1, 1);
		bydgoszcz.getNeighbors().put(3, 1);
		bydgoszcz.getNeighbors().put(4, 4);
		bydgoszcz.setName("bydgoszcz");
		
		torun.getNeighbors().put(1, 3);
		torun.getNeighbors().put(2, 1);
		torun.getNeighbors().put(4, 4);
		torun.setName("torun");
		
		warszawa.getNeighbors().put(2, 4);
		warszawa.getNeighbors().put(3, 1);
		warszawa.setName("warszawa");
		
		cityHolder.add(warszawa);
		cityHolder.add(bydgoszcz);
		cityHolder.add(gdansk);
		cityHolder.add(torun);
		
		
		PriorityQueue < City >  prq = new PriorityQueue < City > (new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				if (o1.getCost() > o2.getCost()) {return 1;}
				else if (o1.getCost() == o2.getCost()) {return 0;}
				else {return 0;}
				
			}
		});
		
		
		
				
		gdansk.setCost(0);
				
{
	for (int i = 0; i<cityHolder.size(); i++){
	
	for (Entry<Integer, Integer> entry : cityHolder.get(i).getNeighbors().entrySet())
	    System.out.println(cityHolder.get(i).getName()+"  " + entry.getKey() + "/" + entry.getValue());
	}
	System.out.println(" ----- ");
	
}

		for (int i = 0; i < cityHolder.size(); i++){
		}

	}

}

