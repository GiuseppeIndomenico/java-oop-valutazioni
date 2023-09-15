package org.lessons.java.valutazioni;

public class Studente {

	public int id;
	public int assenze;
	public float voto;
	boolean promosso = false;
	

	Studente(int id, int assenze, float voto ){
		this.id=id;
		this.assenze=assenze;
		this.voto=voto;
			
	}
	
	public void Print() {
		Valutazione();
		
		System.out.println("id: " + id);
		System.out.println("assenze: " + assenze + "%");
		System.out.println("media voti: " + voto);
		
		System.out.println(promosso? "promosso" : "bocciato");
		
		
		
	}
	
	 public void Valutazione() {
	        if (assenze > 50) {
	            promosso = false;
	        } else if (assenze >= 25 && assenze <= 50) {
	            if (voto >= 2.0) {
	                promosso = true;
	            } else {
	                promosso = false;
	            }
	        } else if (assenze < 25) {
	            if (voto >= 2.0) {
	                promosso = true;
	            } else {
	                promosso = false;
	            }
	        }
	    }
	
	
}
