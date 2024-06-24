package org.ss.orchestre.rendu;

public class Musicien {
    private final Instrument instrument;
    private final String morceau;
    private final String typeMusicien;

    public Musicien(Instrument instrument, String morceau, String typeMusicien) {
        this.instrument = instrument;
        this.morceau = morceau;
        this.typeMusicien = typeMusicien;
    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println("et je joue le morceau " + morceau);
        instrument.jouer();
    }

    public String getTypeMusicien() {
        return typeMusicien;
    }
}
