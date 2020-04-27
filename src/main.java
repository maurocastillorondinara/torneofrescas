import Contest.Torneo;
import Interface.BeberVikingo;
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

        trescientos.addMember(leonidas);
        trescientos.addMember(plistarco);
        trescientos.addMember(menelao);


        Team<Vikingo> ragnarok = new Team<>();

        Vikingo thor = new Vikingo("Thor",25,80,4);
        Vikingo olaf = new Vikingo("Olaf",35,120,6);
        Vikingo rudolf = new Vikingo("Rudolf",18,100,3);
        olaf.setIbeber(new BeberVikingo());
        System.out.println(olaf.getBeber());



        ragnarok.addMember(olaf);
        ragnarok.addMember(rudolf);
        ragnarok.addMember(thor);

        worldCup.setVikinLista(ragnarok);
        worldCup.setEspartanoLista(trescientos);

    }
}
