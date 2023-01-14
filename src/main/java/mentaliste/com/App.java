package mentaliste.com;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Spectateur spec1 = new Spectateur();
        Papier papier1 = new Papier();
        Mentaliste magicien = new Mentaliste();
        Assistant assistant1 = new Assistant();
        spec1.receuillirInfos();
        spec1.ecrirePapier(papier1);
        assistant1.recevoirPapier(papier1);
        magicien.recevoirResultat(assistant1);

    }
}
