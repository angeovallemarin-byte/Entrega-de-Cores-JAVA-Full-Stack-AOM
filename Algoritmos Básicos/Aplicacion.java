import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args){
        //Pruebas de esPar()
        // Retornar true si el número es par, false si el número es impar.
        System.out.println("¿El 4 es par? " + Algoritmos.esPar(4));
        System.out.println("¿El 3 es par? " + Algoritmos.esPar(3));

        //Pruebas de esPrimo()
        // Retornar true si el número es primo, false de lo contrario. 
        System.out.println("¿El 3 es primo? " + Algoritmos.esPrimo(3));
        System.out.println("¿El 1 es primo? " + Algoritmos.esPrimo(1));

        //Pruebas de stringEnReversa()
        //Retornar el String recibido escrito de atrás hacia adelante. 
        System.out.println("ROMA al revés: " + Algoritmos.stringEnReversa("ROMA"));

        //Pruebas de esPalindromo()
        // Retornar true si el String es un palíndromo, false de lo contrario.
        System.out.println("¿Anilina es un palíndromo? " + Algoritmos.esPalindromo("Anilina"));
        System.out.println("¿arbol es un palíndromo? " + Algoritmos.esPalindromo("arbol"));

        //Pruebas de secuenciaFizzBuzz()
        //Imprime en terminal del número 1 hasta el número dado como parámetro.
        Algoritmos.secuenciaFizzBuzz(15);


    }
    
}
