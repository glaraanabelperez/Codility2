package codility2;

public class rotacion2 {

	private int [] array;
	private int i,j;
	private int ultimo;
	
		public rotacion2() {
			this.array=new int [] {4, 6, 7, 9, 12};
			}
		//class Solution { public int[] solution(int[] A, int K); }	
		public void Establece_corrimiento (int rotaciones){
				for(j=0; j<rotaciones;j++) {
					ultimo=array[array.length-1];
					for(i=array.length-1; i>0; i--) {
						array[i]=array[i-1];
						System.out.print (array[i] + " ");
						// 

					}				
					array[0]=ultimo;
					System.out.print (array[0] + " ");
					System.out.print ( "  ");
				}
				//return array[0] y array
		}
			
		public void mostrar() {
				for(i=0; i<array.length;i++) {
					System.out.print (array[i] + " ");
					}
			}
		
}
