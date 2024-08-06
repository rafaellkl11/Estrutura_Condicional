import java.util.Scanner;
public class rafael5{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      char caracter;
      
      System.out.println("5. Fa�a um programa que solicite ao usu�rio que digite um caracter e em seguida imprima se o caracter\ndigitado � ou n�o uma vogal.");
      
      System.out.print("Digite um caracter: ");
      caracter = teclado.next() .charAt(0);
      
      if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ){
         System.out.println("Resultado: ");
         System.out.println("O caracter "+ caracter+" � uma vogal");
      }
      else {
         System.out.println("Resultado: ");
         System.out.println("O caracter "+ caracter+" n�o � uma vogal");
      }
      teclado.close();      
   }
}