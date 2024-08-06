import java.util.Scanner;
public class rafael7{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double valor, ano, imposto;
      imposto = 0;
      
      System.out.println("7. Na cidade de Sabar�, para transfer�ncias de ve�culos, a SABATRAN cobra uma taxa de 1% para carros\nfabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa est�\nincidindo sobre o valor de tabela do carro. Implemente um algoritmo que l� o ano de fabrica��o e o pre�o\ndo carro e a seguir calcula e imprime imposto a ser pago.");
      
      System.out.print("Digite o valor do carro: ");
      valor = teclado.nextDouble();
      System.out.print("Digite o ano do carro: ");
      ano = teclado.nextDouble();
      
      if (ano < 1990){
         imposto = valor * 0.01;
      }
      else if (ano >= 1990){
         imposto = valor * 0.015;
      }
      System.out.println("Resultado:");
      System.out.println("O valor do imposto � R$"+imposto);
      teclado.close();      
   
   }
}