import java.util.Scanner;
public class rafael1{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      int idade;
      String categoria;
      
      System.out.println("1. Fa�a um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Fa�a os testes\nnecess�rios em rela��o a idade inv�lida.");
      
      System.out.print("Digite idade do nadador: ");
      idade = teclado.nextInt();
      
      categoria = "";
      
      while (idade < 5 ){
         System.out.print("Idade invalida! \nDigite a idade novamente: ");
         idade = teclado.nextInt();
      }
      
      if (idade >= 5 && idade <= 7){
         categoria = "Infantil";
      }
      else if (idade >= 8 && idade <= 10){
         categoria = "Juvenil";
      }
      else if (idade >= 11 && idade <= 15){
         categoria = "Adolecente";
      }
      else if (idade >= 16 && idade <= 40){
         categoria = "Adulto";
      }
      else if (idade >= 41){
         categoria = "S�nior";
      }
      
      System.out.println("Resultado:");      
      System.out.println("Categoria do nadador: "+categoria);
      teclado.close();           
   }
}