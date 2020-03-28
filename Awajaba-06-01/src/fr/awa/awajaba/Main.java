package fr.awa.awajaba;

public class Main {
    public static void main(String[] args){

        Repas repas1 = new Repas(1,5,2,false);
        System.out.println(repas1.toString());
        System.out.println(repas1.toHtml());

        Evenement repas2 = new Evenement(2, 4, 0, true, "Nouvel An 2021");
        System.out.println(repas2.toString());
        System.out.println(repas2.toHtml());
    }

}
