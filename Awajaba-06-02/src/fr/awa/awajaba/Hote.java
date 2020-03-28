package fr.awa.awajaba;

public class Hote extends Membre {

    private String domaineCulinaire;
    private int nbRepasOrganiser;

    public Hote(int numero, String nom, String adresseMail, String domaineCulinaire, int nbRepasOrganiser) {
        super(numero, nom, adresseMail);
        this.domaineCulinaire = domaineCulinaire;
        this.nbRepasOrganiser = nbRepasOrganiser;
    }

    public String getDomaineCulinaire() {
        return domaineCulinaire;
    }

    public void setDomaineCulinaire(String domaineCulinaire) {
        this.domaineCulinaire = domaineCulinaire;
    }

    public int getNbRepasOrganiser() {
        return nbRepasOrganiser;
    }

    public void setNbRepasOrganiser(int nbRepasOrganiser) {
        this.nbRepasOrganiser = nbRepasOrganiser;
    }

    @Override
    public String toString() {
        return "Hote{" +
                "domaineCulinaire='" + domaineCulinaire + '\'' +
                ", nbRepasOrganiser=" + nbRepasOrganiser +
                '}';
    }

    public String toHtml(){
       String hoteToHtml = "<span id=\""+getNumero()+"\" class=\"hote\">"+
                getNom()+"(<em>"+getDomaineCulinaire()+"</em>)"+
        "</span>";
       return hoteToHtml;
    }
}
