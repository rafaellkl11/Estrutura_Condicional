import java.util.Scanner;
public class rafael11{
   public static void main (String[] args){
      Scanner teclado = new Scanner (System.in);
      String dataVota, dataNasc, resultado;
      int diaV, mesV, anoV, diaN, mesN, anoN, idade;
      
      resultado = "";
      
      System.out.println("11. Fa�a um programa que receba de entrada a data de vota��o do ano atual e a data de nascimento de uma\npessoa. Utilizando as informa��es pesquisadas na quest�o anterior, verifique se essa pessoa n�o pode votar,\n� obrigada a votar ou o voto � facultativo, segundo as regras brasileiras.");
      
      System.out.print("Digite a data de vota��o atual no formato DD/MM/AAAA: ");
      dataVota = teclado.nextLine();
      System.out.print("Digite o data de nascimento no formato DD/MM/AAAA: ");
      dataNasc = teclado.nextLine();
      
      String[] dataVotaSplit = dataVota.split("/");
      String[] dataNascSplit = dataNasc.split("/");
      
      diaV = Integer.parseInt(dataVotaSplit[0]);
      mesV = Integer.parseInt(dataVotaSplit[1]);
      anoV = Integer.parseInt(dataVotaSplit[2]);
      diaN = Integer.parseInt(dataNascSplit[0]);
      mesN = Integer.parseInt(dataNascSplit[1]);
      anoN = Integer.parseInt(dataNascSplit[2]);
      
      idade = anoV - anoN;
      
      if (mesN > mesV){
         idade = idade -1; 
      }
      else if (mesN == mesV){
         if (diaN > diaV){
            idade = idade - 1;
         } 
      }
      
      if (idade < 16){
         resultado = "N�o vota";
      }
      else if ((idade >= 16 && idade < 18) || idade > 70){
         resultado = "Facultativo";
      }
      else if ( idade >= 18 && idade <= 70){
         resultado = "Obrigatorio";      
      }
      
      System.out.println("Resultado:");
      System.out.print("Situa��o da pessoa em rela��o a vota��o: "+resultado);
      teclado.close();      
      
   }
}