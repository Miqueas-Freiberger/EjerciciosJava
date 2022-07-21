import java.util.ArrayList;

public class Combo extends ElementoJugueteria {
    ArrayList<ElementoJugueteria> piezas;
    int descuento;

    public Combo(String marca, int descuento) {
        super(marca);
        this.descuento = descuento;
        piezas = new ArrayList<ElementoJugueteria>();
    }

    public ArrayList<ElementoJugueteria> getPiezas() {
        return new ArrayList<ElementoJugueteria>(piezas);
    }

    public void addPieza(ElementoJugueteria p) {
        piezas.add(p);
    }

    public double getPeso() {
        double pesoTotal = 0;
        for (int i = 0; i < piezas.size(); i++) {
            pesoTotal += piezas.get(i).getPeso();
        }

        return pesoTotal;
    }

    public String getColor() {
        if (piezas.size() != 0) {
            int pos = piezas.size() - 1;
            return piezas.get(pos).getColor();
        } else {
            return null;
        }
    }

    public int getCantidadEncastres() {
        int cantidadEncastresTotal = 0;
        for (int i = 0; i < piezas.size(); i++) {
            cantidadEncastresTotal += piezas.get(i).getCantidadEncastres();
        }
        if(piezas.size() > 0){
            return (int)cantidadEncastresTotal / piezas.size();
        }
        else{
            return 0;
        }
        
    }

    public double getCosto() {
        double costoTotal = 0;
        for (int i = 0; i < piezas.size(); i++) {
            costoTotal += piezas.get(i).getCosto();
        }

        return costoTotal - (costoTotal * descuento / 100);
    }

    public ArrayList<ElementoJugueteria> buscar(Condicion c) {
        ArrayList<ElementoJugueteria> resultado = new ArrayList<ElementoJugueteria>();
        if(c.cumple(this)){
            resultado.add(this);
        }

        for (int i = 0; i < piezas.size(); i++) {
            ElementoJugueteria aux = piezas.get(i);
            resultado.addAll(aux.buscar(c));
        }
        return resultado;
    }

}
