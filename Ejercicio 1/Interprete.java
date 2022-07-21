import java.util.ArrayList;

public class Interprete implements Comparable<Interprete> {
    String nombre;
    String apellido;
    int anioNacimiento;
    ArrayList<Tema> temasQueCanta;

    public Interprete(String nombre, String apellido, int anioLanzamiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioLanzamiento;
        temasQueCanta = new ArrayList<Tema>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public ArrayList<Tema> getTemasQueCanta() {
        return new ArrayList<Tema>(temasQueCanta);
    }

    public void addTema(Tema t) {
        if (temasQueCanta.contains(t)) {
            temasQueCanta.add(t);
        }
    }

    public int getCandidadTemasConPremios(int cantPremios) {
        int cantidad = 0;
        for (int i = 0; i < temasQueCanta.size(); i++) {
            if (temasQueCanta.get(i).getPremiosGanados() > cantPremios)
                cantidad++;
        }
        return cantidad;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            Interprete otroInterprete = (Interprete) obj;
            return this.getNombre().equals(otroInterprete.getNombre())
                    && this.getApellido().equals(otroInterprete.getApellido())
                    && this.getAnioNacimiento() == otroInterprete.getAnioNacimiento();
        }
    }

    public int compareTo(Interprete i) {
        int result = this.getApellido().compareTo(i.getApellido());
        if (result == 0) {
            result = this.getNombre().compareTo(i.getNombre());
            if (result == 0) {
                return this.getAnioNacimiento() - i.getAnioNacimiento();
            } else {
                return result;
            }
        } else {
            return result;
        }
    }
}
