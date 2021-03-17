
package Ejercicio4;

import java.net.Socket;
import java.util.Scanner;
import javax.xml.transform.Source;


public class Principal {
    
    //calcula el menor tiempo
    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        
        for(int i=1; i<atletas.length; i++){
            
            //para saber quien tiene el menor tiempo de carrera
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        String nombre;
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        float tiempoCarrera;
        
        System.out.println("Digite el numero de atletas a participar: ");
        nAtletas = entrada.nextInt();
        
        //Creamos los objeto para cada atleta
        Atleta atletas[] = new Atleta[nAtletas];
        
        for(int i=0; i<atletas.length;i++){
            System.out.print("\nDigite lo datos del atleta "+(i+1)+": ");
            System.out.println("Introducza Numero de atleta");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Introducza el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.println("Introduzca el tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();
            
            
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }
        
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
    }
        
            
            
}
