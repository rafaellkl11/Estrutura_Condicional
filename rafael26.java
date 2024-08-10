import java.util.Scanner;
public class rafael26{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        String V;
        int P1, C1, P2, C2, R;

        R = 0;
       
        System.out.println("26.JoÃ£ozinho acaba de mudar de escola e a primeira coisa que percebeu na nova escola Ã© que a gangorra do parquinho nÃ£o\n Ã© simÃ©trica, uma das extremidades Ã© mais longa que a outra. ApÃ³s brincar algumas vezes com um amigo de mesmo peso,\nele percebeu que quando estÃ¡ em uma extremidade, a gangorra se desequilibra para o lado dele (ou seja, ele fica na parte \nde baixo, e o amigo na parte de cima), mas quando eles trocam de lado, a gangorra se desequilibra para o lado do amigo.\n\nSem entender a situaÃ§Ã£o, JoÃ£ozinho pediu ajuda a outro amigo de outra sÃ©rie, que explicou que o comprimento do lado interfere no equilÃ­brio da gangorra, pois a gangorra estarÃ¡ equilibrada quando P1â‹…ð ¶1=ð ‘ƒ2â‹…ð ¶2 onde P1 e P2 sÃ£o os \npesos da crianÃ§a no lado esquerdo e direito, respectivamente, e C1 e C2 sÃ£o os comprimentos da gangorra do lado \nesquerdo e direito, respectivamente.\n\nCom a equaÃ§Ã£o, JoÃ£ozinho jÃ¡ consegue dizer se a gangorra estÃ¡ equilibrada ou nÃ£o mas, alÃ©m disso, ele quer saber para \nqual lado a gangorra descerÃ¡ caso esteja desequilibrada.");
        System.out.println("P1 = peso da 1Â° crianÃ§a");
        System.out.println("C1 = comprimento do lado da gangorra da 1Â° crianÃ§a");
        System.out.println("P2 = peso da 2Â° crianÃ§a");
        System.out.println("C2 = comprimento do lado da gangorra da 2Â° crianÃ§a");
        System.out.print("Digite P1 C1 P2 C2(cada numero separados por espaco):");
        V = teclado.nextLine();

        String[] VSplit = V.split(" ");

        P1 = Integer.parseInt(VSplit[0]);
        C1 = Integer.parseInt(VSplit[1]);
        P2 = Integer.parseInt(VSplit[2]);
        C2 = Integer.parseInt(VSplit[3]);               
        
        if ((P1*C1) == (P2*C2)){
            R = 0;
            System.out.print(R);
        }
        else if ((P1*C1) > (P2*C2)){
            R = -1;
            System.out.print(R);
        }
        else if ((P1*C1) < (P2*C2)){
            R = 1;
            System.out.print(R);
        }

        teclado.close();
    }
}