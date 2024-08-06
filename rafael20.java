import java.util.Scanner;
public class rafael20{
   public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      double altura, pesoIdeal;
      String sexo;
      
      pesoIdeal = 0;
      
      System.out.println("20. Fa�a um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -\nFeminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:\n- Homens: (72.7*altura) - 58 - Mulher: (62,1*altura) - 44.7");
      
      System.out.print("Digite M para masculino e F para feminino: ");
      sexo = teclado.nextLine();
      System.out.print("Digite a sua altura: ");
      altura = teclado.nextDouble();
      
      if (sexo.equals("M") || sexo.equals("m")){
         pesoIdeal = 72.7 * altura - 58;
      }
      else if (sexo.equals("F") || sexo.equals("f")){
         pesoIdeal = 62.1 * altura - 44.7;
      }
      else{
         System.out.print("Invalido");
      }
      
      System.out.println("Resultado:");
      System.out.printf("Seu peso ideal � %.2f",pesoIdeal);
      System.out.print("kg");
      teclado.close();      
      
   }
}