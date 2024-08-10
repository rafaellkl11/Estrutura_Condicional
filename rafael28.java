import java.util.Scanner;
public class rafael28 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int n1, n2, n3, n4;

        n4 = 0;

        System.out.println("Um novo game de realidade aumentada tem, dentro dele, um mini-game que aparece em certas situações para aumentar o ganho de pontos do game principal. O mini-game é um joguinho de memória com quatro cartas, formando dois pares de cartas iguais. Quer dizer, duas cartas têm um número inteiro N marcado em uma de suas faces e as outras duas cartas têm um outro número inteiro M, N != M. Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura.Neste problema, o jogador já virou três cartas, como mostrado na figura. Neste problema, o jogador já virou três cartas, como mostrado na figura.");

        System.out.print("Digite o 1° número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o 2° número: ");
        n2 = teclado.nextInt();
        System.out.print("Digite o 3° número: ");
        n3 = teclado.nextInt();

        if (n1 >= 0 && n1 <= 100 && n2 >= 0 && n2 <= 100 && n3 >= 0 && n3 <= 100){
            if (n1 == n2){
                n4 = n3;
            }
            else if (n2 == n3){
                n4 = n1;
            }
            else if (n1 == n3){
                n4 = n2;
            }
            System.out.print("O número que falta é "+n4);
        }
        else{
            System.out.println("Valores invalidos");
        }

        teclado.close();
    }    
}
