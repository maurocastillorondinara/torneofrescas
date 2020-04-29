package Contest;

import Model.Espartano;
import Model.Humano;
import Model.Team;
import Model.Vikingo;

import java.util.ArrayList;
import java.util.List;

public class Arena extends Thread{
    Team<Vikingo> vikinLista ;
    Team<Espartano> espartanoLista;

    public Arena(Team<Vikingo> viking, Team<Espartano> espartano){
        this.vikinLista = viking;
        this.espartanoLista = espartano;
    }

    @Override
    public void run() {

    }
}
