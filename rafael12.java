import java.util.Scanner;
public class rafael12{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double lado1, lado2, lado3;
      String resultado;
      resultado = "";
      
      System.out.println("12. Fa�a um programa que recebe de entrada tr�s valores num�ricos. Verificar se esses valores podem formar\num tri�ngulo. Caso n�o, informar que n�o forma um tri�ngulo; caso sim, imprima que tipo de tri�ngulo �\nformado (escaleno, is�sceles ou equil�tero).");
      
      System.out.print("Digite a medida do 1� lado: ");
      lado1 = teclado.nextDouble();
      System.out.print("Digite a medida do 2� lado: ");
      lado2 = teclado.nextDouble();
      System.out.print("Digite a medida do 3� lado: ");
      lado3 = teclado.nextDouble();
      
      if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
         if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            resultado = "Forma um tri�ngulo equil�tero.";
         }
         else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            resultado = "Forma um tri�ngulo Escaleno.";
         }
         else{
            resultado = "Forma um tri�ngulo Is�sceles.";
         }
      }
      else{
         resultado = "N�o � possivel formar um tr�ngulo com essas medidas.";
      }
      
      System.out.println("Resultado:");
      System.out.println(resultado);
      teclado.close();      
      
   }
}