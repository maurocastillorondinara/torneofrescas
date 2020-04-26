import Interface.BeberVikingo;
import Model.Team;
import Model.Vikingo;

public class main {
    public static void main(String[] args) {
        Team<Vikingo> ragnarok = new Team<>();
        Vikingo thor = new Vikingo("Thor",25,80,4);
        Vikingo olaf = new Vikingo("Olaf",35,120,6);
        Vikingo rudolf = new Vikingo("Rudolf",18,100,3);
        olaf.setIbeber(new BeberVikingo());
        System.out.println(olaf.getBeber());

        ragnarok.addMember(olaf);
        ragnarok.addMember(thor);
        ragnarok.ageSort();
        ragnarok.printAll();
    }
}
