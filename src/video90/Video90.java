/*
 Ordenamiento por insercion
 */
package video90;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Video90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos,aux,pos;
        
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];
        
        for (int i=0;i<nElementos;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        // Ordenamiento por insercion
        for (int i=0;i<nElementos;i++){
            pos= i;
            aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1]> aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        
        System.out.print("\nOrden Ascendente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("\nArreglo ordenado en forma decreciente");
        for ( int i=(nElementos-1);i>0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
