package dominio;

import java.util.List;

public abstract class MiClaseA implements MiInterfaz {
	protected List<TipoBase> lista;

	protected MiClaseA(List<TipoBase> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		String res="[";
		for (TipoBase element : lista) {
			res+=element+"\n";
		}
		return res.substring(0,res.length()-1)+"]";
	}

}
