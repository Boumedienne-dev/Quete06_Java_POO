package org.example;


public class Classroom {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Wilder wilder1 = new Wilder("Alice", true);
        Wilder wilder2 = new Wilder("Bob", false);
        Wilder wilder3 = new Wilder("Charlie", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
    }
}
