import java.util.Scanner;
public class rafael23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int L, R, D;

        System.out.println("A regra do impedimento no futebol pode parecer estranha, mas sem ela, se a gente pensar bem, o jogo ficaria muito chato! Ela funciona dadas as posições de três jogadores: L o jogador atacante que lança a bola; R o jogador atacante que recebe a bola; e D o último jogador defensor. E a regra vale somente se o jogador R está no seu campo de ataque; se o jogador R está no seu campo de defesa ou na linha divisória do meio campo, ele não está em impedimento. Neste problema o campo tem 100 metros de comprimento. Dadas as posições desses três jogadores, no momento exato do lançamento, haverá impedimento se e somente se a seguinte condição for verdadeira: (R>50) e (L< R) e (R >D).\r\n" + //
                        "\r\n" + //
                        "A regra parece estranha, não é mesmo? Mas a gente nem precisa entender a lógica dela. O seu programa deve apenas determinar, dadas as três posições L,R e D, se há ou não impedimento, implementando exatamente a condição acima. A figura abaixo mostra um exemplo onde não há impedimento:");

        System.out.print("Digite a posição de L : ");
        L = teclado.nextInt();
        System.out.print("Digite a posição de R : ");
        R = teclado.nextInt();
        System.out.print("Digite a posição de D : ");
        D = teclado.nextInt();

        if(L >= 0 && L <= 100 && R >= 0 && R <= 100 && D >= 0 && D <= 100 ){
            if(R>05 && L<R && R>D){
                System.out.println("Impedido");
            }
            else{
                System.out.println("Não está impedido");
            }
        }
        else{
            System.out.println("Posição invalida");
        }
        

        teclado.close();
    }    
}
