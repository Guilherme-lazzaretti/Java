
import java.util.Scanner;
public class Uri1047{
        public static void main (String args[]){
            Scanner teclado = new Scanner(System.in);

        int hi, mi, hf, mf;
        int tempoi, tempof, durtotal;
        int ht, mt;

         hi = teclado.nextInt();
         mi = teclado.nextInt();
         hf = teclado.nextInt();
         mf = teclado.nextInt();

            tempoi = hi * 60 + mi;
            tempof = hf * 60 + mf;

            durtotal = tempof - tempoi;
            
if (durtotal <= 0){
    durtotal = durtotal + 1440;
}
ht = durtotal / 60;
mt = durtotal % 60;

System.out.println (" O JOGO DUROU " + ht + " HORAS (S) E " + mt + " MINUTO(S) ");
        }
}

