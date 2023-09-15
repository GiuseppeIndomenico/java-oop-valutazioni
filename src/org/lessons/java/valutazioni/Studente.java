package org.lessons.java.valutazioni;

import java.text.DecimalFormat;

public class Studente {

	public int id;
	public int assenze;
	public String voto;


	Studente(int id, int assenze, String voto ){
		this.id=id;
		this.assenze=assenze;
		this.voto=voto;
			
	}
	
	public void Print() {
		
		System.out.println("id: " + id);
		System.out.println("assenze: " + assenze + "%");
		System.out.println("media voti: " + voto);
		
	}
	
	
	
}
