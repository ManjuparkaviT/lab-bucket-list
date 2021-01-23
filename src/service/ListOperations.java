package service;
import model.TouristPlace;
import java.util.*;
public class ListOperations{
	List<TouristPlace> l1=new ArrayList<TouristPlace>();
	public List<TouristPlace> add(TouristPlace places) {
		l1.add(places);
		return l1;
	}
	public List<TouristPlace> remove() {
	    l1.remove(l1.size()-1);
	    return l1;
	}
	public List<TouristPlace> sortByDestination(List<TouristPlace> places) {
		Collections.sort(places,(place1,place2)->(place1.getDestination().compareTo(place2.getDestination())));
		return places;
	}
	public List<TouristPlace> sortByRank(List<TouristPlace> places) {
		Collections.sort(places,(place1,place2)->place1.getRank().compareTo(place2.getRank()));
		return places;
	}
	public List<TouristPlace> reset(List<TouristPlace> places) {
		places.clear();
		return places;
	}
}