package tp;

public class ImprimirEnPantalla implements AccionEjecutable {

	@Override
	public void ejecutarNodo(Nodo n) {
		System.out.println(n.imprimirEstructura());
	}

}
