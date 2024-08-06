import java.util.Scanner;
public class rafael13{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      int num;
      String numS, revnum;
      
      System.out.println("13. Implemente um programa que receba um n�mero inteiro de 3 d�gitos de entrada. Ap�s isso, verifique se o\nmesmo � pal�ndromo, ou seja, � o mesmo n�mero lido da direita para esquerda ou vice-versa. Ex.: 121,\n353, etc.");
      
      System.out.print("Digite um n�mero: ");
      num = teclado.nextInt();
      
      numS = Integer.toString(num);
      
      revnum = new StringBuilder(numS).reverse().toString();
      
      if (numS.equals(revnum)){
         System.out.println("Resultado:\nEsse n�mero � um pal�ndromo.");
      } 
      else{
         System.out.println("Resultado:\nEsse n�mero n�o � um pal�ndromo.");
      }
      System.out.println(numS);
      System.out.print(revnum);
      teclado.close();      

   }
}