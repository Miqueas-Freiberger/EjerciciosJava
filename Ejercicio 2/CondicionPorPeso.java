public class CondicionPorPeso extends Condicion{
    double peso;

    public CondicionPorPeso(double peso){
        this.peso = peso;
    }

    public boolean cumple(ElementoJugueteria e){
        return e.getPeso() < peso;
    }
}
