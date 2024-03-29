package Garage;

public class Modele
{
    public Modele(String nom, int puissance, String moteur, float prixDeBase) {
        this.nom = nom;
        this.puissance = puissance;
        this.moteur = moteur;
        this.prixDeBase = prixDeBase;
    }

    private String nom;
    private int puissance;
    private String moteur;
    private float prixDeBase;

    @Override
    public String toString() {
        String s = "" + nom + ", " + puissance + "ch, " + moteur + ", " + prixDeBase;
        return s;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public float getPrixDeBase() {
        return prixDeBase;
    }

    public void setPrixDeBase(float prixDeBase) {
        this.prixDeBase = prixDeBase;
    }
}
