import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
//Atributos
    private double saldo; //saldo (double): Representa el saldo disponible en la cuenta.
    private Persona titular; //titular (Persona): Representa al titular de la cuenta (debe ser una instancia de la clase Persona).
    private int numeroCuenta;//numeroCuenta (int): Representa el número de cuenta.
    public static ArrayList<CuentaBancaria>listaCuentaBancarias = new ArrayList<>();//listaDeCuentasBancarias (ArrayList<CuentaBancaria>): atributo estático para almacenar el total de cuentas creadas.

//Constructor: que inicialice el saldo de la cuenta y el titular, ambos recibidos como parámetros. 
    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;

        //Generar número de cuenta aleatorio de 6 dígitos (100000 a 999999). 
        Random numeroAleatorio = new Random();
        this.numeroCuenta = 100000 + numeroAleatorio.nextInt(900000);

        //Cada vez que se cree un objeto se agrega la cuenta nueva a la lista de cuentas bancarias.
        listaCuentaBancarias.add(this);
    }

//Métodos:
    //Implementa getters y setters para todos los atributos.
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //depositar(double monto): Añade el monto especificado al saldo de la cuenta.
    public void depositar(double monto){
        if (monto > 0){
            this.saldo += monto;
            System.out.println("Deposito de: $" + monto + " realizado con éxito");
        }
    }

    //retirar(double monto): Retira el monto especificado del saldo de la cuenta, si hay suficientes fondos.
    public void retirar(double monto){
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro de: $" + monto + " realizado con éxito");
        } else {
            System.out.println("Fondos insuficientes en la cuenta para retirar $" + monto);
        }
    }

    //despliegaInformacion(): Muestra la información de la cuenta incluyendo la información del titular.
    public void despliegaInformacion(){
        System.out.println("\n--------------------Datos de la cuenta--------------------");
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo Disponible: $" + this.saldo);
        System.out.println("Titular de la cuenta: " + this.titular.getNombre());
        System.out.println("------------------------------------------------------------");
        //También se puede usar this.titular.despliegaInformacion():
        /*if (this.titular != null){
            this.titular.despliegaInformacion();
        }*/
    }

    //imprimeInformacionDeTodasLasCuentas(): Método estático que recorre la lista de cuentas bancarias e imprime su información.
    public static void imprimeInformacionDeTodasLasCuentas(){
        System.out.println("\n----------ESTADO ACTUALIZADO DE LAS CUENTAS BANCARIAS----------");
        for (CuentaBancaria cuenta : listaCuentaBancarias){ //uso de un ciclo para llamar al método e imprimir
            cuenta.despliegaInformacion();
        }
    }
}