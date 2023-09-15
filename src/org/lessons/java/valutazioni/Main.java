package org.lessons.java.valutazioni;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        
        Studente[] stu = new Studente[10]; 
        
       int promossoCount=0;
       
        for (int i = 0; i < stu.length; i++) {
        	int id = i + 1;
        	float voto = Math.round(rnd.nextFloat(5)  * 10.0f) / 10.0f;

            int assenze = rnd.nextInt(100);
            stu[i] = new Studente(id, assenze, voto);
        }

 
        for (int i = 0; i < stu.length; i++) {
            Studente studente = stu[i];
            studente.Print();
           
            if(studente.promosso) {
            	promossoCount++;
            }
            System.out.println("\n-----------------\n");
        }
        
        System.out.println("Ci sono " + promossoCount + " studenti promossi");

    }
}
