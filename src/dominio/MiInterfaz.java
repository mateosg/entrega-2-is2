package dominio;

import java.util.List;

public interface MiInterfaz {

	public static enum TipoImplementacion {
		IMPERATIVA, FUNCIONAL
	}
	
	public static MiInterfaz of(List<TipoBase> lista, TipoImplementacion tipo) {
		return switch (tipo) {
		case FUNCIONAL -> MiClaseF.of(lista);
		case IMPERATIVA -> MiClaseI.of(lista);
		};
	}
	public static MiInterfaz of(List<TipoBase> lista) {
		return of(lista, TipoImplementacion.FUNCIONAL);
	}
	
	public static MiInterfaz leeDeFichero(String fichero, TipoImplementacion tipo) {
		return switch(tipo) {
		case FUNCIONAL -> MiClaseF.leeDeFichero(fichero);
		case IMPERATIVA -> MiClaseI.leeDeFichero(fichero);
		};
	}
	public static MiInterfaz leeDeFichero(String fichero) {
		return leeDeFichero(fichero, TipoImplementacion.FUNCIONAL);
	}
	/******************************** prototipos tratamientos iterativos ****************************/
}
