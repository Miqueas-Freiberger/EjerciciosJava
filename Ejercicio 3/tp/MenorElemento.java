package tp;

import java.util.ArrayList;

public class MenorElemento implements AccionEjecutable {
private ArrayList<Nodo> nodos;
	
	public MenorElemento() {
		this.nodos = new ArrayList<>();
	}
 
	@Override
	public void ejecutarNodo(Nodo n) {
		nodos.add(n);
	}
	
	@Override
	public String toString() {
		return "El menor elemento es :" + nodos.get(0);
	}
}
