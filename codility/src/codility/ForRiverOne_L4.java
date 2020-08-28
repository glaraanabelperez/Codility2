package codility;
import java.util.Arrays;


public class ForRiverOne_L4 {
	public static void main(String[] args) {
	}
}

class Solution2 {
	 public int solution2(int X, int[] A) {
	     // write your code in Java SE 8
	     int max=X;
		 int len=A.length;
		 if (max> len) {
		        return -1;
		    }
	     int[] b = new int[X];
	      int sum2=0;
	      Arrays.fill(b, 0);
	      for(int i=0; i<len; i++){
		         if(A[i]<=max){
		             int pos=A[i]-1;
		             if (b [pos] == 0) {
                        b[pos]= 1;
                         sum2+=1; 
		                 if(sum2==X){ 
		                    return i;}
		             }
	    	 }  
	    	// if(A[i]==X) {pos= i;}
	    }
	     return -1;
	 }
	}
