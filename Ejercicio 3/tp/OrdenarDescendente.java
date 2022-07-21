package tp;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarDescendente implements AccionEjecutable {
	
	ArrayList<Nodo> valores;
	public OrdenarDescendente() {
		this.valores = new ArrayList<>();
	}

//	@Override
//	public void ejecutarNodo(Nodo n) {
//		if(valores.size() == 0) {
//			valores.add(n);
//		}else {
//			for (int i = 0; i < valores.size(); i++) {
//				Nodo nodo = valores.get(i);
//				System.out.println(nodo.getValor() + "---" + n.getValor());
//				if(nodo.getValor().compareTo(n.getValor()) > 0) {
//					
//					valores.add(i, n);
//				}
//			}
//		}
//	}
	
	@Override
	public void ejecutarNodo(Nodo n) {
		valores.add(n);
	}
	
	public ArrayList<Nodo> invertir(){
		ArrayList<Nodo> aux = new ArrayList<>(valores);
		Collections.reverse(aux);
		return aux;
	}

	@Override
	public String toString() {
		return "OrdenarDescendentes [valores=" + this.invertir() + "]";
	}
}
