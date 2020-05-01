import Contest.Torneo;
import Interface.BeberEspartano;
import Interface.BeberVikingo;
import Interface.OrinarEspartano;
import Interface.OrinarVikingo;
import Model.Espartano;
import Model.Team;
import Model.Vikingo;

public class main {
    public static void main(String[] args) {
        Torneo worldCup = new Torneo();

        Team<Espartano> trescientos = new Team<>();
        Espartano leonidas = new Espartano("Leonidas",25,75,4);
        Espartano plistarco = new Espartano("Plistarco",28,73,2);
        Espartano menelao = new Espartano("Menelao",35,80,5);
        leonidas.setIorinar(new OrinarEspartano());
        leonidas.setIbeber(new BeberEspartano());
        plistarco.setIorinar(new OrinarEspartano());
        plistarco.setIbeber(new BeberEspartano());
        menelao.setIorinar(new OrinarEspartano());
        menelao.setIbeber(new BeberEspartano());

        trescientos.addMember(leonidas);
        trescientos.addMember(plistarco);
        trescientos.addMember(menelao);


        Team<Vikingo> ragnarok = new Team<>();

        Vikingo thor = new Vikingo("Thor",25,80,12);
        Vikingo olaf = new Vikingo("Olaf",35,120,10);
        Vikingo rudolf = new Vikingo("Rudolf",18,100,7);
        thor.setIbeber(new BeberVikingo());
        thor.setIorinar(new OrinarVikingo());
        olaf.setIbeber(new BeberVikingo());
        olaf.setIorinar(new OrinarVikingo());
        rudolf.setIbeber(new BeberVikingo());
        rudolf.setIorinar(new OrinarVikingo());




        ragnarok.addMember(olaf);
        ragnarok.addMember(rudolf);
        ragnarok.addMember(thor);

        worldCup.setVikinLista(ragnarok);
        worldCup.setEspartanoLista(trescientos);

        worldCup.run();



    }
}
