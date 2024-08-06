import java.util.Scanner;
public class rafael3{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double preco, distribuidor, imposto, total;
      
      System.out.println("3. O custo de um carro novo ao consumidor � a soma do custo de f�brica, a porcentagem do distribuidor e os\nimpostos. O valor pago pela distribui��o e dos impostos � calculado com base no custo de f�brica. As\nporcentagens est�o apresentadas na tabela abaixo. Fa�a um programa que receba o custo de f�brica de um\ncarro e mostre o custo ao consumidor");
      
      System.out.print("Digite o pre�o de f�brica do carro:");
      preco = teclado.nextDouble();
      
      
      
      if (preco <= 28000){
         distribuidor = preco * 0.05;
         imposto = 0;
      }
      else if (preco > 28000 && preco < 45000){
         distribuidor = preco * 0.1;
         imposto = preco * 0.15;
      }
      else {
         distribuidor = preco * 0.15;
         imposto = preco * 0.2;
      }
      
      total = preco + distribuidor + imposto;
      
      System.out.println("Resultado:");
      System.out.println("Total: R$"+total);
      teclado.close();      
      
   }
   
}