import java.util.Scanner;
public class rafael10{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      double q, d, n, s;
      
      System.out.println("10. Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D submetida a\numa carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via teclado. Utilize a\nfórmula:\n\nonde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.");
      
      System.out.print("Qual o valor de D: ");
      d = teclado.nextDouble();
      System.out.print("Qual o valor de Q: ");
      q = teclado.nextDouble();
      
      n = (d>100)?2:(d<50)?6:4;
      
      s = ((4 * q)/(Math.PI * Math.pow(d,2)))*n;
      
      System.out.println("Resultado: ");      
      System.out.print("S = "+s);
      teclado.close();      

   }
}