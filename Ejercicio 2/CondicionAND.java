public class CondicionAND extends Condicion{
    Condicion cond1,cond2;

    public CondicionAND(Condicion c1, Condicion c2){
        this.cond1 = c1;
        this.cond2 = c2;
    }

    public boolean cumple(ElementoJugueteria e){
        return cond1.cumple(e) && cond2.cumple(e);
    }
}
