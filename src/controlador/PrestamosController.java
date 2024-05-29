package controlador;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.continuar;
import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.leer;
import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.mostrar;
import static utilidades.view.BookView.getBookView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Operable;

public class PrestamosController {
	public static Operable prestamos;
	
	public static void initDataPrestamos(Operable prestamos) {
		PrestamosController.prestamos = prestamos;
	}
	
	public static class OyenteRegistrarPrestamos implements ActionListener{
		public void actionPerformed(ActionEvent e) {
    		if (!prestamos.isFull()) {
    			do {
					String isbn = leer("Ingrese el isbn");
					int position = prestamos.getPosition(isbn);
					if (!prestamos.exist(position)) {
						prestamos.add(getBookView(isbn));
						mostrar("prestamo registrado con exito");
					} else 
						mostrar("ya esta prestado");
					
				} while (!prestamos.isFull() && continuar("Deseas solicitar otro prestamo"));	
			} else 
				mostrar("prestamos se encuentra lleno");
    	}
	}
		
	}




