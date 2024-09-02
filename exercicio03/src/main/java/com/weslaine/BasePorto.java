package com.weslaine;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
    String nome;
    List<Barco> barcosAtracados = new ArrayList<>();

    public void atracarBarco(Barco barco) {
    barcosAtracados.add(barco);
    }

    public void desatracarBarco(Barco barco){
    barcosAtracados.remove(barco);
    }
    
}
