package fr.awa.awajaba;

public class Evenement extends Repas {

    private String typeEvenement;


    public Evenement(int numero, int nbCouverts, int nbPlacesReserves, boolean estComplet, String typeEvenement) {
        super(numero, nbCouverts, nbPlacesReserves, estComplet); // super est le constructeur de la classe mère (la classe hérité)
        this.typeEvenement = typeEvenement; // et on rajoute ensuite l'attribut qui différencie Repas et Evenement
    }

    public String getTypeEvenement() {
        return typeEvenement;
    }

    public void setTypeEvenement(String typeEvenement) {
        this.typeEvenement = typeEvenement;
    }

    @Override
    public String toString() {
        return "Evenement{" + super.getNumero() + super.getNbCouverts() + super.getNbPlacesReserves() + super.isEstComplet() +
                "typeEvenement='" + typeEvenement + '\'' +
                '}';
    }
    @Override
    public String toHtml(){
        int nbPlacesDispo = super.getNbCouverts() - super.getNbPlacesReserves();
        String evenementOuvertALaReservation =  "<div>"+super.getNumero()+"-"+this.typeEvenement+"("+nbPlacesDispo+" place.s disponible.s)</div>";
        String evenementFermeALaReservation = "<div>"+super.getNumero()+"-"+this.typeEvenement+"(<strong>Complet</strong>)</div>";
        return evenementOuvertALaReservation + "<br>"+ evenementFermeALaReservation;
    }


}

