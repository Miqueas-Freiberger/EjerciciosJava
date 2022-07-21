package tp;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarAscendente implements AccionEjecutable {
	ArrayList<Nodo> valores;
	
	public OrdenarAscendente() {
		this.valores = new ArrayList<>();
	}

	@Override
	public void ejecutarNodo(Nodo n) {
		valores.add(n);
	}

	@Override
	public String toString() {
		return "OrdenarAscendente [valores=" + valores + "]";
	}
}
