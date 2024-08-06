import java.util.Scanner;
public class rafael6{
   public static void main (String[] args){
      Scanner teclado = new Scanner(System.in);
      double salario, nvSalario;
      
      System.out.println("6. Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rio inferior a R$700,00 e 10% aos\nfuncion�rios com sal�rio superior ou igual a R$700,00. Fa�a um algoritmo que calcule o reajuste e mostre\no novo sal�rio.");
      
      System.out.print("Digite o sal�rio atual: ");
      salario = teclado.nextDouble();
      
      if (salario < 700){
         nvSalario = salario + salario * 0.3;
      }
      else{
         nvSalario = salario +salario *0.1;
      }
      System.out.println("Resultado: ");
      System.out.println("Novo sal�rio com aumento: R$"+nvSalario);
      teclado.close();      
       
   }
}