package domain;

public class PermCheck {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int []A=new int[]{ 1,2,3,4,5,6,10,10,9 }; 
        int solucion=solution(A);
        System.out.println(solucion);
    }
    
    static int solution(int []A){
        int i, x, rsta=0, sum=0;
        int max=A.length;
        int[]b=new int[max];
        for(i=0; i<A.length; i++){
            if(A[i]>A.length){
                rsta=0;
                break;
            }else{
                x=A[i];
                if(b[x-1]==0){
                   b[x-1]=x;
                   rsta=1;
                }else{
                    rsta= 0;
                    break;
                }
            }
        }
        return rsta;
    }

}

//static int solution(int []A){
//        int i, sum=0;
//        int max=A.length;
      //  int sum2=max*(max+1)/2;
//        for(i=0; i<A.length; i++){
//            if(A[i]>A.length){
 //               return 0;
 //           }else{
            //    sum+=A[i];
//            }
//        }
//        return (sum==sum2) ? 1: 0;
//    }
