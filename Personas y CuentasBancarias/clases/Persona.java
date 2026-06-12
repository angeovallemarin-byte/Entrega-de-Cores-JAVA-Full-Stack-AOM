public class Persona {
//Atributos privados
    private String nombre; //nombre (String): Representa el nombre de la persona.
    private int edad; //edad (int): Representa la edad de la persona.

//Constructor: que inicialice el nombre y la edad de la persona.
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
//Métodos:
    //Implementar getters y setters para todos los atributos.
     public String getNombre() { //llama al atributo
        return nombre;
    }

    public void setNombre(String nombre) { //modifica info que tiene el atributo
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //despliegaInformacion(): Muestra la información de la persona.
    public void despliegaInformacion(){
        System.out.println("Nombre: " + this.nombre + " , Edad: " + this.edad + " años");
    }

}