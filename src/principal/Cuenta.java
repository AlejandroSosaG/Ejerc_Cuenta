package principal;

import java.util.Scanner;

public class Cuenta {

    String nombre, número;
    double tipo, saldo;

    /**
     * constructor vacío
     */
    public Cuenta(){

    }

    /**
     * constructor con parámetros
     * @param nombre
     * @param número
     * @param tipo
     * @param saldo
     */
    public Cuenta(String nombre, String número, double tipo, double saldo) {
        this.nombre = nombre;
        this.número = número;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    /**
     * constructor copia
     * @param cuenta
     */
    public Cuenta(Cuenta cuenta) {
        this.nombre = cuenta.nombre;
        this.número = cuenta.número;
        this.tipo = cuenta.tipo;
        this.saldo = cuenta.saldo;
    }

    /**
     * precondición: el valor de aum ha de ser un entero
     * @param aum
     * @return un booleano que indica si se ha podido realizar el ingreso o no
     */

    public boolean ingreso(int aum) {
        boolean validacion=false;
            if (aum < 0) {
                System.out.println("No se puede hacer un ingreso de un valor negativo");
            } else {
                this.saldo += aum;
                validacion = true;
            }
            return validacion;

    }

    /**
     * precondicion: el parámetro cant ha de ser un valor entero
     * @param cant
     * @return un booleano que indica si se ha podido realizar el reintegro o no
     */

    public boolean reintegro(int cant) {
        boolean validacion=false;

            if (cant<0){
                System.out.println("El importe del reintegro no puede ser negativo");
            }else if (saldo-cant<0){
                System.out.println("No hay tanto dinero en la cuenta");
            }else{
                this.saldo-=cant;
                validacion=true;
            }

            return validacion;
        }

    /**
     * Este método ingresa un cantidad desde una cuenta a otra. Valida que la cuenta origen tiene
     * suficiente saldo para realizar la transferencia
     * precondiciones: el importe ha de ser entero
     * @param cuentaDestino
     * @param importe
     */
    public void transferencia(Cuenta cuentaDestino, double importe){

            if (importe<0){
                System.out.println("el importe a transferir debe ser un número positivo");
            }else if (this.saldo-importe<0){
                System.out.println("La cuenta origen no tiene tanto saldo");
            }else {
                this.saldo -= importe;
                cuentaDestino.saldo +=importe;
            }
        }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
