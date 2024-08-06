import java.util.Scanner;
public class rafael4{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double num1, num2, resultado = 0;
      char operacao;
      
      System.out.println("4. Fa�a um programa que simule uma calculadora simples. Para isso, o usu�rio dever� entrar com dois\nn�meros quaisquer e a opera��o que deseja realizar: '+' soma; ' - ' subtra��o; ' * ' multiplica��o e ' / '\ndivis�o. Lembre-se das condi��es para realizar a divis�o (condicional aninhada).");
      
      System.out.print("Digite o 1� n�mero: ");
      num1 = teclado.nextDouble();
      System.out.print("Digite o 2� n�mero: ");
      num2 = teclado.nextDouble();
      System.out.print("Digite o sinal da opera��o (+, -, *, /): ");
      operacao = teclado.next() .charAt(0);
      
      if (operacao == '+'){
         resultado = num1 + num2;
      }
      else if (operacao == '-'){
         resultado = num1 - num2;
      }
      else if (operacao == '*'){
         resultado = num1 * num2;
      }
      else if (operacao == '/'){
         while (num2 == 0){
            System.out.print("Erro! \n o denominador n�o pode ser 0 \n Digite novamente o 2� n�mero: ");
            num2 = teclado.nextDouble();
         }
         resultado = num1 / num2;
      }
      else{
         System.out.print("Opera��o invalida!");
      }
      System.out.println("Resultado: ");
      System.out.println(num1+" "+operacao+" "+num2+" = "+resultado);
      teclado.close();      
       
       
   }
}