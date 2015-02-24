public class fizzbuzzwhile{              
    public static void main(String[]args){  
      int i=1;
        while(i<= 100) { 
          i=i+1;
          if ((i % 3)==0){
          System.out.println("fizz");
         }
          else if ((i % 5) == 0){
          
          System.out.println("buzz");
     
          }else if ((i % 15) == 0){ 
          System.out.println("fizzbuzz");  
     
      }
      System.out.println(i);
    }
      }
}