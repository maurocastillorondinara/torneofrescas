package Model;

import Interface.Ibeber;
import Interface.Iorinar;

import java.util.Objects;

public abstract class Humano implements Comparable  {
    String Nombre;
    Integer Edad;
    Integer Peso;
    Long dni;
    Ibeber ibb;
    Iorinar irn;

    public Humano(String nomb,Integer eda, Integer pes){
        this.Nombre = nomb;
        this.Edad = eda;
        this.Peso = pes;
    }

    public abstract Integer getBeber();

    public abstract Integer getOrinar();

    public Iorinar getIorinar(){
        return this.irn;
    }

    public void setIorinar(Iorinar iorinar){
        this.irn = iorinar;
    }

    public Ibeber getIbeber(){
        return this.ibb;
    }

    public void setIbeber(Ibeber ibeber){
        this.ibb = ibeber;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer peso) {
        Peso = peso;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humano humano = (Humano) o;
        return Objects.equals(Nombre, humano.Nombre) &&
                Objects.equals(Edad, humano.Edad) &&
                Objects.equals(Peso, humano.Peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Edad, Peso);
    }

    @Override
    public String toString() {
        return "Humano{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Peso=" + Peso +
                '}';
    }
}
