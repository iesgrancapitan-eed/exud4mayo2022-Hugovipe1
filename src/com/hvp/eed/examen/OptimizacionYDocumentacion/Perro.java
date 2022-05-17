package com.hvp.eed.examen.OptimizacionYDocumentacion;
/**
 * <p>Clase Perro que tiene como estado nombre, edad y GUAUUUUUUUUUU como variable estática</p>
 * <p> Como comportamiento puede ladrar </p>
 * <p> Extiende de la clase Mascota </p>
 * @author Hugo Vicente Peligro
 *
 */
public class Perro extends Mascota {
	/**
	 * Ladrido del perro
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";

	/**
	 * Edad del perro
	 */
	private int age;

	/**
	 * Crea un nuevo perro
	 * @param name nombre del perro
	 * @param age edad del perro
	 * @throws EdadErroneaException lanzada cuando la edad es negativa
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}
	/**
	 * Asigna la edad del perro
	 * @param age edad del perro
	 * @throws EdadErroneaException lanzada cuando la edad es negativa
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}
/**
 * Obtiene la edad del perro
 * @return edad del perro
 */
	public int getAge() {
		return this.age;
	}
/**
 * Hace que el perro ladre
 * @return ladrido del perro
 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
