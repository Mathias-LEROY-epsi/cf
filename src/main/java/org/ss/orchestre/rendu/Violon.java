package org.ss.orchestre.rendu;

public class Violon implements Instrument {
    @Override
    public void jouer() {
        System.out.println("ZIN ZIN ZIN");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un violon...");
    }
}
