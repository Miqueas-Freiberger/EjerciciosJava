package tp;

import java.util.ArrayList;

public class CantidadElementos implements AccionEjecutable {
	ArrayList<Nodo> valores;
	
	public CantidadElementos() {
		this.valores = new ArrayList<>();
	}

	@Override
	public void ejecutarNodo(Nodo n) {
		valores.add(n);
	}

	@Override
	public String toString() {
		return "CantidadElementos = " + valores.size();
	}
	
	
}
