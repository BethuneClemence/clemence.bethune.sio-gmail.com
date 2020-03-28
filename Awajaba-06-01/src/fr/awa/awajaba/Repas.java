package fr.awa.awajaba;

public class Repas {
    private int numero;
    private int nbCouverts = 4;
    private int nbPlacesReserves = 0;
    private boolean estComplet;

    public Repas(int numero, int nbCouverts, int nbPlacesReserves, boolean estComplet) {
        this.numero = numero;
        this.nbCouverts = nbCouverts;
        this.nbPlacesReserves = nbPlacesReserves;
        this.estComplet = estComplet;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbCouverts() {
        return nbCouverts;
    }

    public void setNbCouverts(int nbCouverts) {
        this.nbCouverts = nbCouverts;
    }

    public int getNbPlacesReserves() {
        return nbPlacesReserves;
    }

    public void setNbPlacesReserves(int nbPlacesReserves) {
        this.nbPlacesReserves = nbPlacesReserves;
    }

    public boolean isEstComplet() {
        return estComplet;
    }

    public void setEstComplet(boolean estComplet) {
        this.estComplet = estComplet;
    }

    @Override
    public String toString() {
        return "Repas{" +
                "numero=" + numero +
                ", nbCouverts=" + nbCouverts +
                ", nbPlacesReserves=" + nbPlacesReserves +
                ", estComplet=" + estComplet +
                '}';
    }

    public String toHtml(){
        int nbPlacesDispo = this.nbCouverts - this.nbPlacesReserves;
        String repasOuvertALaReservation =  "<div>"+this.numero+"("+nbPlacesDispo+" place.s disponible.s)</div>";
        String repasFermeALaReservation = "<div>"+this.numero+"(<strong>Complet</strong>)</div>";
        return repasOuvertALaReservation + "<br>"+ repasFermeALaReservation;
    }
}
