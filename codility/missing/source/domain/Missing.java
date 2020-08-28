package domain;

public class Missing {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int []A=new int[2];
//calcular max
        int f=0, max=0, miss=0;
        f=A.length+1;
        max=(f*(f+1))/2;
        System.out.println("Max " + max);
//llenar array
        int num, e, r=0, rRestar=0;
//para usar max, en llenar el array
        num=max;
            for(e=0; e<A.length; e++){
                num=num/2;
                A[e]=num;
                rRestar=num+rRestar;
            }
            A[A.length-1]=max-rRestar;
//mostrar todos menos el perdido y sumarlos. 
        int missing=(int)(Math.random()*(5));
        int i, parcial=0;
        System.out.println("Missing= " + missing);
        for(i=0; i<A.length; i++){
            if(i!=missing){
                System.out.println("[ "+ i + " ]= " + A[i]);
                parcial=A[i]+parcial;
            }
        }
        System.out.println(" ");
        System.out.println("[ "+ missing + " ]= " + A[missing]);
        System.out.println(" ");
        System.out.println("Max= " + max + " Parcial " + parcial);
//mostrar el numero del perdido
        //int f=0, max=0, miss=0;
        //f=A.length;
        //max=(f*(f+1))/2;
        //System.out.println("Max " + max);
        if(A == null) {System.out.println(0);}
        if(A.length <= 0) {System.out.println(1);}
        miss=(max-parcial);
        System.out.println("Contenido Num perdido= " + miss);
        }
    }

        //int i;
        //long f=0, max=0,parcial=0, miss=0;
        //f=A.length+1;
        //max=(f*(f+1))/2; 
        //for(i=0; i<A.length; i++){
          //      parcial=A[i]+parcial;
        //}
        //miss=(max-parcial);
        //if(A == null) {return 0;}
        //if(A.length < 0) {return 1;}
        //if(A.length == 0) {return 1;}
        //return (int) miss; 