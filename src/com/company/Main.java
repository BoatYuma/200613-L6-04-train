package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vagon[] vagoane = new Vagon[15];
        vagoane[0]=new CalatoriA();
        vagoane[1]=new Marfa();
        Tren tren1=new Tren(vagoane);

        vagoane = new Vagon[15];
        vagoane[0]=new CalatoriB();
        vagoane[1]=new CalatoriB();
        vagoane[2]=new Marfa();
        Tren tren2=new Tren(vagoane);
    }
}
