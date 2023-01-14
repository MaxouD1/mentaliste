package mentaliste.com;

public class Assistant {
    private int age;
    private int somme;
    private int resultatAssistant;

    void recevoirPapier(Papier papier) {
        System.out.println("[Assisstant] Bien je lis le papier");
        age = papier.getAge();
        somme = papier.getSomme();
        resultatAssistant = (((age * 2) + 5) * 50 + somme) - 365;
        System.out.println("[Assisstant] J'annonce : " + resultatAssistant);
    }

    public int getResultat() {
        return resultatAssistant;
    }

}
