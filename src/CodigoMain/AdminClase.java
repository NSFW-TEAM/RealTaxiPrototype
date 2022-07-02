/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoMain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Francisco
 */

/**
 * Esta clase contiene los atributos y metodos de un administrador y hereda de la clase usuario.
 * @author NSFW Team
 * @version 1.0
 * @see UsuarioClase
 */

/*
Aclaracion sobre la clase AdminClase:

Si bien durante el programa se hace uso de los metodos de esta clase, se considera mas bien como un operador
interno del programa, pero que tambien puede ser utilizado como un usuario, al igual que el los pasajeros y conductores,
pero su objetivo principal es el de realizar operaciones propias del programa, que no tienen permiso normalmente los 
usuarios regulares(Conductores y pasajeros).

*/

class AdminClase extends UsuarioClase{

    /**
     * Metodo constructor parametrizado.
     * @param username Nombre de usuario del administrador
     * @param password Contraseña del administrador
     * @param rut Rut del administrador
     */
    public AdminClase(String username, String password, String rut){
        super(username, password, rut);
    }
    
    /**
     * Metodo que le permite a un administrador cambiar la ruta de un conductor.
     * @param conductor Conductor al que se le cambiara su ruta
     * @param listaRutas Lista que contiene rutas
     */
    public void cambiarRutaConductor(ConductorClase conductor,ArrayList <HashMap> listaRutas){
        
        for (int i=0;i<listaRutas.size();i++){
            if(listaRutas.get(i).containsKey(conductor.getRut())){
                listaRutas.get(i).remove(conductor.getRut());
                int random = i;
                while(i==random){
                    random = (int) (Math.random() * listaRutas.size())+1;
                }
                listaRutas.get(random).put(conductor.getRut(), conductor);
                
            }
        }

    }
    /**
     * Metodo que permite a un administrador mostrar los conductores.
     * @param mapa Mapa de conductores
     * @param listaChoferes Lista de conductores
     * @param ciudad Ciudad del conductor
     */
    public void mostrarConductores(HashMap mapa, JList listaChoferes, String ciudad){
        //Esta funcion mostrara a cada conductor disponible en la zona
        DefaultListModel<String> model = new DefaultListModel<>();
        listaChoferes.setModel(model);
        
        Set keys = mapa.keySet();
        Object[] keysArray = keys.toArray();
        for(int i=0;i<keysArray.length;i++){
            Ruta ruta = (Ruta) mapa.get(keysArray[i]);
            HashMap<String, UsuarioClase> mapaConductores = ruta.personasOnRute;
            mapaConductores.entrySet().forEach((Map.Entry<String, UsuarioClase> entry) -> {
                ConductorClase conductor = (ConductorClase)entry.getValue();
                AutoClase auto = conductor.getAuto();
                model.addElement(conductor.getUsername());
                System.out.println("Rut:" + entry.getKey()+ " Username:" + conductor.getUsername() + " Auto:" + auto.getMarca()+ " " +auto.getModelo());
            });
        }
    }
    
    /**
     * Metodo que permite a un administrador mostrar los conductores.
     * @param mapaConductores Mapa de conductores
     * @param listaChoferes Lista de conductores
     */
    public void mostrarConductores(HashMap<String, ConductorClase> mapaConductores, JList listaChoferes){
        //Esta funcion mostrara a cada conductor disponible en la zona
        DefaultListModel<String> model = new DefaultListModel<>();
        listaChoferes.setModel(model);
        mapaConductores.entrySet().forEach((Map.Entry<String, ConductorClase> entry) -> {
            ConductorClase conductor = entry.getValue();
            AutoClase auto = conductor.getAuto();
            model.addElement(conductor.getUsername());
            System.out.println("Rut:" + entry.getKey()+ " Username:" + conductor.getUsername() + " Auto:" + auto.getMarca()+ " " +auto.getModelo());
        });    
    }
    
    /**
     * Metodo que muestra a todos los pasajeros en una lista. (JList)
     * @param mapaPasajeros Mapa que contiene a todos los pasajeros.
     * @param listaPasajeros Lista que se mostrara, la cual contiene a los pasajeros del mapa
     */ 
    public void mostrarPasajeros(HashMap<String, PasajeroClase> mapaPasajeros, JList listaPasajeros){
        DefaultListModel<String> model = new DefaultListModel<>();
        listaPasajeros.setModel(model);
        mapaPasajeros.entrySet().forEach(entry -> {
            PasajeroClase pasajero = entry.getValue();
            model.addElement(pasajero.getUsername());
           System.out.println("Rut:" + entry.getKey()+ "User name:" + pasajero.getUsername());
        });
    }
    
