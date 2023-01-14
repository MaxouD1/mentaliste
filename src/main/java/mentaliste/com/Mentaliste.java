package mentaliste.com;

public class Mentaliste {
    private int resultat;

    void recevoirResultat(Assistant assistant) {
        resultat = assistant.getResultat();
        resultat = resultat + 115;
        char[] chiffres = Integer.toString(resultat).toCharArray();
        String ageS = new String(new char[] { chiffres[0], chiffres[1] });
        int age = Integer.parseInt(ageS);
        String sommeS = new String(new char[] { chiffres[2], chiffres[3] });
        int somme = Integer.parseInt(sommeS);
        System.out.println("[Magicien] Mmm... Vous avez " + age + " ans et vous avez " + somme + " euros en poche !");
    }
}
