package utilidades.view;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;
import static utilidades.view.GeneralView.*;
import static utilidades.view.PersonView.*;

import enumeraciones.TipoDirectivo;
import modelo.Directivos;

public class DirectivosView {
	// Método estático que solicita información sobre un directivo al usuario y devuelve un objeto Directivos con esa información
	public static Directivos getManagerView(String curp) {
		Directivos directivo = new Directivos();
		directivo.setCurp(curp);
		directivo.setRfc(leer("Ingrese el rfc"));
		directivo.setNombre(leer("Ingrese el nombre"));
		directivo.setPaterno(leer("Ingres el apellido paterno"));
		directivo.setMaterno(leer("Ingrese el apelido materno"));
		directivo.setFechaNacimiento(getFechaNacimiento());
		directivo.setGenero(getGenero());
		directivo.setDomicilio(getDomicilio());
		directivo.setPuesto(getPuestoTrabajo());
		directivo.setHorario(getHorario());
		directivo.setSueldo(leerDoble("Ingrese su sueldo "));
		directivo.setGradoEstudios(leer("Ingrese su grado de estudios"));
		directivo.setTipoDirectivo(getTipoDirectivo());
		directivo.setCompensacion(leerDoble("Dijite su compensacion"));
		return directivo;
	}
	
	private static TipoDirectivo getTipoDirectivo() {
		String[] opciones = {
				"Subdirector academico",
				"Sudirector administrativo"
			
		};
		int opcion = getOptionMenu(opciones,"Dijite el numero de la opcion");
		switch(opcion){
		case 1: return TipoDirectivo.SUBDIRECTOR_ACADEMICO;
		case 2: return TipoDirectivo.SUBDIRECTOR_ADMINISTRATIVO;

		}
		return null;
	}
}
