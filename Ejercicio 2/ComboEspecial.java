public class ComboEspecial extends Combo {
    Condicion c;
    
    public ComboEspecial(String marca, int descuento, Condicion c){
        super(marca,descuento);
        this.c = c;
    }

    public Condicion getC() {
        return c;
    }

    public void setC(Condicion c) {
        this.c = c;
    }

    public void addPieza(ElementoJugueteria p){
        if(c.cumple(p)){
            super.addPieza(p);
        }
    }

}
