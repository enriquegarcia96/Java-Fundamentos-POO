
package Ejercicio6;


public class NumeroComplejo {
    
    //Ejemplo: 3 + 4i
    
    private double a;//parte real
    private double b;//parte imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    /*
        numero1 = 3 +4i
        numero2 = 2 + 5i
        
        suma = 5 + 9i
        
        NumeroComplejo numero1 = new NumeroComplejo(3,4);
        numero1.calcularSuma(numero2);
    */
    
    //===== Sumar dos numeros complejos =======//
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(),b+c.getB());
        return suma;
    }
    
    
    /*
        numero1 = 3 +4i
        numero2 = 2 + 5i
        
        mult = (3*2 - 4 * 5) + ( 3*5 + 4*2 )i
    */
    
    /* ===== Multiplicar 2 numeros complejos ======= */
    public NumeroComplejo calcularProducto(NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo(  (a*c.getA() - b*c.getB()), (a*c.getB()+b*c.getA())  );
        return mult;
    }
            
    
        
    /*
        numero1 = 3 + 4i
        numero2 = 3 + 4i
        

    */
    
    /* ===== Comparar 2 numeros complejos (iguales o no) ======= */
    public boolean comprobarIgualdad(NumeroComplejo c){
        boolean igualdad = false;
        
        if(( a == c.getA() && (b == c.getB())  )){
            igualdad = true ;
        }
        return igualdad;
    }
    
    
    
    
     /*
        numeroComplejo  = 3 +4i
        entero = 2 
        
        mult = ( 6 +8i ) 
    */
    
    /* ===== Multiplicar un numero complejos por un entero ======= */
    public NumeroComplejo multiplicarPorEntero (int x){
        NumeroComplejo multiplicacion = new NumeroComplejo( a*x,b*x );
        return multiplicacion;
    }
}
