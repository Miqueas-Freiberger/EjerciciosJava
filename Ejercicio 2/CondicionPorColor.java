public class CondicionPorColor extends Condicion {
    String color;

    public CondicionPorColor(String color){
        this.color = color;
    }

    public boolean cumple(ElementoJugueteria e){
        return e.getColor().equals(color);
    }
}
