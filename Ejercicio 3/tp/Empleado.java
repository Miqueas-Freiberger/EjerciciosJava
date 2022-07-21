package tp;

public class Empleado extends Persona{
	private int numeroLegajo;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, int dni, int numeroLegajo, double sueldo) {
		super(nombre, apellido, dni);
		this.numeroLegajo = numeroLegajo;
		this.sueldo = sueldo;
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
