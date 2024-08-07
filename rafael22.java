import java.util.Scanner;
public class rafael22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3, m;

        m = 0; 

        System.out.println("22.Cibele, Camila e Celeste são três irmãs inseparáveis. Estão sempre juntas e adoram fazer esportes, ler, cozinhar, jogar no computador... Agora estão aprendendo a programar computadores para desenvolverem seus próprios jogos.\r\n" + //
                        "\r\n" + //
                        "Mas nada disso interessa para esta tarefa: estamos interessados apenas nas suas idades. Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila.\r\n" + //
                        "\r\n" + //
                        "Dados três números inteiros indicando as idades das irmãs, escreva um programa para determinar a idade de Camila.");

        System.out.print("Digite a 1°idade: ");
        n1 = teclado.nextInt();
        System.out.print("Digite a 2°idade: ");
        n2 = teclado.nextInt();
        System.out.print("Digite a 3°idade: ");
        n3 = teclado.nextInt();

        if(n1 >= 5 && n1 <= 100 && n2 >= 5 && n2 <= 100 && n3 >= 5 && n3 <= 100 ){
            int[] N = new int[3];
            N[0] = n1;
            N[1] = n2;
            N[2] = n3;

            while (!(N[0] < N[1] && N[1] < N[2])){
                if (N[0] > N[1]){
                    m = N[1];
                    N[1] = N[0];
                    N[0] = m;
                }
                else {
                    m = N[2];
                    N[2] = N[1];
                    N[1] = m; 
                }
            }
            System.out.println("A idade de Camila é "+N[1]+" anos");
        }
        else{
            System.out.println("Idade invalida");
        }


        teclado.close();
    }    
}
