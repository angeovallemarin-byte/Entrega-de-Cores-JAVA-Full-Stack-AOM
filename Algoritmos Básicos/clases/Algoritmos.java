package clases;

public class Algoritmos {
    
    //Método esPar() el cual recibe como parámetro un número entero. 
    public static boolean esPar(int numero){
        return numero % 2 == 0; //número par si el resto da cero al dividirlo por 2.
    }
    
    //Método esPrimo() el cual recibe como parámetro un número entero. 
    public static boolean esPrimo(int numero){
        // Los números menores o iguales a 1 no son primos
        if (numero <=1){ 
            return false;
        }
        //El ciclo analiza si el número es divisible por un entero mayor a 2 y menor que el número. De ser así retorna false, por lo que no es primo. 
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        //De lo contrario, retorna un true (es primo)
        return true;
    }

    //Método stringEnReversa() el cual recibe como parámetro un String.
    public static String stringEnReversa(String texto){
        //Si el parámetro viene vacío (null), frenar el método para evitar falla
        if (texto == null) {
            return null;
        }
        String textoReversa = "";
        //Recorrer el string  desde el último carácter hasta el primero
        for (int i = texto.length() - 1; i >= 0; i--){ // determinar la longitud del texto menos uno (carácter en la última posición) y luego se va devolviendo una posición hasta llegar a cero (carácter en la primera posición)
            textoReversa += texto.charAt(i); // concatenar cada carácter de atrás hacia adelante
        }
        return textoReversa;
    }

    //Método esPalindromo() el cual recibe como parámetro un String. 
     public static boolean esPalindromo(String texto){
        //Si el parámetro viene vacío (null), frenar el método para evitar falla 
       if (texto == null) {
        return false;
       }
       String textoReversa = stringEnReversa(texto);
       return texto.equalsIgnoreCase(textoReversa);
    }

    //Método secuenciaFizzBuzz() el cual recibe como parámetro un número entero. 
    public static void secuenciaFizzBuzz(int numero){
        for(int i = 1; i <= numero; i++){
            //Evaluar si es divisible por 3 y 5, si es así, imprimir FizzBuzz
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            }
            //Evaluar si solo es divisible por 3, si es así, imprimir Fizz
            else if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            //Evaluar si solo es divisible por 5, si es así, imprimir Buzz
            else if(i % 5 == 0){
                System.out.print("Buzz ");
            }
            //No es divisible por ninguno (3 y/o 5) y se imprime el número 
            else {
                System.out.print(i + " ");
            }
        }
    }
}
