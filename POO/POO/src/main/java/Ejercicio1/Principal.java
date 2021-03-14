package Ejercicio1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2: "));
        
        //Inicio los constructores, dependiendo de los lados.
        if(lado1 == lado2){// es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
        
    }
}
