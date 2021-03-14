//Modificadores de acceso

//Encapsulamiento y metodos accesores (Getters y Setters)
package paquete1;

public class Clase1 {
    private int edad;
    private String nombre;
    
    
    //Metodo Setters: Establecemos la edad
    public void setEdad( int edad ){
        this.edad = edad;
    }
    
    //Metodo Getters: Mostramos la edad
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
