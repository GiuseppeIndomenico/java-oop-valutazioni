package org.lessons.java.valutazioni;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        DecimalFormat fmat = new DecimalFormat("0.0");


        float votoDecimale = rnd.nextFloat(5);


        String voto = fmat.format(votoDecimale);

        int assenze = rnd.nextInt(100);

        Studente mario = new Studente(1, assenze, voto);

        mario.Print();
    }
}
