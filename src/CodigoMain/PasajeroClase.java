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
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */

/**
 * Esta clase contiene los atributos y metodos de un pasajero y hereda de la clase usuario.
 * @author NSFW Team
 * @version 1.0
 * @see UsuarioClase
 */
class PasajeroClase extends UsuarioClase implements Ubicable{
    
    Tarjeta tarjeta;
    String ciudad;
    private ArrayList<String> coordenadas;
    public ConductorClase conductorPago;  

    /**
     * Metodo getter que retorna la ciudad de un pasajero.
     * @return Retorna la ciudad de un pasajero
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Metodo setter que especifica la ciudad de un pasajero.
     * @param ciudad Ciudad del pasajero
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    /**
     * Metodo constructor parametrizado. (Sin tarjeta)
     * @param username Nombre de usuario del pasajero
     * @param password Contraseña del pasajero
     * @param rut Rut del pasajero
     */
    public PasajeroClase(String username, String password, String rut) {
        super(username, password, rut);
        this.tarjeta = new Tarjeta(Integer.parseInt("0000"),Integer.parseInt("0000"),Long.parseLong("0000"));
    }   
    
    /**
     * Metodo constructor parametrizado que genera una tarjeta para el pasajero y la almacena en la base de datos.
     * @param username Nombre de usuario del pasajero
     * @param password Contraseña del pasajero
     * @param rut Rut del pasajero
     * @param num_tarjeta Numero de tarjeta del pasajero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public PasajeroClase(String username, String password, String rut, String num_tarjeta) throws FileNotFoundException, IOException {
    
        super(username, password, rut);
         
        String csvFile = "Archivos/tarjetas.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[0].equals(num_tarjeta)){
                this.tarjeta = new Tarjeta(Integer.parseInt(linea[2]),Integer.parseInt(linea[1]),Long.parseLong(linea[0]));
                break;
            }
        }
    }
    
    /**
     * Metodo que le permite a un pasajero pedir un taxi segun su conductor y lo registra en el log.txt de la app.
     * @param conductor Conductor del taxi pedido
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void pedirTaxi(ConductorClase conductor) throws FileNotFoundException, IOException{
        conductor.getAuto().tomarPasajero(this);
        String horaPeticion = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("PETICIÓN DE TAXI");
        archivo.append("\n"); 
        archivo.append("\n");
        archivo.append("Nombre del conductor: "+conductor.getUsername());
        archivo.append("\n");
        archivo.append("Rut del conductor: "+conductor.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Nombre del pasajero: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Rut del pasajero: "+this.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Hora de la petición: "+horaPeticion);
        archivo.append("\n");
        archivo.append("--------------------------------------");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
        System.out.println(conductor.getAuto().getCapacidad());
    }
    
    /**
     * [PLACEHOLDER]
     * Metodo que permite a los pasajeros calificar a los conductores.
     * @deprecated
     */
    public void calificar(){
        System.out.println("estamos trabajando en ello");
    }
    
    /**
     * Metodo setter que asigna una tarjeta a un pasajero.
     * @param tarjeta Tarjeta a asignar al pasajero
     */
    public void setTarjeta(Tarjeta tarjeta){
        this.tarjeta=tarjeta;
    }
    
