package org.ss.orchestre.rendu;

import java.util.ArrayList;
import java.util.List;

public class Orchestre {
    private final List<Musicien> musiciens;

    public Orchestre() {
        musiciens = new ArrayList<>();
    }

    public void ajout(Musicien musicien) {
        musiciens.add(musicien);
    }

    public void jouer() {
        for (Musicien musicien : musiciens) {
            System.out.println("Je suis un " + musicien.getTypeMusicien() + "...");
            musicien.jouerMorceau();
        }
    }
}
