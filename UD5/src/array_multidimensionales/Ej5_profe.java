package array_multidimensionales;
import java.util.Random;
public class Ej5_profe {
	  static void imprimirMatriz(int[][] m){
	        for(int[] fila:m){
	            for(int elemento:fila){
	                System.out.print(elemento+"\t");
	            }
	            System.out.println();
	        }
	        System.out.println("\n");
	    }
	    
	    public static void main (String[]args){
	        
	        Random r= new Random();
	        int[][] matriz;
	        int tam=Integer.parseInt(args[0]);
	        
	        //Creamos  array y se rellean aleatoriamente
	        matriz= new int[tam][tam];
	        for(int fila=0;fila<tam;fila++){
	            for(int columna=0;columna<tam;columna++){
	                matriz[fila][columna]=r.nextInt(100);
	            }
	        }
	        //listamos  matriz para comprobar
	        imprimirMatriz(matriz);
	        //Intercambio  de diagonales
	        for(int i=0;i<tam/2;i++){
	            //intercambio valores diagonal principal
	            int temp=matriz[i][i];
	            matriz[i][i]=matriz[tam-1-i][tam-1-i];
	            matriz[tam-1-i][tam-1-i]=temp;
	            //intercambio valores diagonal secundaria
	            temp=matriz[i][tam-1-i];
	            matriz[i][tam-1-i]=matriz[tam-1-i][i];
	            matriz[tam-1-i][i]=temp;
	            
	        }
	        
	        
	        //imprimimos resultado
	        imprimirMatriz(matriz);
	    }
	}
