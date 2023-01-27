package mentaliste.com;

public class Papier {
    private int age;
    private int somme;

    public int getAge() {
        return age;
    }

    public int getSomme() {
        return somme;
    }

    public void setAge(int age2) {
        age = age + age2;
    }

    public void setSomme(int somme2) {
        somme = somme + somme2;
    }

    public String toString() {
        String res = "âges : " + age + "sommes d'argent " + somme;
        return res;
    }
}
