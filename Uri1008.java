import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int num, qtHoras;
        double valorHora, salario;

        num = teclado.nextint();
        qtHoras = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario = (valorHora * qtHora);
        
            System.out.println ("NUMBER = " + num);
            System.out.println ("SALARY = U$ " + salario);
    
    }
}