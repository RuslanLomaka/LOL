package dexter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class PriorityTest {

public static void main(String[] args) {
	List <City> cityHolder = new ArrayList<City>();
	
	City gdansk = new City();
	City bydgoszcz = new City();
	City torun = new City();
	City warszawa = new City();
	
	Comparator<City> myComp = new Comparator<City>() {
		@Override
		public int compare(City o1, City o2) {
			return o1.getCost() - o2.getCost();
			};
	
	};
	
	
TreeSet < City >  prq = new TreeSet < City > (); 
	
	/*for (int i = 0; i< 30; i++){
		//prq.add(new City((int)(Math.random()*30)));
			//prq.offer(new City((int)(Math.random()*30)));
			cityHolder.add(new City((int)(Math.random()*30)));
	}*/
	
	//List<City> prq = new ArrayList<City>();
	
	prq.add(new City(1255));
	prq.add(new City(34));
	prq.add(new City(442));
	prq.add(new City(556));
	prq.add(new City(145));
	prq.add(new City(578));
	prq.add(new City(144));
	prq.add(new City(178));
	prq.add(new City(158));
	prq.add(new City(144));
	prq.add(new City(689));
	prq.add(new City(578));
	prq.add(new City(987));
	
	//prq.addAll(cityHolder);
	//prq.sort(new Comparator<City>() {

	//	@Override
	//	public int compare(City o1, City o2) {
			
	//		return o1.getCost() - o2.getCost();
			
	//	}
	//});
	/*System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());
	System.out.println("Cost  ----  "+prq.poll().getCost());*/
	
	Iterator<City> iter = prq.descendingIterator();
	while(iter.hasNext()){
		System.out.println("Cost  ----  "+iter.next().getCost());
	}

	
	
	
}
}
