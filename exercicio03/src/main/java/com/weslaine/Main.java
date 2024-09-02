package com.weslaine;

public class Main {
    public static void main(String[] args) {
        Barco[] barcos = new Barco[6];
        PortoGrande portoGrande = new PortoGrande();
        PortoPequeno portoPequeno = new PortoPequeno();

        for (int i = 1; i <= 5; i++) {
            barcos[i] = new Barco("Barco " +i, i+7);
            System.out.println(barcos[i].nome + ": Tamanho " + barcos[i].tamanho);
        }

        for (int i = 1; i < barcos.length; i++) {
            Barco barco = barcos[i];
            portoPequeno.atracarBarco(barco);
            portoGrande.atracarBarco(barco);
        }

    }
}