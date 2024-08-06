import java.util.Scanner;
public class rafael17{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      int num1, num2, num3;
      
      System.out.println("17. Fa�a um algoritmo que receba tr�s n�meros e mostre-os em ordem crescente e decrescente.");
      
      System.out.print("Digite o 1� n�mero: ");
      num1 = teclado.nextInt();
      System.out.print("Digite o 2� n�mero: ");
      num2 = teclado.nextInt();
      System.out.print("Digite o 3� n�mero: ");
      num3 = teclado.nextInt();
      
      if (num1 > num2 && num2 > num3){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num3+", "+num2+", "+num1);
         System.out.println("Decrescente: "+num1+", "+num2+", "+num3);
      }
      else if (num1 > num3 && num3 > num2){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num2+", "+num3+", "+num1);
         System.out.println("Decrescente: "+num1+", "+num3+", "+num2);
      }
      else if (num2 > num1 && num1 > num3){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num3+", "+num1+", "+num2);
         System.out.println("Decrescente: "+num2+", "+num1+", "+num3);
      }
      else if (num2 > num3 && num3 > num1){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num1+", "+num3+", "+num2);
         System.out.println("Decrescente: "+num2+", "+num3+", "+num1);
      }
      else if (num3 > num2 && num2 > num1){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num1+", "+num2+", "+num3);
         System.out.println("Decrescente: "+num3+", "+num2+", "+num1);
      }
      else if (num3 > num1 && num1 > num2){
         System.out.println("Resultado: ");
         System.out.println("Crescente: "+num2+", "+num1+", "+num3);
         System.out.println("Decrescente: "+num3+", "+num1+", "+num2);
      }
      teclado.close();      
   }
}