package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import model.TouristPlace;

public class SetOperations{
	HashSet<TouristPlace> h1=new HashSet<TouristPlace>();
	public HashSet<TouristPlace> add(TouristPlace places) {
		h1.add(places);
		return h1;
	}
	public HashSet<TouristPlace> remove(TouristPlace places){
		h1.remove(places);
		return h1;
	}
	public HashSet<TouristPlace> sortByDestination(HashSet<TouristPlace> places){
		ArrayList<TouristPlace> p=new ArrayList<TouristPlace>(places);
		Collections.sort(p,(p1,p2)-> p1.getDestination().compareTo(p2.getDestination()));
		return new HashSet<TouristPlace>(p);
	}
	public HashSet<TouristPlace> sortByRank(HashSet<TouristPlace> places){
		ArrayList<TouristPlace> p=new ArrayList<TouristPlace>(places);
		Collections.sort(p,(p1,p2)-> p1.getRank().compareTo(p2.getRank()));
		return new HashSet<TouristPlace>(p);
	}
	public HashSet<TouristPlace> reset(HashSet<TouristPlace> places){
		h1.clear();
		return h1;
	}
}