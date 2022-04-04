package dominio;

import java.util.List;

public class MiClaseI extends MiClaseA implements MiInterfaz {

	private MiClaseI(List<TipoBase> lista) {
		super(lista);	
	}
	
	//Factorías
	public static MiInterfaz of(List<TipoBase> lista) {
		return null;
	}

	public static MiInterfaz leeDeFichero(String fichero) {
		return null;
	}

	/******************************** Implementación de tratamientos iterativos *************************/

}
