import java.util.ArrayList;

public abstract class ElementoJugueteria implements Comparable<ElementoJugueteria> {
    String marca;

    public ElementoJugueteria(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public abstract double getPeso();

    public abstract String getColor();

    public abstract int getCantidadEncastres();

    public abstract double getCosto();
    public abstract ArrayList<ElementoJugueteria> buscar(Condicion c);

    @Override
    public int compareTo(ElementoJugueteria o) {
        int result = marca.compareTo(o.getMarca());
        if (result == 0) {
            double otroCosto = o.getCosto();
            double miCosto = this.getCosto();
            if (miCosto > otroCosto) {
                return 1;
            } else if (miCosto < otroCosto) {
                return -1;
            } else {
                result = this.getCantidadEncastres() - o.getCantidadEncastres();
                if (result == 0) {
                    return this.getColor().compareTo(o.getColor());
                } else {
                    return result;
                }
            }
        } else {
            return result;
        }
    }
}
