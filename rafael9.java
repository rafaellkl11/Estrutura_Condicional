import java.util.Scanner;
public class rafael9{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      double peso, altura, imc;
      String condicao;
      
      condicao = "";
      
      System.out.println("9. O IMC (�ndice de Massa Corporal) � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o\nsobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = PESO/(ALTURA2). Elabore um\nalgoritmo que leia o peso e a altura de um adulto e mostre sua condi��o.");
      
      System.out.print("Digite seu peso: ");
      peso = teclado.nextDouble();
      System.out.print("Digite a sua altura: ");
      altura = teclado.nextDouble();
      
      imc = peso / (Math.pow(altura,2));
      
      if (imc < 18.5){
         condicao = "abaixo do peso";
      }
      else if (imc >= 18.5 && imc < 25){
         condicao = "peso normal";
      }
      else if (imc >= 25 && imc < 30){
         condicao = "acima do peso";
      }
      else if (imc >= 30){
         condicao = "obeso";
      }
      
      System.out.println("Resultado:");
      System.out.println("Condi��o em rela��o ao IMC: "+condicao);
      teclado.close();      

   }
}