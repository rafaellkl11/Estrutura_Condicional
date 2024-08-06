import java.util.Scanner;
public class rafael2{
   public static void main (String[] args) {
      Scanner teclado = new Scanner (System.in);
      int num, resto;
      
      System.out.println("2. Fa�a um algoritmo que dado um n�mero digitado pelo usu�rio mostre se o mesmo � par ou �mmpar.");
      
      System.out.print("Digite um n�mero:");
      num = teclado.nextInt();
      
      resto = num % 2;
      
      System.out.println("Resultado:");
      
      if (resto == 0){
         System.out.println("O n�mero "+num+" � par");         
      }
      else{
         System.out.println("O n�mero "+num+" � impar");
      }
      teclado.close();      
   }
}