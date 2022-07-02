package CodigoMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/** 
 * Esta clase contiene los atributos y metodos de una ruta.
 * @author NSFW TEAM
 * @version 1.0
 * @see Ubicable
 */
public class Ruta implements Ubicable {
    
    ArrayList <String> coordenadas;
    private String nombreRuta;
    HashMap<String, UsuarioClase> personasOnRute;
    private String ciudad;
    
    /**
     * Metodo para crear una nueva ruta.
     * @param nombreRuta El nombre de la ruta nueva
     */
    public Ruta(String nombreRuta){
        this.nombreRuta=nombreRuta;
        ArrayList<String> coordenadasAux = new ArrayList<String>();
        this.coordenadas= coordenadasAux;
        this.personasOnRute = new HashMap<String, UsuarioClase>();
    }
    
    /**
     * Metodo getter que retorna el nombre de la ruta.
     * @return Retorna el nombre de la ruta
     */
    public String NombreDeRuta(){
        return this.nombreRuta;
    }
    
    /**
     * Metodo que agrega (vincula) un usuario (conductor o pasajero) a una ruta.
     * @param persona Persona a agregar a la ruta
     * @param rut Rut de la persona que se agrega a la ruta
     */
    public void agregarPersona(Object persona,String rut){
        if (persona.getClass().toString().equals("class CodigoMain.ConductorClase")){
            System.out.println("conductor");
            personasOnRute.put(rut, (ConductorClase) persona);
        }
        else if(persona.getClass().toString().equals("class CodigoMain.PasajeroClase")){
            System.out.println("pasajero");
            personasOnRute.put(rut, (PasajeroClase) persona);
        }   
    }
    
    /**
     * Metodo para eliminar (desvincular) a una persona de una ruta.
     * @param persona Persona a eliminar de la ruta
     * @param rut Rut de la persona que se elimina de la ruta
     */
    public void SalirDeRuta(Object persona,String rut){
        if(personasOnRute.containsKey(rut)){
            personasOnRute.remove((UsuarioClase) persona);
        }
        else{
            System.out.println("No se encuentra la persona en esta ruta");
        }
    }
    @Override
    /**
     * Metodo que fija unas coordenadas a una ruta.
     * @param coordenadas Coordenadas especificadas
     */
    public void fijarCoordenadas(ArrayList <String> coordenadas,String city){
        this.coordenadas=coordenadas;
        this.ciudad=city;
        /*
        Iterator<String> s = coordenas.iterator();
        while(s.next()!=null){
            this.coordenadas.add(s.toString());
        }*/
    }
    @Override
    /**
     * Metodo que actualiza las coordenadas.
     * @param coordenas Coordenadas a actualizar
     */
    public void moverse(ArrayList <String>  coordenas) {
        this.coordenadas=coordenadas;
        return;
    }
    @Override
    /**
     * Metodo que retorna las coordenadas de una ruta.
     * @return Retorna las coordenadas de la ruta
     */
    public String obtenerUbicacion() {
        return("Esta Ruta abarca desde "+this.coordenadas.get(0)+" Hasta " + this.coordenadas.get(this.coordenadas.size()-1));
    }
}