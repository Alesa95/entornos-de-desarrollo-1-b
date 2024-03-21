package modelos;

import java.util.*;

/**
 * Representa una casa del mundo real.
 */
public class Casa {

    private String direccion;
    private int numHabitaciones;
    private int metrosCuadrados;

    /**
     * Constructor por defecto
     */
    public Casa() {
    }
    
    /**
     * Constructor que recibe como parametros la direccion, el numero de habitaciones y los metros cuadrados de una casa del mundo real.
     * 
     * @param direccion 		La direccion de la casa
     * @param numHabitaciones 	El numero de habitaciones de la casa
     * @param metrosCuadrados	Los metros cuadrados de la casa
     */
    public Casa(String direccion, int numHabitaciones, int metrosCuadrados) {
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return
     */
    public String getDireccion() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getNumHabitaciones() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getMetrosCuadrados() {
        // TODO implement here
        return 0;
    }

    /**
     * @param direccion
     */
    public void setDireccion(String direccion) {
        // TODO implement here
    }

    /**
     * @param numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        // TODO implement here
    }

    /**
     * @param metrosCuadrados
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}