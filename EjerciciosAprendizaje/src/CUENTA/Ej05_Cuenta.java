/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CUENTA;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author carol
 */
public class Ej05_Cuenta {
    
    private int numCuenta;
    private long DNI;
    private int saldoActual;

    public Ej05_Cuenta() {
    }

    public Ej05_Cuenta(int numCuenta, long DNI, int saldoActual) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Datos de la cuenta{" + "Numero de Cuenta=" + numCuenta + ", DNI= " + DNI + ", Saldo Actual=" + saldoActual + '}';
    }
    
    
}



//public class Cuenta {
//    
//    
//
//    public Cuenta() {
//    }
//
//    public int getNumCuenta() {
//        return numCuenta;
//    }
//
//    public long getDNI() {
//        return DNI;
//    }
//
//    public int getSaldoActual() {
//        return saldoActual;
//    }
//
//    public void setNumCuenta(int numCuenta) {
//        this.numCuenta = numCuenta;
//    }
//
//    public void setDNI(long DNI) {
//        this.DNI = DNI;
//    }
//
//    public void setSaldoActual(int saldoActual) {
//        this.saldoActual = saldoActual;
//    }
//
//    @Override
//    public String toString() {
//        return "Estos son los datos de tu cuenta: " + "Tu número de cuenta es= " + numCuenta + ", Tu DNI es= " + DNI + ", Tu Saldo Actual es= " + saldoActual + '}';
//    }
//    
//    
//}