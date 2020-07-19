package com.company;

public class CalatoriB extends Vagon{

    private static final int CAPACITATE_PASAGERI = 50;
    private static final int CAPACITATE_COLETE_POSTALE = 400;


    public void deschideUsi() {
        System.out.println("S-au deschis usile");
    }

    public void inchideUsi() {
        System.out.println("S-au inchis usile");
    }

    public void blocheazaGeamuri() {
        System.out.println("Geamurile s-au blocat");
    }

    public static int getCapacitatePasageri() {
        return CAPACITATE_PASAGERI;
    }

    public static int getCapacitateColetePostale() {
        return CAPACITATE_COLETE_POSTALE;
    }
}
