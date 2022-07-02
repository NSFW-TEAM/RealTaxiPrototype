package CodigoMain;

import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
  
/**
 * La clase Main
 * @author NSFW TEAM
 * @version 1.0
 */
public class Main {
    /**
     * Metodo constructor por defecto de Main
     * @param args Parametro por defecto del metodo main
     * @throws IOException Excepcion por defecto del metodo main
     */
    public static void main(String[] args) throws IOException{
        
        ArrayList <HashMap> listaColecciones= new ArrayList<HashMap>();
        HashMap<String, PasajeroClase> mapaPasajeros = new HashMap<String, PasajeroClase>();
        HashMap<String, ConductorClase> mapaConductores = new HashMap<String, ConductorClase>();
        HashMap<String, AdminClase> mapaAdmin = new HashMap<String, AdminClase>();
        File file = new File("Archivos/pasajeros.csv");
        File file2 = new File("Archivos/choferes.csv");
        File file3 = new File("Archivos/autos.csv");
        File file4 = new File("Archivos/admins.csv");
        BufferedReader lector = new BufferedReader(new FileReader(file));
        BufferedReader lector2 = new BufferedReader(new FileReader(file2));
        BufferedReader lector3 = new BufferedReader(new FileReader(file3));
        BufferedReader lector4 = new BufferedReader(new FileReader(file4));
        String row;
        String row2;
        String row3;
        String row4;
        String dato[]= new String[3];
        String dato2[]= new String[5];
        String dato3[]= new String[6];
        String dato4[]= new String[4];
        
        while((row3 = lector3.readLine())!= null && (row2=lector2.readLine())!=null){
            dato3=row3.split(",");
            dato2=row2.split(",");
            AutoClase auto= new AutoClase(dato3[0],dato3[1],dato3[2],dato3[3],Integer.parseInt(dato3[4]));
            if(dato2[3].equals(dato3[5])){
                    ConductorClase conductor= new ConductorClase(Float.parseFloat(dato2[0]),auto,dato2[1],dato2[2],dato2[3],Integer.parseInt(dato2[4]));
                    mapaConductores.put(conductor.getRut(), conductor);
                }
        }
        
        while((row = lector.readLine())!= null){
            dato = row.split(",");
            int random=(int) (Math.random()*3);
            String ciudad="";
            if(random==0)ciudad="San Antonio";
            if(random==1)ciudad="Villa Alemana";
            if(random==2)ciudad="San Antonio";
            if (dato[3].equals("0000")){
                PasajeroClase user = new PasajeroClase(dato[0],dato[1],dato[2]);
                user.setCiudad(ciudad);
                mapaPasajeros.put(user.getRut(), user);
            }else{
                PasajeroClase user = new PasajeroClase(dato[0],dato[1],dato[2],dato[3]);
                user.setCiudad(ciudad);
                mapaPasajeros.put(user.getRut(), user);
            }
            
            
        }
        
        while((row4 = lector4.readLine())!= null){
            dato4 = row4.split(",");
            AdminClase admin = new AdminClase(dato4[0],dato4[1],dato4[3]);
            mapaAdmin.put(admin.getRut(), admin);
                        
        }
        
        listaColecciones.add(mapaAdmin);
        listaColecciones.add(mapaConductores);
        listaColecciones.add(mapaPasajeros);
        
        ///Prueba de sistema de pago///
        /*
        ConductorClase pruebaChofer=(ConductorClase)listaColecciones.get(1).get("205421432"); //Se le asigna los datos de un chofer que se encuentra en el archivo.
        PasajeroClase pruebaPasajero= (PasajeroClase)listaColecciones.get(2).get("20673437k");//Se le asigna los datos de un pasajero que se encuentra en el archivo.
        pruebaPasajero.setClaveTarjeta(1234); //Se le asigna una clave a la tarjeta del pasajero
        pruebaPasajero.setSaldo(202500);//Se le asigna un saldo a la tarjeta del pasajero
        //NOTA: Se prueba de esta manera, porque estamos trabajando en la interfaz grafica.
        System.out.println("Saldo de la tarjeta del pasajero antes de pagar:"+pruebaPasajero.getSaldo()); //Se muestra el saldo del pasajero antes de pagar.
        System.out.println("Ganancia del chofer antes de ser pagado:"+pruebaChofer.getGanancias());//Se imprime la ganacia del chofer antes de ser pagado.
        pruebaPasajero.pagar(2500, pruebaChofer, 1234); //Se usa el metodo pagar mediante tarjeta de credito.
        System.out.println("Saldo de la tarjeta del pasajero despues de pagar:"+pruebaPasajero.getSaldo());
        System.out.println("Ganancia del chofer despues de ser pagado:"+pruebaChofer.getGanancias());//Se imprime la ganancia del chofer luego de ser pagado
        //////////////////////////////
        */
        
        AdminClase admin = new AdminClase("Angel Admin","1234","20673437k");
        //admin.mostrarConductores(mapaConductores);
        
        //Mapas con las diferentes rutas disponibles
        HashMap<String, Ruta> mapaCiudad1 = new HashMap<String, Ruta>();
        HashMap<String, Ruta> mapaCiudad2 = new HashMap<String, Ruta>();
        HashMap<String, Ruta> mapaCiudad3 = new HashMap<String, Ruta>();
        
        int numCiudades = admin.numeroDeCiudades();
        
        for(int i=0;i<1;i++){
            File archivo = new File("Archivos/rutas.csv");
            try {    
                BufferedReader br = new BufferedReader(new FileReader(archivo));
                String lineString = "";
                while ((lineString = br.readLine()) != null) {
                    String[] linea = lineString.split(",");
                    Ruta ruta = new Ruta(linea[1]);
                    System.out.println(ruta.NombreDeRuta());
                    ArrayList<String> coordenadas=new ArrayList<String>();
                    for(int j=2;j<linea.length;j++){
                        
                        coordenadas.add(linea[j]);
                        System.out.println(coordenadas.get(j-2));
                    }
                    
                    if(linea[0].equals("San Antonio")){
                        ruta.fijarCoordenadas(coordenadas,"San Antonio");
                        System.out.println(ruta.obtenerUbicacion());
                        mapaCiudad1.put(ruta.NombreDeRuta(), ruta);
                    }
                    else if(linea[0].equals("Villa Alemana")){
                        ruta.fijarCoordenadas(coordenadas,"Villa Alemana");
                        System.out.println(ruta.obtenerUbicacion());
                        mapaCiudad2.put(ruta.NombreDeRuta(), ruta);
                    }
                    else if(linea[0].equals("Putaendo")){
                        ruta.fijarCoordenadas(coordenadas,"Putaendo");
                        System.out.println(ruta.obtenerUbicacion());
                        mapaCiudad3.put(ruta.NombreDeRuta(),ruta);
                    }
                    
                    //System.out.println(ruta.NombreDeRuta());
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminClase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Set<String> keys = mapaConductores.keySet();//String que acumula las llaves de todos los choferes
        Object[] arreglo = keys.toArray();//Arreglo para recorrer las diferentes llaves 
        int randomRuta=0;
        Ruta ruta;
        for(int i=0;i<keys.size();i++){
            int random = (int) (Math.random() * numCiudades)+1;
            ConductorClase conductor = mapaConductores.get(arreglo[i]);
            //Se direcciona hacia una ciudad random
            
            if(random == 1){
                randomRuta=(int) (Math.random()*mapaCiudad1.size());
                //System.out.println(randomRuta);
                Set<String> keyCity = mapaCiudad1.keySet();
                Object[] k = keyCity.toArray();
                ruta = mapaCiudad1.get(k[randomRuta]);
                ruta.personasOnRute.put(conductor.getRut(), conductor);
                conductor.fijarCoordenadas(null,"San Antonio");
                //mapaRuta1.put(conductor.getRut(), conductor);
            }
            if(random == 2){
                randomRuta=(int) (Math.random()*mapaCiudad2.size());
                //System.out.println(randomRuta);
                Set<String> keyCity = mapaCiudad2.keySet();
                Object[] k = keyCity.toArray();
                
                ruta = mapaCiudad2.get(k[randomRuta]);
                ruta.personasOnRute.put(conductor.getRut(), conductor);
                conductor.fijarCoordenadas(null,"Villa Alemana");
                //mapaRuta2.put(conductor.getRut(), conductor);
            } 
            if(random == 3){
                randomRuta=(int) (Math.random()*mapaCiudad3.size());
                //System.out.println(randomRuta);
                Set<String> keyCity = mapaCiudad3.keySet();
                Object[] k = keyCity.toArray();
                
                ruta = mapaCiudad3.get(k[randomRuta]);
                ruta.personasOnRute.put(conductor.getRut(), conductor);
                conductor.fijarCoordenadas(null,"Putaendo");
                //mapaRuta3.put(conductor.getRut(), conductor);
            }
            
            System.out.println(conductor.getUsername()+" Asignado a Ciudad"+random+" En la ruta "+randomRuta);
        };
        
        ArrayList <HashMap> listaCiudades= new ArrayList<HashMap>();
        
        listaCiudades.add(mapaCiudad1);
        listaCiudades.add(mapaCiudad2);
        listaCiudades.add(mapaCiudad3);
        pantallaPrincipal ventana;
        ventana = new pantallaPrincipal(listaColecciones, listaCiudades);
        ventana.setVisible(true);
        /*
        if (true){
            //Register
            ventana1 ventana = new ventana1();
            ventana.setVisible(true);
        }
        else{
            //Aplicacion como tal
            App app = new App();
            app.setVisible(true);
        }
       */
    }
}