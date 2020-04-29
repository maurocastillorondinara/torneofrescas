package Model;

import java.util.Objects;

public class Vikingo extends Humano{
    Integer BebedorProfesional;

    public Vikingo(String nomb,Integer eda, Integer pes, Integer bebedor){
        super(nomb,eda,pes);
        this.BebedorProfesional = bebedor;
    }

    @Override
    public Integer getBeber() {
        Integer beb = this.ibb.beber(this.BebedorProfesional);
        setIngerida(beb);
        return beb;
    }

    @Override
    public String getOrinar() { return this.irn.orinar(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vikingo vikingo = (Vikingo) o;
        return Objects.equals(BebedorProfesional, vikingo.BebedorProfesional);
    }

    @Override
    public int compareTo(Object o) {
        int flag = -1;
        if(o instanceof Humano)
        {
            Humano h = (Humano)o;
            if(h.getEdad() == this.getEdad())
            {
                flag = 0;
            }else if(this.getEdad() > h.getEdad()){
                flag = 1;
            }else{
                flag = -99;
            }
        }

        return flag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), BebedorProfesional);
    }

    @Override
    public String toString() {
        return "Vikingo{" +
                "BebedorProfesional=" + BebedorProfesional +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                '}';
    }
}
