package dominio.test;

import dominio.MiInterfaz;
import dominio.MiInterfaz.TipoImplementacion;

public class Test {

	public static void main(String[] args) {
		System.out.println("Versión imperativa");
		MiInterfaz  foo=MiInterfaz.leeDeFichero("./data/miFichero.csv", TipoImplementacion.IMPERATIVA);
		//A continuación probar todos los tratamientos iterativos con paradigma imperativa

	}

}
