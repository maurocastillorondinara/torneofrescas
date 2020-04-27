package Model;

import java.util.Objects;

public class Espartano extends Humano {
    Integer ToleranciaExtra;

    public Espartano(String nomb,Integer eda, Integer pes, Integer tolerancia){
        super(nomb,eda,pes);
        this.ToleranciaExtra = tolerancia;
    }


    @Override
    public Integer getBeber() {
        return this.ibb.beber(this.ToleranciaExtra);
    }

    @Override
    public Boolean getOrinar() {
        return this.irn.orinar();
    }

    @Override
    public int compareTo(Object o) {
        int flag = 1;
        if(o instanceof Espartano)
        {
            Espartano h = (Espartano)o;
            if(h.getPeso() == this.getPeso())
            {
                flag = 0;
            }else if(this.getPeso() > h.getPeso()){
                flag = -1;
            }else{
                flag = -99;
            }
        }

        return flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Espartano espartano = (Espartano) o;
        return Objects.equals(ToleranciaExtra, espartano.ToleranciaExtra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ToleranciaExtra);
    }

    @Override
    public String toString() {
        return "Espartano{" +
                "ToleranciaExtra=" + ToleranciaExtra +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                '}';
    }
}
