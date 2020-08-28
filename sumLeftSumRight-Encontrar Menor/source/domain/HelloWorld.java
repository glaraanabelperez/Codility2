package domain;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int []A=new int[5];
        int i;
        for (i=0; i<A.length; i++){
            A[0]=-1000;
            A[1]=1000;
            A[2]=-5;
            A[3]=-9;
            A[4]=87;
          
            //A[i]=(int)(Math.random()*(20-10));
            //(max - min) + 1) + min
            System.out.print(A[i] + " ");
        }
        solution(A);
    }
    
    static void solution (int A[]){
        int i,e;
        long sumrigth=0, sumleft=0, r1=0, r2=0;
        for(e=1; e<A.length; e++){
            sumrigth+=A[e];
        }
        sumleft=A[0]; 
        r2=Math.abs(Math.abs(sumleft)+Math.abs(sumrigth));
        System.out.println("r" + r2);
        for(i=1; i<A.length; i++){
                    System.out.println("left" +sumleft);
        System.out.println("rigth" + sumrigth);
            r1=sumleft-sumrigth;
            System.out.println("r1= " + r1);
            if(r1<0){r1=r1*-1;}
            if(r1<r2){r2=r1;}   
            sumleft+=A[i];
            sumrigth-=A[i];
        }
             System.out.println("resta= " + r2);
    }
}
