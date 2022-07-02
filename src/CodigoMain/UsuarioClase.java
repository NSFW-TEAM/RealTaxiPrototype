package CodigoMain;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

/**
 * Esta clase abstracta contiene los atributos y metodos de un usuario.
 * @author NSFW TEAM
 * @version 1.0
 */
public abstract class UsuarioClase{
    
    private String username;
    private String password;
    private String rut;
    private boolean enEspera=false;
    private boolean enViaje=false;
    
    /**
     * Metodo abstracto que permite a un usuario eliminar su cuenta.
     * @param mapaConductor Mapa de conductores
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public abstract void eliminarCuenta(HashMap<String, UsuarioClase> mapaConductor) throws FileNotFoundException, IOException;
    
    /**
     * Metodo getter que retorna el nombre del usuario.
     * @return Retorna el nombre del usuario
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * Metodo getter que retorna el rut del usuario.
     * @return Retorna el rut del usuario
     */
    public String getRut() {
        return rut;
    }

    /**
     * Metodo getter que retorna la contraseña del usuario.
     * @return Retorna la contraseña del usuario
     */
    public String getPassword(){
        return password;
    }

    /**
     * Metodo setter que especifica el nombre del usuario.
     * @param username El nombre del usuario
     */
    public void setUserName(String username) {
        this.username = username;
    }

    /**
     * Metodo setter que especifica la contraseña de un usuario.
     * @param password La contraseña del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Metodo setter que especifica el rut del usuario.
     * @param rut El rut del usuario
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Metodo que retorna TRUE o FALSE segun el estado de espera del usuario.
     * @return Retorna TRUE si el usuario esta en espera y FALSE si no
     */
    public boolean isEnEspera() {
        return enEspera;
    }

    /**
     * Metodo que declara a un usuario como en espera.
     * @param enEspera Estado de espera del usuario
     */
    public void setEnEspera(boolean enEspera) {
        this.enEspera = enEspera;
    }

    /**
     * Metodo que retorna TRUE o FALSE segun si el usuario se encuentra en viaje o no.
     * @return  Retorna TRUE si el usuario se encuentra en viaje y FALSE si no
     */
    public boolean isEnViaje() {
        return enViaje;
    }

    /**
     * Metodo que declara si un usuario se encuentra en viaje.
     * @param enViaje Estado de viaje del usuario
     */
    public void setEnViaje(boolean enViaje) {
        this.enViaje = enViaje;
    }    

    /**
     * Metodo constructor parametrizado.
     * @param username Nombre del usuario
     * @param password Contraseña del usuario
     * @param rut Rut del usuario
     */
    public UsuarioClase(String username,String password,String rut) {
        this.username = username;
        this.password = password;
        this.rut = rut;
    }
    
    //public abstract void buscar();
      
}










