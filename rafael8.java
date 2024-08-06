import java.util.Scanner;
public class rafael8{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double x, fx;
      fx = 0;
      
      System.out.println("8. Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).");
      
      System.out.print("Digite o valor de x: ");
      x = teclado.nextDouble();
      
      if (x <= 1){
         fx = 1;
      }
      else if (x > 1 && x <= 2){
         fx = 2;
      }
      else if (x > 2 && x <= 3){
         fx = Math.pow(x,2);
      }
      else if (x > 3){
         fx = Math.pow(x,3);
      }
      System.out.println("Resultado:");
      System.out.println("f(x) = "+fx);
      teclado.close();      

   }
}