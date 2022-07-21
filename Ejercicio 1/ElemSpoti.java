import java.util.ArrayList;

public abstract class ElemSpoti {
    String titulo;

    public ElemSpoti(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public abstract int getPremiosGanados();

    public abstract ArrayList<Interprete> getInterpretes();

    public abstract double getPuntaje();

    public abstract boolean estaRepetido(Interprete i);

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            ElemSpoti otroElem = (ElemSpoti) obj;

            return this.getTitulo().equals(otroElem.getTitulo());
        }

    }

}
