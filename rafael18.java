import java.util.Scanner;
public class rafael18{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int D, v1, v2, soma1, soma2, d10, d11, i;
      
      i = 0;
      soma1 = 0;
      soma2 = 0;
      
      System.out.println("18. O número de inscrição no CPF é composto de onze dígitos decimais, sendo os oito primeiros\naleatoriamente designados no momento da inscrição. Já o nono (antepenúltimo) dígito indica a região fiscal\nresponsável pela inscrição (MG é a região 6, portanto em todos CPF’s emitidos em MG o nono digito é 6).\nPor fim, o décimo e o décimo primeiro são dígitos verificadores calculados de acordo com um\nalgoritmo definido pela Receita Federal e publicamente conhecido. Assim sendo, seja D os nove\nprimeiros dígitos de um número de CPF qualquer visitado da direita para a esquerda, na forma:\nD = (d0, d1, d2, d3, d4, d5, d6, d7, d8), onde di representa o dígito do CPF na posição i e d0 representa a\nposição mais a direita deste CPF. Ou seja, os dígitos do CPF 123456789 são representados por D = (9, 8, 7,\n6, 5, 4, 3, 2, 1). Diante disso, os dígitos verificadores v1 e v2 podem ser calculados pelas expressões:\n\nAssim, implemente um algoritmo que receba de entrada o valor dos 9 primeiros dígitos de um CPF (uma\núnica variável inteira), e dos 2 dígitos verificadores. Desmembre os 9 dígitos do CPF utilizando as\noperações de divisão e resto da divisão inteira. Faça os cálculos, de acordo com a expressão acima, para\nverificar se os dígitos verificadores do CPF digitado são válidos. Como exemplo, utilizem o valor inicial\ndos CPF 111444777, os dígitos verificadores devem ser v1 = 3 e v2 = 5. Ou utilizem o próprio CPF como\nexemplo."); 
      
      System.out.print("Digite os 9 primeiros números do seu cpf: ");
      D = teclado.nextInt();
      System.out.print("Digite o 10° número do seu cpf: ");
      v1 = teclado.nextInt();
      System.out.print("Digite o 11° número do seu cpf: ");
      v2 = teclado.nextInt();
      
      int[] d = new int[9];
      
      while (i != 9){
         d[i] = D % 10;
         D = D / 10;
         i = i + 1;
      }
      
      i = 0;
      while (i != 9){
         soma1 += d[i] * (i + 1);
         i = i + 1; 
      }
      d11 = soma1 % 11;
      
      i = 0; 
      while (i != 9){
         soma2 += d[i] * i;
         i = i + 1; 
      }
      soma2 = soma2 + soma1 * 9;
      d10 = soma2 % 11;
      
      if (d10 == v1 && d11 == v2){
         System.out.print("Resultado:\nDigitos verificadores validos");
      } 
      else{
         System.out.print("Resultado:\nDigitos verificadores não validos");
      }
      
      teclado.close();      
      
   }
}