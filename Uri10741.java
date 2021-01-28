import java.util.Scanner;
public class Uri10741{
        public static void main (String args[]){
         
            Scanner teclado = new Scanner(System.in);
            int N, valor;

            N = teclado.nextInt();
                
            for (int count=1; count <= N; count++){
             valor = teclado.nextInt();
             
             if (valor %2 == 0 && valor > 0){
             System.out.println("EVEN POSITIVE");
             }

            else if (valor %2 != 0 && valor > 0){
                 System.out.println ("ODD POSITIVE");
             }
             else if (valor %2 == 0 && valor < 0){
                 System.out.println ("EVEN NEGATIVE");
             }
            else if (valor %2 != 0 && valor > 0){
                 System.out.println ("ODD POSITIVE");     
            }
           if (valor == 0)
           {
                 System.out.println ("NULL");  
           }
            }
             }
}
             