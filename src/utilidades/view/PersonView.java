package utilidades.view;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;
import java.time.LocalDate;
import enumeraciones.Genero;

public class PersonView {
	
	public static Genero getGenero() {
		String genero = "Genero\n"
				+ "[M] Masculino\n"
				+ "[F] Femenino\n"
				+ "Seleccione una opcion M/F";
		String leerGenero = leer(genero);
		String mayuscula = leerGenero.toUpperCase();
		char sexo = mayuscula.charAt(0);
		return (sexo == 'M'? Genero.MASCULINO : Genero.FEMENINO);
	}
	
	public static LocalDate getFechaNacimiento() {
		int anioNacimiento = leerInt("Año de nacimiento");
		int mesNacimiento = leerInt("Mes de nacimiento");
		int diaNacimiento = leerInt("Dia de nacimiento");
		
		return LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
	}
	
	
}
