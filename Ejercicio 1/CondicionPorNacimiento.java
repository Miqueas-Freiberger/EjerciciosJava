public class CondicionPorNacimiento implements Condicion {
    int anio;

    public CondicionPorNacimiento(int anio) {
        this.anio = anio;
    }

    public boolean cumple(Interprete i) {
        return i.getAnioNacimiento() < anio;
    }
}
