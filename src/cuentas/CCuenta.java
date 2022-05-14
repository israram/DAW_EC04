package cuentas;

/**
 * *@author Israel David Ramos Caldera
 * clase CCuenta en la que estaran los metodos y los parametros para crear y usar una cuenta bancaria
 * una excepción
 */



public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * @param nom le da un valor al atributo nombre
     * @param cue le da un valor al atributo cuenta
     * @param sal le da un valor al atributo saldo
     * @param tipo le da un valor a tipoInteres en caso de que se llegar a a implementar en el constructor
     */

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @param cantidad se mete la cantidad que se quiere ingresar al parámetro saldo
     * @throws Exception para no ingresar cantidades negativas
     */

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     *
     * @param cantidad se mete la cantidad que se quiere retirar al parámetro saldo
     * @throws Exception para no retirar cantidades negativas o mayores que el saldo actual
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * @return nos devuelve el atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre para introducir el atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return nos devuelve el atributo cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta le da un valor al atributo cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return nos devuelve el atributo saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo le da un valor al atributo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return nos devuelve el atributo tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés le da un valor a tipoInteres
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}