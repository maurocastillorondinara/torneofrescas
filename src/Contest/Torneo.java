package Contest;

import Model.Espartano;
import Model.Humano;
import Model.Team;
import Model.Vikingo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class Torneo extends Thread {
    static final int MaxBebida = 100;
     Team<Vikingo> vikinLista ;
     Team<Espartano> espartanoLista;
     Combat combate;

    public Torneo(){
        vikinLista = new Team<>();
        espartanoLista = new Team<>();
        combate = new Combat();
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

    public boolean isVikingo(Humano persona)
    {
        boolean flag = false;
        if( persona instanceof Vikingo){
            flag = true;
        }
        return flag;
    }
    public boolean isEspartano(Humano persona)
    {
        boolean flag = false;
        if( persona instanceof Espartano){
            flag = true;
        }
        return flag;
    }

    @Override
    public void run()
    {
        System.out.println("Iniciando La World Cup !!!!");
        while(vikinLista.sizeMember() >0 && espartanoLista.sizeMember() >0)
        {
            combate.start(this.vikinLista.removeMember(0),this.espartanoLista.removeMember(0));
        }
    }
}
