package lab_02_Practice;
import java.util.*;

class Operation {
	//first method
		public static void m () {
		 Scanner obj1 = new Scanner(System.in);
			System.out.println("Enter first number:  ");
			int a = obj1.nextInt();
			System.out.println("Enter second number: " ); 
			int b = obj1.nextInt() ;
			System.out.println("1. Addition (+).\n"
					+ "2. Subtraction (-).\n"
					+ "3. Multiplication (*).\n"
					+ "4. Division (/).\r\n"
					+ "Enter operation number:  ");
			int option = obj1.nextInt() ;
			boolean p = true ;
			while( p == true)
			 if(option == 1) {
				 System.out.println("The result is : " + (a + b));
				 return ;
			 }
			 else if(option == 2) {
				 System.out.println("The result is : " + (a-b));
				 return ;
			 }
			 else if(option == 3) {
					 System.out.println("The result is : " + (a*b));
					 return ;
					 }    	 
			 else if (option == 4) {
						 System.out.println("The result is : " + (a/b));
						 return ;
					 }
					 else { 
						 System.out.println("Invalid input "); 
						 }
			
			 
		} 
		//2nd method
		static int Take_input() {
			Scanner sobj = new Scanner (System.in) ;
			System.out.println("Do you want to make another calculation?\n" 
		            + "1. Yes\r\n"
			   		+ "2. No\r\n"
			   		+ "Enter your option: ");
			  int Opt = sobj.nextInt() ;
			  
			  if (Opt == 1) {
				Operation.m();  
			  }
			  else if(Opt ==2 ) {
				  
				  return Opt;
				  
				  
			  }
			  else if(Opt !=1 && Opt !=2  ) {
				  do {
					  System.out.println("Give a valid input\n" );
					  Opt = sobj.nextInt() ;
				  }while(Opt != 1 && Opt != 2 ) ;
			  }
			  
			  if(Opt==1 ) {
			 return Opt;
			  }
		
		return Opt ;
		}
}

public class Math_operation {

	public static void main(String[] args) {
		Operation.m();
       int Opt = 1 ;
	   do{
	   Opt = Operation.Take_input(); 
	   if(Opt ==1 ) {
		   
		   Operation.m();
	   }
	  } while (Opt==1) ;
	   return ;
	}
}


   

	
	


