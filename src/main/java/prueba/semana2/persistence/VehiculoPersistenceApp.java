package prueba.semana2.persistence;

import javax.persistence.EntityManager;

import prueba.semana1.Coche;
import prueba.semana2.persistence.JPAPersistence;

/**
 * VehiculoPersistenceApp.java
 * 
 * @autor: Antoni
 * @version: 1.0
 */

public class VehiculoPersistenceApp {

	/**
	 * Crea un objeto coche, y depues lo obtiene de la base de datos con su id,
	 * imprimiendolo en pantalla.
	 * 
	 * @param no hay input
	 */
	public static void main(String[] args) {

		EntityManager entity = JPAPersistence.getEntityManagerFactory().createEntityManager();
		// Creamos un coche
		Coche coche = new Coche("rojo", "Toyota", "200000€", "asdfasdf123", "Manual");

		// Guardamos este coche en la base de datos
		entity.getTransaction().begin();
		entity.persist(coche);
		entity.getTransaction().commit();

		// Obtenemos el coche de la base de datos a partir de la id obtenida al crearlo,
		// y lo imprimimos en pantalla
		coche = entity.find(Coche.class, coche.getVechiculo_Id());
		coche.imprimirDatos();
		
		//Cerramos la conexion
		JPAPersistence.shutdown();
	}

}
