package tp;

public class ArbolBinario{
	public static void main(String[] args) {
		Nodo arbol = new Nodo();
		Empleado empleado1 = new Empleado("juan","garcia", 25458123, 7253,100000);
		Empleado empleado2 = new Empleado("Mar�a","Perez", 23581111, 1222,150000);
		Empleado empleado3 = new Empleado("Pedro","Ruiz", 27888954, 2375,120000);
		Empleado empleado4 = new Empleado("Federico","Perez", 12515712, 8253,80000);
		Empleado empleado5 = new Empleado("Facundo","Quiroga", 33229331, 8002,60400);
		Empleado empleado6 = new Empleado("Rosa","Blotta", 35252232, 9253,140500);
		Empleado empleado7 = new Empleado("Florencia","Paz", 15811654, 1530,110000);
		
//		arbol.addNodo(empleado1.getNumeroLegajo());
//		arbol.addNodo(empleado2.getNumeroLegajo());
//		arbol.addNodo(empleado3.getNumeroLegajo());
//		arbol.addNodo(empleado4.getNumeroLegajo());
//		arbol.addNodo(empleado5.getNumeroLegajo());
//		arbol.addNodo(empleado6.getNumeroLegajo());
//		arbol.addNodo(empleado7.getNumeroLegajo());
//		
//		arbol.addNodo("gato");
//		arbol.addNodo("canario");
//		arbol.addNodo("perro");
//		arbol.addNodo("conejo");
//		arbol.addNodo("liebre");
//		arbol.addNodo("jabali");
//		arbol.addNodo("carpincho");
//		arbol.addNodo("zorro");
//		arbol.addNodo("aguilucho");
		
		arbol.addNodo(8);
		arbol.addNodo(10);
		arbol.addNodo(3);
		arbol.addNodo(2);
		arbol.addNodo(9);
		arbol.addNodo(1);
		
		//System.out.println(arbol.toString());
		AccionEjecutable imprimir = new ImprimirEnPantalla();
		AccionEjecutable ordenarAscendente = new OrdenarAscendente();
		AccionEjecutable OrdenarDescendente = new OrdenarDescendente();
		AccionEjecutable CantidadElementos = new CantidadElementos();
		AccionEjecutable MayorElemento = new MayorElemento();
		AccionEjecutable MenorElemento = new MenorElemento();
		arbol.recorrerNodo(imprimir); //imprime con estructura de arbol
		
		//arbol.recorrerNodo(ordenarAscendente); //ordena los nodos de forma ascendente
		//System.out.println(ordenarAscendente); // imprime los nodos de forma ascendente
//	
//		arbol.recorrerNodo(OrdenarDescendente); 
//		System.out.println(OrdenarDescendente);
//		
//		arbol.recorrerNodo(CantidadElementos);
//		System.out.println(CantidadElementos);
//		arbol.recorrerNodo(MayorElemento);
//		System.out.println(MayorElemento);
//		
//		arbol.recorrerNodo(MenorElemento);
//		System.out.println(MenorElemento);
	}
}
