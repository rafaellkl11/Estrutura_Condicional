import java.util.Scanner;
public class rafael16{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      int ano;
      double resto;
      
      System.out.println("16. Implemente um programa que receba um número inteiro positivo representando um ano qualquer e\nimprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0\nou ano % 400 == 0)).");
      
      System.out.print("Digite o ano: ");
      ano = teclado.nextInt();
      
      resto = ano % 4;
      
      if (resto == 0){
         System.out.println("Resultado: \nO ano "+ano+" é bissexto");
      }
      else{
         System.out.println("Resultado: \nO ano "+ano+" não é bissexto");
      }
      teclado.close();      
   }
}