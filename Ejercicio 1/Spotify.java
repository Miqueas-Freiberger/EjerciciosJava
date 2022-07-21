import java.util.ArrayList;
import java.util.Collections;

public class Spotify {
    ArrayList<Interprete> autores;

    public ArrayList<Interprete> buscar(Condicion c) {
        ArrayList<Interprete> resultado = new ArrayList<>();
        for (int i = 0; i < autores.size(); i++) {
            Interprete ai = autores.get(i);
            if (c.cumple(ai)) {
                resultado.add(ai);
            }
        }

        Collections.sort(resultado);
        return resultado;
    }

}
