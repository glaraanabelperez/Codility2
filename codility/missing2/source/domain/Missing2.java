package domain;

public class Missing2 {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int []A=new int[4];
        int i;
        for (i=0; i<A.length; i++){
            int num=(int) Math.random()*(100-1000)+1;
            A[i]=num;
           
            //A[i]=(int)(Math.random()*(20-10));
            //(max - min) + 1) + min
            System.out.print(A[i] + " ");
        }
        solution(A);
    }
    
    static void solution (int A[]){
        int e, sum1=0, sum2=0,total;
        for(e=1; e<A.length; e++){
            sum1=A[0];
            sum2+=A[e];
        System.out.println(" sum1/ " + sum1 + "; sum2/" + sum2);
        }
        total=Math.abs(Math.abs(sum1)+Math.abs(sum2));
        System.out.println("******");
        for(e=1; e<A.length; e++){
             System.out.println(" sum1/ " + sum1 + "; sum2/" + sum2);
                    System.out.println(total);
            int r1=Math.abs(Math.abs(sum1)-Math.abs(sum2));
            //if(r1<0){r1=r1*-1;}
            if(r1<total){total=r1;}
                    System.out.println(r1);
            sum1+=A[e];
            sum2-=A[e];
                   
        }
        System.out.println(" sum1/ " + sum1 + "sum2/" + sum2);
        System.out.println("resta= " + total);
    }


}

 