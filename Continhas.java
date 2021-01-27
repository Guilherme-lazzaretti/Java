public class Continhas{
        public static void main (String args[]){
            // vamos declarar variaveis 
            int a, b, c;
            a = 19;
            b = 3;

            c = a + b;
            System.out.println ("A soma total equivale a  = " + c);

            c = a - b;
            System.out.println ("A subtracao total equivale a  = " + c);

            c = a / b;
            System.out.println ("A divisao total equivale a  = " + c);

            c = a * b;
            System.out.println ("A multiplicacao total equivale a  = " + c);
            
        float y = 15f / 3;
        System.out.println ("A divisao dois equivale a  = " + y);
        // Utilizado f somente para número, ou seja, não utiliza para variáveis (caso abaixo)

        float x = (float) a / b;
        System.out.println ("A divisao tres equivale a  = " + x);

}
}