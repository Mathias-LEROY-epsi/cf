package org.ss.orchestre.rendu;

public class Piano implements Instrument {
    @Override
    public void afficher() {
        System.out.println("Je suis un piano...");
    }

    @Override
    public void jouer() {
        System.out.println("LA LA LA");
    }

}
