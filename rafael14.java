import java.util.Scanner;
public class rafael14{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int DDD;
      
      System.out.println("14. O Brasil é composto por 26 Estados e um Distrito Federal (onde se encontra a capital do país). Para que\nseja possível a realização de chamadas telefônicas interurbanas tem-se o DDD (Discagem Direta à\nDistância). O DDD é um código utilizado para identificar as áreas de registro de telefonia no Brasil,\npermitindo realizar ligações interurbanas sem a necessidade de uma operadora. A seguir você poderá ver a\nlista com todas estas unidades federativas e todos os códigos DDD do Brasil que são agrupados por região\ngeográfica. Assim sendo, implemente um algoritmo que dado um DDD exiba a qual estado ele pertence.");
      
      System.out.print("Digite o DDD: ");
      DDD = teclado.nextInt();
      
      switch(DDD){
         case 68:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Acre.");
            break;
         case 82:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Alagoas.");
            break;
         case 96:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Amapá.");
            break;
         case 92, 97:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Amazonas.");
            break;
         case 71 ,73, 74, 75, 77:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Bahia.");
            break;
         case 85, 88:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Ceará.");
            break;
         case 61:
            System.out.println("Resultado:\nEsse DDD pertence ao Distrito Federal.");
            break;
         case 27, 28:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Espírito Santo.");
            break;
         case 62, 64:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Goiás.");
            break;
         case 98, 99:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Maranhão.");
            break;
         case 65, 66:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Mato Grosso.");
            break;
         case 67:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Mato Grosso do Sul.");
            break;
         case 31, 32, 33, 34, 35, 37, 38:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Minas Gerais.");
            break;
         case 91:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Pará");
            break;
         case 83:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Paraíba");
            break;
         case 41, 42, 43, 44, 45, 46:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Paraná.");
            break;
         case 81, 87:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Pernambuco.");
            break;
         case 86, 89:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Piauí.");
            break;
         case 21, 22, 24:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Rio de Janeiro.");
            break;
         case 84:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Rio Grande do Norte.");
            break;
         case 51, 53, 54, 55:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Rio Grande do Sul");
            break;
         case 69:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Rondônia.");
            break;
         case 95:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Roraima.");
            break;
         case 47, 48, 49:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Santa Catarina.");
            break;
         case 11, 12, 13, 14, 15, 16, 17, 18, 19:
            System.out.println("Resultado:\nEsse DDD pertence ao estado São Paulo.");
            break;
         case 79:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Sergipe.");
            break;
         case 63:
            System.out.println("Resultado:\nEsse DDD pertence ao estado Tocantins.");
            break;   
         default:
            System.out.println("Resultado:\nDDD invalido.");


      }
      teclado.close();      
   }
}