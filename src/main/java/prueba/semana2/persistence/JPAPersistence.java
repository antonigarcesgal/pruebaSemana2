package prueba.semana2.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * JPAPersistence.java
 * 
 * @autor: Antoni
 * @version: 1.0
 */
public class JPAPersistence {
	// Utilizando el persistence.xml en la carpeta META_INF definimos los parametros
	// necesarios para conectarse con la base de datos
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return factory;
	}

	//Cierra la conexión establecida
	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
