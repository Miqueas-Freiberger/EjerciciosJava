package tp;

import java.util.ArrayList;

public class MayorElemento implements AccionEjecutable{
	private ArrayList<Nodo> nodos;
	
	public MayorElemento() {
		this.nodos = new ArrayList<>();
	}

	@Override
	public void ejecutarNodo(Nodo n) {
		nodos.add(n);
	}
	
	public int getMayorElemento() {
		return nodos.size()-1;
	}
	
	@Override
	public String toString() {
		return "El mayor elemento es :" + nodos.get(getMayorElemento());
	}

}
