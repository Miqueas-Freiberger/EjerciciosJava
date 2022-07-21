import java.util.ArrayList;

public class Tema extends ElemSpoti {
    double puntajePromedio;
    int anioLanzamiento;
    int cantPremiosGanados;
    ArrayList<Interprete> interpretes;

    public Tema(String titulo, double puntajePromedio, int anioLanzamiento) {
        super(titulo);
        this.puntajePromedio = puntajePromedio;
        this.anioLanzamiento = anioLanzamiento;
        interpretes = new ArrayList<Interprete>();
    }

    public int getPremiosGanados() {
        return this.getPremiosGanados();
    }

    public void addInterprete(Interprete i) {
        if (!estaRepetido(i)) {
            interpretes.add(i);
        }
    }

    public boolean estaRepetido(Interprete i) {
        return interpretes.contains(i);
    }

    public ArrayList<Interprete> getInterpretes() {
        return new ArrayList<Interprete>(interpretes);
    }

    public double getPuntaje() {
        return this.getPuntaje();
    }

}