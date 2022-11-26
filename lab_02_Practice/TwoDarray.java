package lab_02_Practice;
import java.util.Scanner ;




class Array_operate  {
	private static Scanner obJ;
   
	//initializing with zero
	public static void arr () {
		int A [][] = new int [5][4]  ;  
		for (int i =0; i<5 ; i++) {
			for (int j=0; j<4; j++) {
				A[i][j] = 0 ;
			}
		}
		//taking input from user 
		Scanner obJ = new Scanner (System.in);
		System.out.println("Input the 4*4 matrix : \n" );
		for (int i =0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
		System.out.print("Put element at"
		+ (i+1) +"row " + (j+1) + "column" );
				A[i][j] = obJ.nextInt() ;
			}
		}
		// summed values for last row
	    for (int i=4; i<5 ;i++) {
			for (int y=3 ; y<4 ; y++) {
				for(int a = 0; a <4; a++ ) {      
					A[i][a] = A[y][a] + A[y-1][a]+A[y-2][a]+A[y-3][a] ;
					
	             }  
				
	      
		}
	
		}
	    
	    
		// return A[5][4] ;
		System.out.println("\n\n");
		for (int i =0; i<5; i++ ) {
			for (int j=0; j<4 ; j++) {
				System.out.print(A[i][j] + " " );
			}
			System.out.println("");
			
		}
	}
//for displaying the array
	public static void displayArr (int A [][]) {
      for (int a=0; a <A.length; a++) {
	  for (int b=0; b < A[0].length ; b++) {
		System.out.print(A[a][b] + "\n");
	  }
	  System.out.println("\n");
}
	}

}
public class TwoDarray {

	public static void main(String[] args) {
		Array_operate.arr() ;
	}

}


