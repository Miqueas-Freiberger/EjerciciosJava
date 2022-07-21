package tp;

public class Nodo {
	private Comparable valor;
	private Nodo nodoIzquierdo;
	private Nodo nodoDerecho;
	
	public Nodo() {
		this.valor = null;
		this.nodoDerecho = null;
		this.nodoIzquierdo = null;
	}

	public Comparable getValor() {
		return valor;
	}

	public void addNodo(Comparable v){
		if(valor == null) {
			valor = v;
		}else {
			   
			if(valor.compareTo(v) > 0 ) {
				if(nodoIzquierdo == null) {
					nodoIzquierdo = new Nodo();
				}
				nodoIzquierdo.addNodo(v);
			}
			else if(valor.compareTo(v) < 0) {
				if(nodoDerecho == null) {
					nodoDerecho = new Nodo();
				}
				nodoDerecho.addNodo(v);
			}
		}
	}

	@Override
	public String toString() {
		return "valor=" + valor;
	}
	
	public String imprimirEstructura() {
		return  "Raiz :" + valor +
				"\n \t Nodo Izquierdo :" + nodoIzquierdo +
				"\n \t Nodo Derecho :" + nodoDerecho + "\n";
	}
	
	public void recorrerNodo(AccionEjecutable accion) {
		if(nodoIzquierdo != null) {
			nodoIzquierdo.recorrerNodo(accion);
		}
		
		accion.ejecutarNodo(this);
		
		if(nodoDerecho != null) {
			nodoDerecho.recorrerNodo(accion);
		}
	}
}
