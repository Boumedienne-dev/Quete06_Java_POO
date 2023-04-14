package org.example;
/**
 * Classe représentant un étudiant de la Wild Code School.
 */
public class Wilder {
    private String firstname;
    private boolean aware;

    /**
     * Constructeur de la classe Wilder.
     *
     * @param firstname le prénom de l'étudiant
     * @param aware     true si l'étudiant est au courant des dernières technologies, false sinon
     */
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    /**
     * Retourne le prénom de l'étudiant.
     *
     * @return le prénom de l'étudiant
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Modifie le prénom de l'étudiant.
     *
     * @param firstname le nouveau prénom de l'étudiant
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Indique si l'étudiant est au courant des dernières technologies.
     *
     * @return true si l'étudiant est au courant des dernières technologies, false sinon
     */
    public boolean isAware() {
        return aware;
    }

    /**
     * Modifie l'état de connaissance de l'étudiant.
     *
     * @param aware true si l'étudiant est au courant des dernières technologies, false sinon
     */
    public void setAware(boolean aware) {
        this.aware = aware;
    }

    /**
     * Retourne une chaîne de caractères décrivant l'étudiant.
     *
     * @return une chaîne de caractères décrivant l'étudiant
     */
    public String whoAmI() {
        String awareness = aware ? "je suis aware" : "je ne suis pas aware";
        return "Je m'appelle " + firstname + " et " + awareness;
    }
}
