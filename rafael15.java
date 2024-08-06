import java.util.Scanner;
public class rafael15{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      int num, n;
      double resultado;
      String numS;
     
      n = 0;
      resultado = 0;
     
      System.out.println("15. Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo\npertence à família dos binários. Para isto, “desmembre” o número informado e verifique se foram digitados\nsomente bits. Caso o número informado seja binário, realize então a conversão do mesmo para decimal e\nimprima o resultado.");
     
      System.out.print("Digite um número binário: ");
      num = teclado.nextInt();
     
      numS = Integer.toString(num);
     
      String[] numSplit = numS.split("");
     
      while (n != numS.length()){
         if (numSplit[n].equals("1") || numSplit[n].equals("0")){
            if (numSplit[n].equals("1")){
               resultado = resultado + (Math.pow(2,(numS.length()-n-1)));
            }
           
             ;
         }
         else{
            System.out.println("Não é um número binário.");
            break;
         }
         n = n + 1;
         
      }
      System.out.println("Resultado: ");
      System.out.println(num +" na base decimal é "+ resultado);
      teclado.close();      
   }
}