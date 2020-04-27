package Contest;

import Model.Espartano;
import Model.Team;
import Model.Vikingo;


import java.util.ArrayList;
import java.util.List;


public class Torneo extends Thread {
    static final int MaxBebida = 100;
     Team<Vikingo> vikinLista ;
     Team<Espartano> espartanoLista;

    public Torneo(){
        vikinLista = new Team<>();
        espartanoLista = new Team<>();
    }

    public Team<Vikingo> getVikinLista() {
        return vikinLista;
    }

    public void setVikinLista(Team<Vikingo> vikinLista) {
        this.vikinLista = vikinLista;
    }

    public Team<Espartano> getEspartanoLista() {
        return espartanoLista;
    }

    public void setEspartanoLista(Team<Espartano> espartanoLista) {
        this.espartanoLista = espartanoLista;
    }

    public void run(){

    }



}
