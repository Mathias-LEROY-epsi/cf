package org.ss.orchestre.rendu;

public class App {
    public static void main(String[] args) {
        Musicien pianiste = new Musicien(new Piano(), "La 9eme de Beethoven", "pianiste");
        Musicien violoniste = new Musicien(new Violon(), "La 9eme de Beethoven", "violoniste");
        Musicien batteur = new Musicien(new Batterie(), "La 9eme de Beethoven", "batteur");

        Orchestre orchestre = new Orchestre();
        orchestre.ajout(pianiste);
        orchestre.ajout(violoniste);
        orchestre.ajout(batteur);
        orchestre.jouer();
    }
}
