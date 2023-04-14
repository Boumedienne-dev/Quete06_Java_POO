package org.example;

/**
 * Classe représentant une classe de la Wild Code School.
 */
public class Classroom {

    /**
     * Méthode principale qui crée plusieurs instances de la classe Wilder et affiche leur description.
     *
     * @param args les arguments de la ligne de commande (non utilisés dans cette méthode)
     */

    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Alice", true);
        Wilder wilder2 = new Wilder("Bob", false);
        Wilder wilder3 = new Wilder("Charlie", true);

        // Affiche la description de chaque instance en appelant la méthode whoAmI()
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}
