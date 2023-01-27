package mentaliste.com;

import java.util.Scanner;

public class Spectateur {
    private int age;
    private int somme;

    public void receuillirInfos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Spectateur] J'entre mon âge : ");
        this.age = scanner.nextInt();
        while (true) {
            if (age > 99 && age <= 0) {
                System.out.println("[Spectateur] J'entre mon âge(max:99) : ");
                this.age = scanner.nextInt();
            } else {
                break;
            }
        }
        System.out.println("[Spectateur] J'entre ma somme : ");
        this.somme = scanner.nextInt();
        while (true) {
            if (somme > 99 && somme <= 0) {
                System.out.println("[Spectateur] J'entre ma somme (max:99) : ");
                this.somme = scanner.nextInt();
            } else {
                break;
            }
        }
        scanner.close();
    }

    void ecrirePapier(Papier papier) {
        System.out.println("[Assisstant] Bonjour Spectateur ! ");
        System.out.println("[Assisstant] Veuillez écrire sur ce bout de papier votre âge et la somme en poche ");
        System.out.println("[Spectateur] Bien j'écris mon âge et ma somme sur le papier");
        papier.setAge(this.age);
        papier.setSomme(this.somme);
    }
}