
package Ejercicio7;


public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;
    
    /*================ Guardo las cuentas de los usuarios =================== */
    Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    
    public double consultar_saldo(int indice){
        return cuentas[indice].getSaldo();
    }
    
    public void ingresar_dinero( int indice, double cantidad ){
        cuentas[indice].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero( int indice, double cantidad ){
        cuentas[indice].retirarDinero(cantidad);
    }
}
