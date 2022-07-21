public class CondicionPorApellido implements Condicion {
    String subCadena;

    public CondicionPorApellido(String subCadena) {
        this.subCadena = subCadena;
    }

    public boolean cumple(Interprete i) {
        return i.getApellido().equals(subCadena);
    }
}
