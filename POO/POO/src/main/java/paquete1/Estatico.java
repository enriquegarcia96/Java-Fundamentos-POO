package paquete1;

//Miembros estaticos de una clase
public class Estatico {
    private static String frase = "primera frase";
    
    public static int sumar(int num1, int num2){
        return  num1 + num2;
    }
    
    public static void main(String[] args) {
        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(6, 9));   
    }    
}
