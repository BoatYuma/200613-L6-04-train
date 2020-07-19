package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class CalatoriA extends Vagon {

    private static final int CAPACITATE_PASAGERI = 40;
    private static final int CAPACITATE_COLETE_POSTALE = 300;

    public void deschidereUsilor() {
        System.out.println("S-au deschis usile");
    }

    public void inchidereaUsilor() {
        System.out.println("S-au inchis usile");
    }

    public static int getCapacitatePasageri() {
        return CAPACITATE_PASAGERI;
    }

    public static int getCapacitateColetePostale() {
        return CAPACITATE_COLETE_POSTALE;
    }
}
