public class JavaApplication1 {

   public static void main(String[] args) {
   
       int N;            
       int nbDivisorsMax;    
       int NumbersWithMaxDiv[] = new int[10001];
       
       nbDivisorsMax = 1;  
       NumbersWithMaxDiv[1] = 1;
       
       for ( N = 2;  N <= 10000;  N++ ) {
       
           int i; 
           int divisorCpt; 
           
           divisorCpt = 0;
           
           for ( i = 1;  i <= N;  i++ ) { 
              if ( N % i == 0 )
                 divisorCpt++;
           }
           
           NumbersWithMaxDiv[N] = divisorCpt;
           
           if (divisorCpt >= nbDivisorsMax) {
               
              nbDivisorsMax = divisorCpt;
           }
       
       }
       
       System.out.println("Among integers between 1 and 10000,");
       System.out.println("The maximum number of divisors is " + nbDivisorsMax);
       System.out.println("Numbers with that many divisors include:");
       for ( N = 1; N <= 10000; N++ ) {
           if ( NumbersWithMaxDiv[N] == nbDivisorsMax ) {
               System.out.println( "   " + N );
           }
       }
   
   }

}