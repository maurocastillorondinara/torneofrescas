package Model;

import java.util.Objects;

public class Espartano extends Humano {
    Integer ToleranciaExtra;

    public Espartano(String nomb,Integer eda, Integer pes, Integer tolerancia){
        super(nomb,eda,pes);
        this.ToleranciaExtra = tolerancia;
    }

    @Override
    public void beber() {
        System.out.println("Hacer beber ");
    }

    @Override
    public void orinar() {
        System.out.println("Hacer orinar");
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
