public class Aplicacion {
    public static void main(String[] args){
        //Crea al menos tres instancias de la clase Persona.
        Persona javier = new Persona("Javier", 25);
        Persona manuel = new Persona("Manuel", 32);
        Persona angelica = new Persona("Angélica", 58);

        //Crea al menos tres instancias de la clase CuentaBancaria, asociando cada una con una persona creada previamente.
        System.out.println("\n----------ESTADO INICIAL DE LAS CUENTAS BANCARIAS----------");
        CuentaBancaria cuentaJavier = new CuentaBancaria(100, javier);
        cuentaJavier.despliegaInformacion();

        CuentaBancaria cuentaManuel = new CuentaBancaria(150, manuel);
        cuentaManuel.despliegaInformacion();

        CuentaBancaria cuentaAngelica = new CuentaBancaria(300, angelica);
        cuentaAngelica.despliegaInformacion();

        //Realiza algunas operaciones de depósito y retiro en las cuentas bancarias creadas.
        //Imprime el saldo actual de cada cuenta bancaria después de realizar las operaciones.
        System.out.println("\n----------Movimientos en la cuenta de Javier----------");
        cuentaJavier.depositar(50);
        System.out.println("Saldo de la cuenta: " + cuentaJavier.getSaldo());
        cuentaJavier.retirar(150);
        System.out.println("Saldo de la cuenta: " + cuentaJavier.getSaldo());

        System.out.println("\n----------Movimientos en la cuenta de Manuel----------");
        cuentaManuel.depositar(10);
        System.out.println("Saldo de la cuenta: " + cuentaManuel.getSaldo());
        cuentaManuel.retirar(300);
        System.out.println("Saldo de la cuenta: " + cuentaManuel.getSaldo());

        System.out.println("\n----------Movimientos en la cuenta de Angélica----------");
        cuentaAngelica.depositar(50);
        System.out.println("Saldo de la cuenta: " + cuentaAngelica.getSaldo());
        cuentaAngelica.retirar(20);
        System.out.println("Saldo de la cuenta: " + cuentaAngelica.getSaldo());

        //Ejecuta el método imprimeInformacionDeTodasLasCuentas().
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}