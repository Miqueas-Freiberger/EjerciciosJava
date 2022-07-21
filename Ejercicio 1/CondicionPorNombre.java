public class CondicionPorNombre implements Condicion {
    String subCadena;

    public CondicionPorNombre(String subC) {
        this.subCadena = subC;
    }

    public boolean cumple(Interprete i) {
        return i.getNombre().equals(subCadena);
    }
}
