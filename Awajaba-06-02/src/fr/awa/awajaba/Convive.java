package fr.awa.awajaba;

public class Convive extends Membre {

    private String preference;
    private int civilite;

    public Convive(int numero, String nom, String adresseMail, String preference, int civilite) {
        super(numero, nom, adresseMail);
        this.preference = preference;
        this.civilite = civilite;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public int getCivilite() {
        return civilite;
    }

    public void setCivilite(int civilite) {
        this.civilite = civilite;
    }

    @Override
    public String toString() {
        return "Convive{" +
                "preference='" + preference + '\'' +
                ", civilite=" + civilite +
                '}';
    }

    public String toHtml(){
        String conviveToHtml = "<span id=\""+getNumero()+"\" class=\"hote\">"+
                getNom()+"(<em>"+getPreference()+"</em>)"+
                "</span>";
        return conviveToHtml;
    }

    public String toHtml(int mode) {
        switch (mode) {
            case 1:
                String conviveToHtml1 = "<div id=\"" + getNumero() + "\" class=\"hote\">" +
                        getNom() + "(<em>" + getPreference() + "</em>)" +
                        "<br/>" +
                        "Civilité :" + getCivilite() +
                        "</div>";
                return conviveToHtml1;
            case 2:
                String conviveToHtml2 = "<div id=\"" + getNumero() + "\" class=\"hote\">" +
                        getNom() + "(<em>" + getPreference() + "</em>)" +
                        "<br/>" +
                        "Préférence :" + getPreference() +
                        "</div>";
                return conviveToHtml2;
            case 3:
                String conviveToHtml3 = "<div id=\"" + getNumero() + "\" class=\"hote\">" +
                        getNom() + "(<em>" + getPreference() + "</em>)" +
                        "<br/>" +
                        "Civilité :" + getCivilite() +
                        "<br/>" +
                        "Préférence :" + getPreference() +
                        "</div>";

                return conviveToHtml3;
        }
        return null;
    }
}
