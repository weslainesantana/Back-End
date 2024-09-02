package com.weslaine;

public class PortoPequeno extends BasePorto {
    @Override
    public void atracarBarco(Barco barco) { 
        if(barco.tamanho <= 10) {
            barcosAtracados.add(barco);
            System.out.println(barco.nome + " atracado no porto pequeno");
        }
    }


}
