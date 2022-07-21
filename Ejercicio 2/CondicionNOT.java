public class CondicionNOT extends Condicion{
    Condicion cond;

    public CondicionNOT(Condicion c){
        this.cond = c;
    }

    public boolean cumple(ElementoJugueteria e){
        return !cond.cumple(e);
    }
}
