import java.util.ArrayList;

public class PlayLists extends ElemSpoti {
    ArrayList<ElemSpoti> elemMusical;

    public PlayLists(String titulo) {
        super(titulo);
        elemMusical = new ArrayList<ElemSpoti>();
    }

    public void addElemento(ElemSpoti e) {
        if (!elemMusical.contains(e)) {
            elemMusical.add(e);
        }
    }

    public int getPremiosGanados() {
        int sumaTotal = 0;
        for (int i = 0; i < elemMusical.size(); i++) {
            sumaTotal += elemMusical.get(i).getPremiosGanados();
        }

        return sumaTotal;
    }

    public ArrayList<Interprete> getInterpretes() {
        ArrayList<Interprete> salida = new ArrayList<>();
        for (int i = 0; i < elemMusical.size(); i++) {
            ArrayList<Interprete> intActuales = elemMusical.get(i).getInterpretes();
            for (int j = 0; j < intActuales.size(); j++) {
                Interprete ei = intActuales.get(j);
                if (!estaRepetido(ei)) {
                    salida.add(ei);
                }
            }
        }
        return salida;
    }

    public boolean estaRepetido(Interprete i) {
        for (int j = 0; j < elemMusical.size(); j++) {
            if (elemMusical.get(j).estaRepetido(i)) {
                return false;
            }
        }
        return true;
    }

    public double getPuntaje() {
        double puntajeTotal = 0;
        for (int i = 0; i < elemMusical.size(); i++) {
            puntajeTotal += elemMusical.get(i).getPuntaje();
        }
        return puntajeTotal;
    }

}
