package com.weslaine;

public class PortoGrande extends BasePorto {
    @Override
    public void atracarBarco(Barco barco) { 
        if(barco.tamanho >= 10) {
            barcosAtracados.add(barco);
            System.out.println(barco.nome + " atracado no porto grande");
        }
    }
}
