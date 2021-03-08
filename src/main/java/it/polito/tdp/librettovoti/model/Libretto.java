package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList<>();
	}

	public void add(Voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		
		String s="";
		for(Voto v: voti) {
			s+= v.toString() +"\n";
			
		}
		return s;
		
	}
	/*
	public void stampaVotiUguali(int punteggio) {
		//Il libretto stampa da solo i voti
	}
	
	public String votiUguali(int punteggio) {
		//calcola una string che contine i voti
		//sarà poi il chiamante a stamparli
		return null;
	}
*/
	public List<Voto> listaVotiUguali(int punteggio){
		//però cosi espongo all'esterno la struttura dati usata internamente
		List<Voto> risultato=new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		//lo stesso oggetto in due liste diverse
		//se non scrivo new, non ho nuovi oggetti
		return risultato;
		
	}
	
	//preferisco dare un libretto allora
	public Libretto votiUguali(int punteggio) {
		Libretto risultato= new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	
}
