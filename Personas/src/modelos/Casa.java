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
     * @return	La direccion de la casa
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * @return	El numero de habitaciones de la casa
     */
    public int getNumHabitaciones() {
        return this.numHabitaciones;
    }

    /**
     * @return	Los metros cuadrados de la casa
     */
    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    /**
     * @param direccion		La direccion de la casa
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @param numHabitaciones	El numero de habitaciones de la casa
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @param metrosCuadrados	Los metros cuadrados de la casa
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return	Una cadena con la direccion, el numero de habitaciones y los metros cuadrados de la casa
     */
    public String toString() {
        return direccion + " " + numHabitaciones + " " + metrosCuadrados;
    }
}