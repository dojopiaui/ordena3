

public class Ordem
{
   int maior , medio, menor;

   
   public Ordem (int a , int b ,int c) {
     if (a > b && a > c && b > c){
          maior = a ;
          medio = b ;
          menor = c ;
     }
     if (b > a && b > c && c > a) {
          maior = b;
          medio = c;
          menor = a;
     }
     if (c > a && c > b && b > c) {
          maior = c;
          medio = b;
          menor = a;
     }
     if (b > c && b > a && a > c) {
          maior = b;
          medio = a;
          menor = c;
     }
     if (c > b && c > a && b > a) {
         maior = c;
         medio = b;
         menor = a;
      
     }
     
     if (a > c && a > b && c > b) {
         maior = a;
         medio = c;
         menor = b;
        }
     
    } 
    
        String ordem () {
            return menor + " " + medio +" " + maior;
        }    
} 
