package com.hvp.eed.examen.OptimizacionYDocumentacion;
/**
 * Se lanza cuando la edad del perro es menor que 0
 * @author Hugo Vicente Peligro
 *
 */
public class EdadErroneaException extends Exception {
	/**
	 * Se crea EdadErroneaException con el mensaje especificado
	 * @param message mensaje de la excepcion
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