    /**
     * Metodo que registra un cambio de nombre de pasajero en el log.txt de la app.
     * @param nombreNuevo Nombre nuevo del pasajero
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void logCambiarNombre(String nombreNuevo) throws FileNotFoundException, IOException{
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("CAMBIO DE NOMBRE DE PASAJERO:");
        archivo.append("Nombre antiguo: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Nombre actual: "+nombreNuevo);
        archivo.append("\n");
        archivo.append("Rut del pasajero: "+this.getRut());
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
     * Metodo que le permite a un pasajero pagarle con tarjeta a un conductor y lo registra en el log.txt de la app.
     * @param monto Monto a pagar del pasajero al conductor
     * @param claveTarjeta Clave de la tarjeta del pasajero
     * @param num_Tarjeta Numero de la tarjeta del pasajero
     * @param conductor Conductor al que se le pagara
     * @throws IOException 
     */
    public void pagar(int monto, int claveTarjeta, long num_Tarjeta,ConductorClase conductor) throws IOException{
        
        if(tarjeta.getNum_tarjeta() == 0000L){ //El usuario ingresa la clave de su tarjeta por pantalla y el monto disponible.
            
            int opcion=JOptionPane.showConfirmDialog(null,"Usted no posee una tarjeta asociada, ¿Desea agregar una?","Escoja una opcion" ,JOptionPane.YES_NO_OPTION);
            if(opcion!=-1){
                if(opcion==0){
                    int contraseñaNueva=0000; 
                    while(contraseñaNueva!=0000 && contraseñaNueva>1000 && contraseñaNueva<9999){
                        contraseñaNueva=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese una contraseña para su tarjeta (Solo 4 digitos):"));
                    }
                    int saldo = 10000;//Saldo de regalo
            //long num_tarjetaN = (long) random.nextLong() % 1000000000000000L;
                    long num_tarjetaN=1;
                    while(num_tarjetaN<1000000000000000L || num_tarjetaN>10000000000000000L){
                        num_tarjetaN = ThreadLocalRandom.current().nextLong(100000000000000000L);
                    }
            
                    this.tarjeta = new Tarjeta(saldo,claveTarjeta,num_tarjetaN);
                
                }else{
                    return;
                }   
            
            } 
            
        }else{
            if(claveTarjeta != this.tarjeta.getClaveTarjeta() || monto > this.tarjeta.getSaldo() ){
                JOptionPane.showConfirmDialog(null,"ERROR: Clave Incorrecta o Saldo Insuficiente");
                return;
            }
        }
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("REPORTE DE PAGO:");
        archivo.append("\n");
        archivo.append("Nombre Cliente: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Rut Cliente: "+this.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Ha pagado la suma de "+monto+" al conductor:");
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Nombre Conductor: "+conductor.getUsername());
        archivo.append("\n");
        archivo.append("Rut Conductor: "+conductor.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Hora de la transacción: "+hora);
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("--------------------------------------");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
        this.tarjeta.setSaldo(this.tarjeta.getSaldo() - monto);
        conductor.setGanancias(conductor.getGanancias() + monto);
        JOptionPane.showConfirmDialog(null, "El viaje fue pagado con exito!");
    }
    
    /**
     * Metodo que le permite a un pasajero pagarle en efectivo a un conductor y lo registra en el log.txt de la app.
     * @param monto Monto a pagar del pasajero al conductor
     * @param conductor Conductor al que se le pagara
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void pagar(int monto, ConductorClase conductor) throws FileNotFoundException, IOException{
        conductor.setGanancias(conductor.getGanancias()+monto);
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("REPORTE DE PAGO:");
        archivo.append("\n");
        archivo.append("Nombre Cliente: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Rut Cliente: "+this.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Ha pagado la suma de "+monto+" al conductor:");
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Nombre Conductor: "+conductor.getUsername());
        archivo.append("\n");
        archivo.append("Rut Conductor: "+conductor.getRut());
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("Hora de la transacción: "+hora);
        archivo.append("\n");
        archivo.append("\n");
        archivo.append("--------------------------------------");
        archivo.append("\n");
        archivo.flush();
        aux.flush();
        archivo.close();
        aux.close();
        JOptionPane.showConfirmDialog(null, "El viaje fue pagado con exito!");
        /*
        este metodo actualiza las ganancias del chofer, 
        luego de haber sido pagado en efectivo por parte
        del pasajero.
        */
    }
    
    /**
     * Reemplaza la tarjeta de un pasajero por una nueva y lo registra en la base de datos.
     * @param num_tarjeta Numero de la tarjeta a cambiar
     * @param contraseña Contraseña del pasajero propietario de la tarjeta
     * @param dinero Dinero contenido en la tarjeta
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void cambiarTarjeta(long num_tarjeta,int contraseña,int dinero) throws FileNotFoundException, IOException {
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/pasajeros_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/pasajeros.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[2].equals(this.getRut())){
                sb.append(linea[0]);
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(num_tarjeta);
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
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        
        //Eliminamos original
        File archivo= new File("Archivos/Pasajeros.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original = new PrintWriter(new File ("Archivos/pasajeros.csv"));
        StringBuilder sb_original = new StringBuilder();
        String csvFile_copia = "Archivos/pasajeros_AUX.csv";
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
            sb_original.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original.write(sb_original.toString());
        pw_original.close();
        
        //Eliminamos auxiliar
        File archivo_aux= new File("Archivos/pasajeros_AUX.csv");
        archivo_aux.delete();
        ////////////////////////////////////////////////////////////////////////////
        
        /////////////////////////////////////////////////////////////////////////////
        
        /////////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////////
        
        PrintWriter pw_tarjeta = new PrintWriter(new File ("Archivos/tarjetas_AUX.csv"));
        StringBuilder sb_tarjeta = new StringBuilder();
        String csvFile_tarjeta = "Archivos/tarjetas.csv";
        BufferedReader br_tarjeta = null;
        String lineString_tarjeta = "";
        String cvsSplitBy_tarjeta = ",";
        br_tarjeta = new BufferedReader(new FileReader(csvFile_tarjeta));
        
        Long n = this.tarjeta.getNum_tarjeta();
        String num_String = String.valueOf(n);
        
        while ((lineString_tarjeta = br_tarjeta.readLine()) != null) {
            String[] linea_tarjeta = lineString_tarjeta.split(cvsSplitBy_tarjeta);
            
            if(linea_tarjeta[0].equals(num_String)){
                sb_tarjeta.append(num_tarjeta);
                sb_tarjeta.append(",");
                sb_tarjeta.append(contraseña);
                sb_tarjeta.append(",");
                sb_tarjeta.append(dinero);
                sb_tarjeta.append("\n");
                
                System.out.println("Encontrado" + this.getUsername() + linea_tarjeta[0]);
            }
            else{
                sb_tarjeta.append(linea_tarjeta[0]);
                sb_tarjeta.append(",");
                sb_tarjeta.append(linea_tarjeta[1]);
                sb_tarjeta.append(",");
                sb_tarjeta.append(linea_tarjeta[2]);
                sb_tarjeta.append("\n");
            }
        }
        //Por si el usuario no tiene una tarjeta registrada
        if(this.tarjeta.getNum_tarjeta()<1){
            sb_tarjeta.append(num_tarjeta);
            sb_tarjeta.append(",");
            sb_tarjeta.append(contraseña);
            sb_tarjeta.append(",");
            sb_tarjeta.append(dinero);
            sb_tarjeta.append("\n");
        }
        
        pw_tarjeta.write(sb_tarjeta.toString());
        pw_tarjeta.close();
        //Eliminamos original
        File archivo_tarjeta = new File("Archivos/tarjetas.csv");
        archivo_tarjeta.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original_tarjeta = new PrintWriter(new File ("Archivos/tarjetas.csv"));
        StringBuilder sb_original_tarjeta = new StringBuilder();
        String csvFile_copia_tarjeta = "Archivos/tarjetas_AUX.csv";
        BufferedReader br_copia_tarjeta = null;
        String lineString_original_tarjeta = "";
        br_copia_tarjeta = new BufferedReader(new FileReader(csvFile_copia_tarjeta));
        
        while ((lineString_original_tarjeta = br_copia_tarjeta.readLine()) != null) {
            String[] linea_tarjeta = lineString_original_tarjeta.split(cvsSplitBy_tarjeta);
            sb_original_tarjeta.append(linea_tarjeta[0]);
            sb_original_tarjeta.append(",");
            sb_original_tarjeta.append(linea_tarjeta[1]);
            sb_original_tarjeta.append(",");
            sb_original_tarjeta.append(linea_tarjeta[2]);
            sb_original_tarjeta.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original_tarjeta.write(sb_original_tarjeta.toString());
        pw_original_tarjeta.close();
        
        //Eliminamos auxiliar
        File archivo_aux_tarjeta = new File("Archivos/tarjetas_AUX.csv");
        archivo_aux_tarjeta.delete();
    }
    
    /**
     * Metodo que le permite a un pasajero cambiar su contraseña en la base de datos de pasajeros.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void cambiarContraseña() throws FileNotFoundException, IOException {
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/pasajeros_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/pasajeros.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[2].equals(this.getRut())){
                sb.append(linea[0]);
                sb.append(",");
                sb.append(this.getPassword());
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
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
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/Pasajeros.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original = new PrintWriter(new File ("Archivos/pasajeros.csv"));
        StringBuilder sb_original = new StringBuilder();
        String csvFile_copia = "Archivos/pasajeros_AUX.csv";
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
            sb_original.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original.write(sb_original.toString());
        pw_original.close();
        
        //Eliminamos auxiliar
        File archivo_aux= new File("Archivos/pasajeros_AUX.csv");
        archivo_aux.delete();
    }
    
    /**
     * Metodo que registra una eliminacion de cuenta de pasajero en el log.txt de la app.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void logEliminarCuenta() throws FileNotFoundException, IOException{
        String hora = LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute();
        File file = new File("Archivos/LOG.txt");
        FileWriter aux = new FileWriter(file, true);
        BufferedWriter archivo = new BufferedWriter(aux);
        archivo.append("ELIMINACIÓN DE CUENTA DE PASAJERO:");
        archivo.append("\n");
        archivo.append("Nombre del pasajero: "+this.getUsername());
        archivo.append("\n");
        archivo.append("Rut del pasajero: "+this.getRut());
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
     * Metodo que le permite a un pasajero cambiarse el nombre en la base de datos de pasajeros.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    void cambiarNombre() throws FileNotFoundException, IOException {
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/pasajeros_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/pasajeros.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[2].equals(this.getRut())){
                sb.append(this.getUsername());
                sb.append(",");
                sb.append(linea[1]);
                sb.append(",");
                sb.append(linea[2]);
                sb.append(",");
                sb.append(linea[3]);
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
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/Pasajeros.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original = new PrintWriter(new File ("Archivos/pasajeros.csv"));
        StringBuilder sb_original = new StringBuilder();
        String csvFile_copia = "Archivos/pasajeros_AUX.csv";
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
            sb_original.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original.write(sb_original.toString());
        pw_original.close();
        
        //Eliminamos auxiliar
        File archivo_aux= new File("Archivos/pasajeros_AUX.csv");
        archivo_aux.delete();
    }
    @Override
    /**
     * Metodo que permite a un pasajero eliminar su cuenta de la base de datos de pasajeros.
     * @param mapaPasajeros Mapa que contiene a todos los pasajeros
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void eliminarCuenta(HashMap<String, UsuarioClase> mapaPasajeros) throws FileNotFoundException, IOException {
        mapaPasajeros.remove(this);
        
        //borrar en el archivo

        PrintWriter pw = new PrintWriter(new File ("Archivos/pasajeros_AUX.csv"));
        StringBuilder sb = new StringBuilder();
        String csvFile = "Archivos/pasajeros.csv";
        BufferedReader br = null;
        String lineString = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(csvFile));
        while ((lineString = br.readLine()) != null) {
            String[] linea = lineString.split(cvsSplitBy);
            if(linea[2].equals(this.getRut())){
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
                sb.append("\n");
            }
        }
        pw.write(sb.toString());
        pw.close();
        //Eliminamos original
        File archivo= new File("Archivos/Pasajeros.csv");
        archivo.delete();
        
        //Creamos nuevamente el archivo original
        PrintWriter pw_original = new PrintWriter(new File ("Archivos/pasajeros.csv"));
        StringBuilder sb_original = new StringBuilder();
        String csvFile_copia = "Archivos/pasajeros_AUX.csv";
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
            sb_original.append("\n");
        }
        //Escribimos sobre archivo original
        pw_original.write(sb_original.toString());
        pw_original.close();
        
        //Eliminamos auxiliar
        File archivo_aux= new File("Archivos/pasajeros_AUX.csv");
        archivo_aux.delete();
    }
    @Override
    /**
     * Metodo que le asigna una ciudad a un pasajero.
     * @param coordenas Coordenadas de la ciudad dentro del .csv
     * @param city Nombre de la ciudad
     */
    public void fijarCoordenadas(ArrayList <String> coordenadas,String city){
       this.ciudad=city;
       this.coordenadas=coordenadas;
    }
    @Override
    /**
     * Metodo que fija unas nuevas coordenadas del pasajero.
     * @param coordenas Coordenadas nuevas del pasajero
     */
    public void moverse(ArrayList<String> coordenas) {
        //Ingresan las coordenadas de un pasajero, el conductor se mueve hacia el
        this.coordenadas=coordenadas;
    }
    @Override
    /**
     * Metodo que retorna la ciudad en la que se encuentra el conductor.
     * @return Nombre de la ciudad en la que se encuentra el conductor
     */
    public String obtenerUbicacion() {
        String s=this.coordenadas.get(0)+ " " +this.coordenadas.get(1) + " "+this.ciudad;
        return s;
    }
}
