package prueba.semana1;

import javax.persistence.*;

/**
 * Coche.java Clase para el objecto Coche
 * @autor: Antoni
 * @revisor: Carlos
 * @version: 1.1
 */
@Entity
@Table(name = "coche")
public class Coche extends Vehiculo {

	@Column
    private String tipoMarchas;

    protected static final String TIPO = "Coche";

    /**
     * Constructor de la clase Coche.
     *
     * @param color       color del vehiculo
     * 
     * @param marca       marca del vehiculo
     * 
     * @param precio      precio del vehiculo
     * 
     * @param matricula   matricula del vehiculo
     * 
     * @param tipoMarchas tipo de marchas del coche
     * 
     */
    public Coche() {
    	super();
    }
    
    public Coche(String color, String marca, String precio, String matricula, String tipoMarchas) {
        super(color, marca, precio, matricula, 4); // Siempre tiene 4 ruedas si es un coche
        this.tipoMarchas = tipoMarchas;

    }

    public String getTipoMarchas() {
        return tipoMarchas;
    }

    /**
     * imprime los datos del coche.
     *
     **/
    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un coche");
        System.out.println("Este coche tiene una marcha " + tipoMarchas);
        super.imprimirDatos();
    }

}
