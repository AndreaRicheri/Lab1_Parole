package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class Parole_Arr {
		
	List <String> listaParole2 = new ArrayList<String>();
	
	public Parole_Arr() {
		//TODO
	}
	
	public void addParola(String p) {
		//TODO
		listaParole2.add(p);
		
	}
	
	public List<String> getElenco() {
		//TODO
		List<String> stemp = new LinkedList <String>(listaParole2);
		Collections.sort(stemp, new Comparator<String>(){
			public int compare (String a, String b){
				return a.compareToIgnoreCase(b);
				
			};
			
		});
		
		
		
		return stemp;
	}
	
	public void reset() {
		// TODO
		listaParole2.clear();
	}
	
	
	public void cancella(String s){
		listaParole2.remove(s);
		
		
		
	}

}
