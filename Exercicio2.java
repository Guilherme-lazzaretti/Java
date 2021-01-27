import java.util.Scanner;

public class Exercicio2{
        public static void main (String args[]){
            // calcular a área de um quadrado usando os lados

            Scanner teclado = new Scanner(System.in);

            double Lado1;
            double Area;
                        
              System.out.println ("Digite um lado do quadrado");
              Lado1 = teclado.nextDouble();

              Area = Lado1 * Lado1;
              System.out.println ("A area total do quadrado equivale a  = " + Area);

              System.out.printf ("A area total do quadrado equivale a%.4/n = " + Area);
                      
}
}