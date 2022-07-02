/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoMain;

/**
 *
 * @author Francisco
 */
/**
 * Esta clase contiene los atributos y metodos de una tarjeta. (De manera local)
 * @author NSFW Team
 * @version 1.0
 */
class Tarjeta{
    
    private int saldo;
    private int claveTarjeta;
    private long num_tarjeta;

    /**
     * Metodo getter que retorna el saldo de una tarjeta.
     * @return Retorna el saldo de una tarjeta
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Metodo setter que especifica el saldo de una tarjeta.
     * @param saldo Saldo de la tarjeta
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo getter que retorna la clave de una tarjeta.
     * @return Retorna la clave de una tarjeta
     */
    public int getClaveTarjeta() {
        return claveTarjeta;
    }

    /**
     * Metodo setter que especifica la clave de una tarjeta.
     * @param claveTarjeta Clave de la tarjeta
     */
    public void setClaveTarjeta(int claveTarjeta) {
        this.claveTarjeta = claveTarjeta;
    }

    /**
     * Metodo getter que retorna el numero de la tarjeta.
     * @return Retorna el numero de la tarjeta
     */
    public long getNum_tarjeta() {
        return num_tarjeta;
    }

    /**
     * Metodo setter que especifica el numero de la tarjeta.
     * @param num_tarjeta Numero de la tarjeta
     */
    public void setNum_tarjeta(long num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }
    
    /**
     * Metodo constructor parametrizado.
     * @param saldo Saldo de la tarjeta
     * @param claveTarjeta Clave de la tarjeta
     * @param num_tarjeta Numero de la tarjeta
     */
    public Tarjeta(int saldo,int claveTarjeta,long num_tarjeta){
        this.saldo=saldo;
        this.claveTarjeta=claveTarjeta;
        this.num_tarjeta=num_tarjeta;
    }
}
