package service;

import java.util.HashMap;
import java.util.TreeMap;
import model.TouristPlace;
public class MapOperations{
	HashMap<String,TouristPlace> m1=new HashMap<String,TouristPlace>();
	public HashMap<String,TouristPlace> add(TouristPlace places) {
		m1.put(places.getName(), places);
		return m1;
	}
	public HashMap<String,TouristPlace> sortRandomly(HashMap<String,TouristPlace> places) {
		return m1;
	}
	public HashMap<String,TouristPlace> sortInEntryOrder(HashMap<String,TouristPlace> places) {
		return m1;
	}
	public TreeMap<String,TouristPlace> sortAlphabetically(HashMap<String,TouristPlace> places) {
		TreeMap<String,TouristPlace> m2=new TreeMap<String,TouristPlace>(places);
		return m2;
	}
	public HashMap<String,TouristPlace> reset(HashMap<String,TouristPlace> places) {
		m1.clear();
		return m1;
	}
	public HashMap<String,TouristPlace> remove(TouristPlace places) {
		m1.remove(places.getName());
		return m1;
		
	}
}