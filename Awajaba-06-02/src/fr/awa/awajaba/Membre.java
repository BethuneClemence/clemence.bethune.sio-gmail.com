package fr.awa.awajaba;

public class Membre {

    private int numero;
    private String nom;
    private String adresseMail;

    public Membre(int numero, String nom, String adresseMail) {
        this.numero = numero;
        this.nom = nom;
        this.adresseMail = adresseMail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                '}';
    }

}