    /**
     * [PLACEHOLDER]
     * Metodo que permite a un administrador penalizar a un conductor.
     */
    public void penalizarConductor(){
        //Por implementar.
    }
    
    /**
     * Metodo que permite buscar a un conductor.
     * @param username Nombre de usuario del conductor
     * @param mapaConductores Mapa que contiene a todos los conductores
     * @param conductorFuera Conductor encontrado
     * 
     * NOTA: Usado en VentanaMostrarChoferes, ya que unicamente se encuentra el 
     * username del conductor es necesario recorrer las keys del mapa.
     */
    public void buscar(String username,HashMap<String, ConductorClase> mapaConductores,ConductorClase conductorFuera){
        mapaConductores.entrySet().forEach(entry2 -> {
           ConductorClase conductor;
           conductor = entry2.getValue();
           if(conductor.getUsername().equals(username)){
               conductorFuera.setAuto(conductor.getAuto());
               conductorFuera.setCalificación(conductor.getCalificación());
               conductorFuera.setGanancias(conductor.getGanancias());
               conductorFuera.setPassword(conductor.getPassword());
               conductorFuera.setRut(conductor.getRut());
               conductorFuera.setUserName(conductor.getUsername());
           }
        });
    }
    
    /**
     * Metodo que permite buscar a un pasajero por su rut.
     * @param rut Rut del pasajero
     * @param mapaPasajeros Mapa que contiene a todos los pasajeros
     * @return Retorna un pasajero si es encontrado y retorna NULL si no lo encuentra
     */
    public PasajeroClase buscar(String rut,HashMap<String, PasajeroClase> mapaPasajeros){
        if(mapaPasajeros.get(rut)!=null){
            return mapaPasajeros.get(rut);
        }
        return null;
    }
    
    /**
     * Metodo que permite buscar a un conductor por su rut.
     * @param rut Rut del conductor
     * @param mapaConductores Mapa que contiene a todos los conductores
     * @return Retorna un conductor si es encontrado y retorna NULL si no lo encuentra
     */
    public ConductorClase buscarConductor(String rut,HashMap<String, ConductorClase> mapaConductores ) {
        if(mapaConductores.get(rut)!=null){
            return mapaConductores.get(rut);
        }
        return null;
    }
    
    
    /**
     * Metodo que agrega un conductor a la base de datos de conductores.
     * @param conductor Conductor a agregar
     * @throws IOException 
     */
    public void agregarConductor(ConductorClase conductor) throws IOException {
        
        File file = new File("Archivos/choferes.csv");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append(Float.toString(conductor.getCalificación()));
        archivo.append(","+conductor.getUsername());
        archivo.append(","+conductor.getPassword());
        archivo.append(","+conductor.getRut());
        archivo.append(","+Integer.toString(conductor.getGanancias()));
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
        
        File file2 = new File("Archivos/autos.csv");
        FileWriter aux2 = new FileWriter(file2, true);
        BufferedWriter archivo2 = new BufferedWriter(aux2);
        archivo2.append(conductor.getAuto().getMarca());
        archivo2.append(","+conductor.getAuto().getColor());
        archivo2.append(","+conductor.getAuto().getModelo());
        archivo2.append(","+conductor.getAuto().getPatente());
        archivo2.append(","+(Integer.toString(conductor.getAuto().getAñoFab())));
        archivo2.append(","+conductor.getRut());
        archivo2.append("\n");
        archivo2.flush();
        aux2.flush();
        archivo2.close();
        aux2.close();
    }
    
    /**
     * Metodo que agrega un pasajero a la base de datos de pasajeros.
     * @param pasajero Pasajero a agregar
     * @throws IOException 
     */
    public void agregarPasajero(PasajeroClase pasajero) throws IOException {
        
        File file = new File("Archivos/pasajeros.csv");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append(pasajero.getUsername());
        archivo.append(","+pasajero.getPassword());
        archivo.append(","+pasajero.getRut());
        archivo.append(",0000");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
    }

    /**
     * Metodo que retorna el numero de ciudades en la app.
     * @return Retorna el numero de ciudades en la app
     * @throws IOException 
     */
    int numeroDeCiudades() throws IOException {
        int acum=0;
        File archivo = new File("Archivos/ciudades.csv");
        
        try {    
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String lineString_original = "";
            while ((lineString_original = br.readLine()) != null) {
                acum=acum+1;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminClase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return acum;
    }
    @Override
    /**
     * [PLACEHOLDER]
     * @deprecated
     * @param mapaConductor
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void eliminarCuenta(HashMap<String, UsuarioClase> mapa) throws FileNotFoundException, IOException {
        System.out.println("Tu No Puedes eliminar Administradores");
    }
}
