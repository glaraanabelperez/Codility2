package domain;
import java.util.*;

public class MaxCouners {

    public static void main(String[] args) {
        int[]A=new int[]{3, 4, 4, 6, 1, 4, 4};
        int maxCont=5;
        establecerCont(A, maxCont);
    }
    
    static void llenarArray(int []A){
        int num;
        for(int i=0; i<A.length; i++){
            num=(int)(Math.random() * (9 - 2));
            A[i]=num;
            System.out.print( A [i] + " ");
        }
    }
    
    static void mostrar(int[]contador){
         for(int j=0; j<contador.length; j++){
                    System.out.print(contador[j] + " ");
                }
    }
    static int[] establecerCont(int [] A, int maxCont){
        int[] contador=new int[maxCont];
        int numUltimo=0;
        System.out.println(" ");
        for(int i=0; i<A.length; i++){
            if(A[i]<maxCont+1 && A[i]>0){
                contador[A[i]-1]+=1;
                 System.out.println("Contador =");
        mostrar(contador);
                if(contador[A[i]-1]>numUltimo){
                    numUltimo=contador[A[i]-1];
                    System.out.print("Num Ultimo" + numUltimo);
                    System.out.println(" ");
                }
            }
            if(A[i]>maxCont){
                Arrays.fill(contador, numUltimo);
            }
        }
        System.out.println("Contador final =");
        mostrar(contador);
        return  contador;
    }
}
