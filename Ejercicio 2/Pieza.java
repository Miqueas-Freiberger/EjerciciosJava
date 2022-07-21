import java.util.ArrayList;

public class Pieza extends ElementoJugueteria {
    double peso;
    double costo;
    String color;
    int cantidadEncastres;

    public Pieza(String marca, double peso, double costo, String color, int cantidadEncastres){
        super(marca);
        this.peso = peso;
        this.costo = costo;
        this.color = color;
        this.cantidadEncastres = cantidadEncastres;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadEncastres() {
        return cantidadEncastres;
    }

    public void setCantidadEncastres(int cantidadEncastres) {
        this.cantidadEncastres = cantidadEncastres;
    }

    public ArrayList<ElementoJugueteria> buscar(Condicion c){
        ArrayList<ElementoJugueteria> resultado = new ArrayList<ElementoJugueteria>();
        if(c.cumple(this)){
            resultado.add(this);
        }
        return resultado;
    }
    
}