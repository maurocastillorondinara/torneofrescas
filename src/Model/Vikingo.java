package Model;

import java.util.Objects;

public class Vikingo extends Humano{
    Integer BebedorProfesional;

    public Vikingo(String nomb,Integer eda, Integer pes, Integer bebedor){
        super(nomb,eda,pes);
        this.BebedorProfesional = bebedor;
    }

    @Override
    public Integer getBeber() { return this.ibb.beber(); }

    @Override
    public Integer getOrinar() { return this.irn.orinar(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vikingo vikingo = (Vikingo) o;
        return Objects.equals(BebedorProfesional, vikingo.BebedorProfesional);
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
