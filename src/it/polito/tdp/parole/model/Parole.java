package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class Parole {
		
	List <String> listaParole = new LinkedList<String>();
	
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		//TODO
		listaParole.add(p);
		
	}
	
	public List<String> getElenco() {
		//TODO
		List<String> stemp = new LinkedList <String>(listaParole);
		Collections.sort(stemp, new Comparator<String>(){
			public int compare (String a, String b){
				return a.compareToIgnoreCase(b);
				
			};
			
		});
		
		
		
		return stemp;
	}
	
	public void reset() {
		// TODO
		listaParole.clear();
	}
	
	
	public void cancella(String s){
		listaParole.remove(s);
		
		
		
	}

}
