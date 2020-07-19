package com.company;

public class Tren {
    private Vagon[] vagoane = new Vagon[15];

    public Tren(Vagon[] vagoane) {
        int i = 0;
        for (Vagon vagon : vagoane) {
            this.vagoane[i++] = vagon;
        }
    }

    public boolean Equals(Tren tren) {

        int tren1TotalColetePostale = 0;
        for (int i = 0; i < 15; i++)
            tren1TotalColetePostale=tren.vagoane[i].getCapacitateColetePostale()+tren1TotalColetePostale;

        for (int j = 0; j < 15; j++);

    }
}

