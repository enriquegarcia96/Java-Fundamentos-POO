package ClasesYObjetos;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
        
        
        Operacion op = new Operacion();
        
        System.out.println("La suma es: " + op.sumar(n1,n2)); 
        System.out.println("La resta es: "+ op.restar(n1, n2));
        System.out.println("La multiplicacion es: " + op.multiplicar(n1, n2)); 
        System.out.println("La divison es:  " + op.dividir(n1, n2)); 
        
        
        //objeto de la clase persona
        Persona p1 = new Persona("Enrique", 25);
        
        p1.mostrarDatos();
        
    }  
}
