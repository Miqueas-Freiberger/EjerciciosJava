import java.util.ArrayList;
import java.util.Collections;

public class Jugueteria {
    ArrayList<ElementoJugueteria> productos;

    public ArrayList<ElementoJugueteria> buscar (Condicion c){
        ArrayList<ElementoJugueteria> resultado = new ArrayList<>();

        for (int i = 0; i < productos.size(); i++) {
            ElementoJugueteria aux = productos.get(i);
            resultado.addAll(aux.buscar(c));
        }
        Collections.sort(resultado);
        return resultado;
    }
}
