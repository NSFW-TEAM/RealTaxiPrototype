package CodigoMain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Esta clase contiene los atributos y metodos de un auto.
 * @author NSFW Team
 * @version 1.0
 */
public class AutoClase {
    
    private String marca;
    private String color;
    private String modelo;
    private String patente;
    private int añoFab;
    private ArrayList <PasajeroClase> Pasajeros;
    
    /**
    * Metodo que retorna la capacidad de un auto.
    * @return Retorna la capacidad del auto
    */
    public int getCapacidad(){
        return (4 - this.Pasajeros.size());
    }
    
    /**
    * Metodo que toma a un pasajero y lo asocia a un auto.
    * @param pasajero Pasajero a tomar
    */
    public void tomarPasajero(PasajeroClase pasajero){
        this.Pasajeros.add(pasajero);
    }
    
    /**
    * Metodo setter para especificar la marca del auto.
    * @param marca Nombre de la marca
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
    * Metodo setter para especificar el color del auto.
    * @param color Nombre del color
    */
    public void setColor(String color) {
        this.color = color;
    }

    /**
    * Metodo setter para especificar el modelo del auto.
    * @param modelo Nombre del modelo
    */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
    * Metodo setter para especificar la patente del auto.
    * @param patente Patente del auto (cuatro letras y dos numeros)
    */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
    * Metodo setter para especificar el año de fabricacion del auto.
    * @param añoFab Año de fabricacion
    */
    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }
    
    /**
    * Metodo constructor parametrizado.
    * @param marca Marca del auto
    * @param color Color del auto
    * @param modelo Modelo del auto
    * @param patente Patente del auto
    * @param añoFab Año de fabricacion del auto
    */
    public AutoClase(String marca, String color, String modelo, String patente, int añoFab) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.patente = patente;
        this.añoFab = añoFab;
        this.Pasajeros = new ArrayList<PasajeroClase>();   
    }
    
    /**
    * Metodo constructor parametrizado. (no incluye el año de fabricacion)
    * @param marca Marca del auto
    * @param color Color del auto
    * @param modelo Modelo del auto
    * @param patente Patente del auto
    */
    public AutoClase(String marca, String color, String modelo, String patente) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.patente = patente;
        this.añoFab = 0;
    }

    /**
     * Metodo getter que retorna la marca del auto.
     * @return Retorna la marca del auto
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo getter que retorna el color del auto.
     * @return Retorna el color del auto
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo getter que retorna el modelo del auto.
     * @return Retorna el modelo del auto
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo getter que retorna la patente del auto.
     * @return Retorna la patente del auto
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Metodo getter que retorna el año de fabricacion del auto.
     * @return Retorna el año de fabricacion del auto
     */
    public int getAñoFab() {
        return añoFab;
    }

    /**
     * Metodo que busca a un pasajero del auto segun su rut y lo deja. (desvincula)
     * @param pasajero Pasajero a dejar
     */
    public void dejarPasajero(PasajeroClase pasajero) {
        for(int i=0;i<this.Pasajeros.size();i++){
            if(this.Pasajeros.get(i).getRut().equals(pasajero.getRut())){
                this.Pasajeros.remove(i);
            }
        }
    }

    /**
     * Metodo que retorna un determinado pasajero segun su numero asignado.
     * @param i numero asignado a pasajero de un auto
     * @return Retorna un pasajero determinado por su numero de pasajero dentro del auto
     */
    public PasajeroClase getPasajeros(int i){
        return this.Pasajeros.get(i);
    }
}