package CodigoMain;

import java.util.ArrayList;

/**
 * Esta interfaz posee una serie de prototipos y atributos utilizados por metodos de otras clases.
 * @author Angel Morales
 * @version 1.0
 */
public interface Ubicable {
    String country = "Chile";
    public void fijarCoordenadas(ArrayList <String>coordenas,String city);
    public void moverse(ArrayList <String>coordenas);
    public String obtenerUbicacion();
}