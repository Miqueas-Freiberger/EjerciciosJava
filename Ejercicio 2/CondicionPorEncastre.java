public class CondicionPorEncastre extends Condicion{
    int cantEncastres;

    public CondicionPorEncastre(int cantEncastres){
        this.cantEncastres = cantEncastres;
    }

    public boolean cumple(ElementoJugueteria e){
        return e.getCantidadEncastres() < cantEncastres;
    }
}