package CodigoMain;

/**
 * Esta clase contiene los atributos y metodos de una tarjeta.
 * @author Francisco Leiva
 * @version 1.0
 */
public class tarjetaClase {
    
    private int clave;
    private int monto;

    /**
     * Metodo constructor parametrizado.
     * @param clave Clave de la tarjeta
     * @param monto Monto contenido en la tarjeta
     */
    public tarjetaClase(int clave, int monto) {
        this.clave = clave;
        this.monto = monto;
    }

    /**
     * Metodo getter que retorna la clave de la tarjeta.
     * @return Retorna la clave de una tarjeta
     */
    public int getClave() {
        return clave;
    }

    /**
     * Metodo setter que especifica la clave de una tarjeta.
     * @param clave Clave de la tarjeta
     */
    public void setClave(int clave) {
        this.clave = clave;
    }

    /**
     * Metodo getter que retorna el monto contenido en la tarjeta.
     * @return Retorna el monto contenido en la tarjeta
     */
    public int getMonto() {
        return monto;
    }

    /**
     * [PLACEHOLDER]
     * Metodo setter que especifica el monto de la tarjeta.
     * @param monto Monto especificado de la tarjeta
     * @deprecated
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }     
            
}
