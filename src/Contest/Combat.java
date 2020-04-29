package Contest;

import Model.Espartano;
import Model.Humano;
import Model.Vikingo;

import java.util.concurrent.Semaphore;

public class Combat {

    private Semaphore semaphore;

    public Combat(){
        semaphore = new Semaphore(2);
    }

    public synchronized Humano start(Vikingo viking, Espartano spartan)
    {
        System.out.println("Los Contrincantes se preparan para la Altamente Etilica Competencia");

        System.out.println("En la primera mesa se Encuentra el Vikingo : "+viking.toString());
        System.out.println("En la Segunda mesa se Encuentra el Espartano: "+spartan.toString());

        while(viking.getCapacidad() > viking.getIngerida() || spartan.getCapacidad() > spartan.getIngerida())
        {
            try{
                this.bebiendo(viking);
                this.bebiendo(spartan);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        //Conocer al Ganador
        if (ganadorVikingo(viking,spartan))
        {
            ganador(viking);
            System.out.println(spartan.getOrinar());
            return viking;
        }
        ganador(spartan);
        System.out.println(viking.getOrinar());
        return spartan;

    }

    public boolean ganadorVikingo(Vikingo viking, Espartano spartan)
    {
        Integer sobraVikingo = 0;
        Integer sobraEspartano = 0;
        boolean flag = false;
        if(viking.getCapacidad() < viking.getIngerida() && spartan.getCapacidad() < spartan.getIngerida())
        {
            sobraVikingo = viking.getIngerida() - viking.getCapacidad();
            sobraEspartano = spartan.getIngerida() - spartan.getCapacidad();
            if (sobraVikingo < sobraEspartano){
                flag = true;
            }
        }else if(viking.getCapacidad() < viking.getIngerida())
        {
            flag = true;
        }

        return flag;
    }

    public void bebiendo(Humano humano) throws InterruptedException {
        this.semaphore.acquire();
        int i = humano.getBeber();
        System.out.println("Bebiendo el preciado Nectar de los dioses!!!");
        humano.setIngerida(i);
        System.out.println("He ingerido "+i+" liquido");
        this.semaphore.release();
    }

    public void ganador(Humano human){
        System.out.println("El ganador es : ");
        System.out.println(human.toString());
    }
}
