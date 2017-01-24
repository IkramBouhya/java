import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

							

		            	       Scanner sc=new Scanner(System.in);
		            	       System.out.println("Entrez une phrase");
		            	       String s=sc.nextLine();
		            	       
		            	       for ( int i = 0;  i < s.length();  i++ ) {
		            	          char c = s.charAt(i); /* pointer sur chaque caractÃ¨re du string */
		            	          if ( Character.isLetter(c) ) {
		            	             System.out.print(c); 
		            	          }
		            	          else {
		            	                System.out.println();
		            	            
		            	          }
		            	       }
		            	       
		            	         
		            	   }  

		            	}  