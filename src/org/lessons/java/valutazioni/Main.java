package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

      
        float voto = Math.round(rnd.nextFloat() * 50) / 10.0f;

        int assenze = rnd.nextInt(100);

        Studente mario = new Studente(1, assenze, voto);

        mario.Print();
    }
}
