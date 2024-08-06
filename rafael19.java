import java.util.Scanner;
public class rafael19{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int cod, quant;
      double precoUni, valorTotal, desc, valorDesc, valorFinal;
      
      precoUni = 0;
      desc = 0;
      
      System.out.println("19. Fa�a um programa que recebe de entrada o c�digo de um produto e a quantidade comprada do mesmo.\nCalcule e mostre:\na) O pre�o unit�rio do produto, segundo Tabela I\nb) Pre�o total da nota\nc) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota\nd) Pre�o final ao consumidor ap�s desconto\ne) N�o se esque�a de verificar a exist�ncia do produto");
      
      System.out.print("Digite o c�digo do produto: ");
      cod = teclado.nextInt();
      System.out.print("Digite a quantidade do produto: ");
      quant = teclado.nextInt();
      
      while (cod < 1 || cod > 40){
         System.out.print("C�digo invalido\n Digite novamente: ");
         cod = teclado.nextInt();
      }
      while (quant < 1){
         System.out.print("Quantidade invalida\n Digite novamente: ");
         quant = teclado.nextInt();
      }
      
      if (cod >= 1 && cod <= 10){
         precoUni = 10;
      }
      else if (cod >= 11 && cod <= 20){
         precoUni = 20;
      }
      else if (cod >= 21 && cod <= 30){
         precoUni = 30;
      }
      else if (cod >= 31 && cod <= 40){
         precoUni = 40;
      }  
      
      valorTotal = quant * precoUni;
      
      if (valorTotal <= 250){
         desc = 0.05;
      }
      else if (valorTotal > 250 && valorTotal <500){
         desc = 0.1;
      }
      else if (valorTotal >= 500){
         desc = 0.15;
      }
      
      valorDesc = valorTotal * desc;
      valorFinal = valorTotal - valorDesc;
      
      System.out.println("Resultado:");
      System.out.println("Pre�o da Unidade = R$"+precoUni);
      System.out.println("Pre�o total = R$"+valorTotal);
      System.out.println("Desconto = R$"+valorDesc);
      System.out.println("Valor Final = R$"+valorFinal);
      teclado.close();
            
   }
}