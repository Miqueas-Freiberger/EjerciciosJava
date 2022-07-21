public class CondicionPorPremio implements Condicion {
    int cantidadPremios;

    public CondicionPorPremio(int cantidadPremios) {
        this.cantidadPremios = cantidadPremios;
    }
    // getters y setters

    public boolean cumple(Interprete i) {
        return i.getCandidadTemasConPremios(cantidadPremios) > cantidadPremios;
    }
}
