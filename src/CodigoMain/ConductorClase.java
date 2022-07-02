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
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Francisco
 */

/**
 * Esta clase contiene los atributos y metodos de un conductor y hereda de la clase usuario.
 * @author NSFW Team
 * @version 1.0
 * @see UsuarioClase
 */


class ConductorClase extends UsuarioClase implements Ubicable{
    
    private float calificación;
    private int ganancias;
    private AutoClase auto;
    private String ciudad;
    private ArrayList<String> coordenadas;
    
    /**
     * Metodo setter que especifica la calificacion de un conductor
     * @param calificación Calificacion del conductor
     */
    public void setCalificación(float calificación) {
        this.calificación = calificación;
    }

    /**
     * Metodo setter que especifica las ganancias de un conductor
     * @param ganancias Ganancias del conductor
     */
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
    
    /**
     * Metodo getter que retorna la calificacion de un conductor
     * @return Retorna la calificacion de un conductor
     */
    public float getCalificación() {
        return calificación;
    }

    /**
     * Metodo getter que retorna las ganancias de un conductor.
     * @return Retorna las ganancias de un conductor
     */
    public int getGanancias() {
        return ganancias;
    }

    /**
     * Metodo getter que retorna el auto del conductor.
     * @return Retorna el auto del conductor
     */
    public AutoClase getAuto() {
        return auto;
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param calificación Calificacion del conductor
     * @param auto Auto del conductor
     * @param username Nombre de usuario del conductor
     * @param password Contraseña del conductor
     * @param rut Rut del conductor
     * @param ganancias Ganancias del conductor
     */
    public ConductorClase(float calificación, AutoClase auto, String username, String password, String rut, int ganancias) {
        super(username, password, rut);
        this.calificación = calificación;
        this.auto = auto;
        this.ganancias = ganancias;
        this.coordenadas=null;
    }
    
    /**
     * Metodo que retorna la capacidad del auto del conductor luego de haber tomado un pasajero.
     * @param pasajeros La cantidad de pasajeros en el auto del conductor
     * @return Retorna la capacidad del auto del conductor luego de haber tomado un pasajero
     */
    public int viaje(int pasajeros){
       return this.auto.getCapacidad()-pasajeros;
    }
    
    /**
     * Metodo que retorna si el conductor se encuentra en viaje.
     * @param enViaje Booleano que indica si el conductor se encuentra en viaje
     * @return Retorna TRUE o FALSE segun si el conductor se encuentra en un viaje
     */
    public String viaje(String enViaje){
        return enViaje;
    }
    
    /**
     * Metodo que confirma un viaje exitoso y deja a un pasajero en su destino
     * @param pasajero Pasajero que llego a su destino
     */
    public void confirmarViajeExitoso(PasajeroClase pasajero){
        this.auto.dejarPasajero(pasajero);
    }
    
    /*
    public void cambiarDeRuta(adminClase admin){
        admin.solicitudDeCambio(this);
    }
    */

    /**
     * Metodo setter que asigna un auto a un conductor.
     * @param auto Auto a asignar al conductor
     */
    void setAuto(AutoClase auto) {
        this.auto=auto;
    }
    
    /**
     * Metodo que elimina un auto de la app y de la base de datos de autos.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void eliminarAuto() throws FileNotFoundException, IOException {
        this.auto=null;
        PrintWriter pw = new PrintWriter(new File ("Archivos/autos_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/autos.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[5].equals(this.getRut())){
                System.out.println("encontrado");
            }
            else{
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append(",");
                sb.append(linea[5]);
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/autos.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pwOriginal = new PrintWriter(new File ("Archivos/autos.csv"));
        StringBuilder sbOriginal = new StringBuilder();
        String csvFileCopia = "Archivos/autos_AUX.csv";
        BufferedReader brCopia = null;
        String lineStringOriginal = "";
        brCopia = new BufferedReader(new FileReader(csvFileCopia));
        
        while ((lineStringOriginal = brCopia.readLine()) != null) {
            String[] linea = lineStringOriginal.split(cvsSplitBy);
            sbOriginal.append(linea[0]);
            sbOriginal.append(",");
            sbOriginal.append(linea[1]);
            sbOriginal.append(",");
            sbOriginal.append(linea[2]);
            sbOriginal.append(",");
            sbOriginal.append(linea[3]);
            sbOriginal.append(",");
            sbOriginal.append(linea[4]);
            sbOriginal.append(",");
            sbOriginal.append(linea[5]);
            sbOriginal.append("\n");
        }
        //Escribimos sobre archivo original
        pwOriginal.write(sbOriginal.toString());
        pwOriginal.close();
        
        //Eliminamos auxiliar
        File archivoAux= new File("Archivos/autos_AUX.csv");
        archivoAux.delete();
    }
    @Override
    /**
     * Metodo que elimina una cuenta de conductor de la app y la base de datos de conductores.
     * @param mapaConductor Mapa de conductores del que se eliminara el conductor
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void eliminarCuenta(HashMap<String, UsuarioClase> mapaConductor) throws FileNotFoundException, IOException {
        
        mapaConductor.remove(this);
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/choferes_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/choferes.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[3].equals(this.getRut())){
                System.out.println("encontrado");
            }
            else{
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/choferes.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pwOriginal = new PrintWriter(new File ("Archivos/choferes.csv"));
        StringBuilder sbOriginal = new StringBuilder();
        String csvFileCopia = "Archivos/choferes_AUX.csv";
        BufferedReader brCopia = null;
        String lineStringOriginal = "";
        brCopia = new BufferedReader(new FileReader(csvFileCopia));
        
        while ((lineStringOriginal = brCopia.readLine()) != null) {
            String[] linea = lineStringOriginal.split(cvsSplitBy);
            sbOriginal.append(linea[0]);
            sbOriginal.append(",");
            sbOriginal.append(linea[1]);
            sbOriginal.append(",");
            sbOriginal.append(linea[2]);
            sbOriginal.append(",");
            sbOriginal.append(linea[3]);
            sbOriginal.append(",");
            sbOriginal.append(linea[4]);
            sbOriginal.append("\n");
        }
        //Escribimos sobre archivo original
        pwOriginal.write(sbOriginal.toString());
        pwOriginal.close();
        
        //Eliminamos auxiliar
        File archivoAux= new File("Archivos/choferes_AUX.csv");
        archivoAux.delete();
    }
    
    /**
     * Metodo que cambia la contraseña de un conductor en la base de datos de conductores.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void cambiarContraseña() throws FileNotFoundException, IOException {
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/choferes_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/choferes.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[3].equals(this.getRut())){
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(this.getPassword());
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append("\n");
            }
            else{
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/choferes.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pwOriginal = new PrintWriter(new File ("Archivos/choferes.csv"));
        StringBuilder sbOriginal = new StringBuilder();
        String csvFileCopia = "Archivos/choferes_AUX.csv";
        BufferedReader brCopia = null;
        String lineStringOriginal = "";
        brCopia = new BufferedReader(new FileReader(csvFileCopia));
        
        while ((lineStringOriginal = brCopia.readLine()) != null) {
            String[] linea = lineStringOriginal.split(cvsSplitBy);
            sbOriginal.append(linea[0]);
            sbOriginal.append(",");
            sbOriginal.append(linea[1]);
            sbOriginal.append(",");
            sbOriginal.append(linea[2]);
            sbOriginal.append(",");
            sbOriginal.append(linea[3]);
            sbOriginal.append(",");
            sbOriginal.append(linea[4]);
            sbOriginal.append("\n");
        }
        //Escribimos sobre archivo original
        pwOriginal.write(sbOriginal.toString());
        pwOriginal.close();
        
        //Eliminamos auxiliar
        File archivoAux= new File("Archivos/choferes_AUX.csv");
        archivoAux.delete();
}
    
    /**
     * Metodo que registra un cambio de nombre de un conductor en el log.txt de la app.
     * @param nombreNuevo Nombre nuevo del conductor
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void logCambiarNombre(String nombreNuevo) throws FileNotFoundException, IOException{
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("CAMBIO DE NOMBRE DE CONDUCTOR:");
        archivo.append("Nombre antiguo: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Nombre actual: "+nombreNuevo);
        archivo.append("\n");
        archivo.append("Rut del conductor: "+this.getRut());
        archivo.append("\n");
        archivo.append("Hora del cambio: "+hora);
        archivo.append("\n");
        archivo.append("--------------------------------------");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
    }
    
    /**
     * Metodo que registra una eliminacion de cuenta de conductor en el log.txt de la app.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void logEliminarCuenta() throws FileNotFoundException, IOException{
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("ELIMINACIÓN DE CUENTA DE CONDUCTOR Y AUTO ASOCIADO:");
        archivo.append("Nombre del conductor: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Rut del conductor: "+this.getRut());
        archivo.append("\n");
        archivo.append("Auto: "+this.getAuto().getMarca()+" "+this.getAuto().getModelo());
        archivo.append("\n");
        archivo.append("Hora de la eliminación: "+hora);
        archivo.append("\n");
        archivo.append("--------------------------------------");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
    }
    
    /**
     * Metodo que cambia del nombre de un conductor en la base de datos de conductores.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void cambiarNombre() throws FileNotFoundException, IOException {
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File("Archivos/choferes_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/choferes.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[3].equals(this.getRut())){
                sb.append(linea[0]);
                sb.append(",");
                sb.append(this.getUsername());
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append("\n");
            }
            else{
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
                sb.append(",");
                sb.append(linea[4]);
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/choferes.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original = new PrintWriter(new File ("Archivos/choferes.csv"));
        StringBuilder sb_original = new StringBuilder();
        String csvFile_copia = "Archivos/choferes_AUX.csv";
        BufferedReader br_copia = null;
        String lineString_original = "";
        br_copia = new BufferedReader(new FileReader(csvFile_copia));
        
        while ((lineString_original = br_copia.readLine()) != null) {
            String[] linea = lineString_original.split(cvsSplitBy);
            sb_original.append(linea[0]);
            sb_original.append(",");
            sb_original.append(linea[1]);
            sb_original.append(",");
            sb_original.append(linea[2]);
            sb_original.append(",");
            sb_original.append(linea[3]);
            sb_original.append(",");
            sb_original.append(linea[4]);
            sb_original.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original.write(sb_original.toString());
        pw_original.close();
        
        //Eliminamos auxiliar
        File archivo_aux= new File("Archivos/choferes_AUX.csv");
        archivo_aux.delete();
    }
    @Override
    /**
     * Metodo que le asigna una ciudad a un conductor.
     * @param coordenas Coordenadas de la ciudad dentro del .csv
     * @param city Nombre de la ciudad
     */
    public void fijarCoordenadas(ArrayList<String> coordenas, String city) {
        this.ciudad=city;
    }
    @Override
    /**
     * Metodo que fija unas nuevas coordenadas del conductor.
     * @param coordenas Coordenadas nuevas del conductor
     */
    public void moverse(ArrayList<String> coordenas) {
        this.coordenadas = coordenadas;
    }
    @Override
    /**
     * Metodo que retorna la ciudad en la que se encuentra el conductor.
     * @return Nombre de la ciudad en la que se encuentra el conductor
     */
    public String obtenerUbicacion() {
        return this.ciudad;
    }
    
}
