import java.util.Scanner;
public class rafael27 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int T1, T2, T3, posicao1, posicao2, posicao3, m;
        
        m = 0;

        System.out.println("A natação foi um dos esportes mais emocionantes das Olimpíadas do Rio. Houve até uma prova na qual três atletas chegaram empatados, cada um recebendo uma medalha de prata! Normalmente, porém, os três primeiros colocados terminam a prova em tempos distintos e, portanto, temos a distribuição mais comum de medalhas: o nadador que terminou no menor tempo recebe medalha de ouro; o nadador que terminou com o segundo menor tempo recebe medalha de prata; e o que terminou com o terceiro menor tempo recebe medalha de bronze. Neste problema, dados os três tempos distintos de finalização da prova, dos três nadadores que ganharam medalhas, seu programa deve dizer quem ganhou medalha de ouro, quem ganhou prata e quem ganhou bronze.");

        System.out.print("Digite o tempo do nadador 1: ");
        T1 = teclado.nextInt();
        System.out.print("Digite o tempo do nadador 2: ");
        T2 = teclado.nextInt();
        System.out.print("Digite o tempo do nadador 3: ");
        T3 = teclado.nextInt();

        if (T1 >= 1 &&  T1 <= 1000 && T2 >= 1 &&  T2 <= 1000 && T3 >= 1 &&  T3 <= 1000 && T1 != T2 && T1 != T3 && T2 != T3){
            int [] p = new int[3];
            p[0] = T1;
            p[1] = T2;
            p[2] = T3;
            
            while (!(p[0] <= p[1] && p[1] <= p[2])){
                if (p[0] > p[1]){
                    m = p[1];
                    p[1] = p[0];
                    p[0] = m;
                }
                else {
                    m = p[2];
                    p[2] = p[1];
                    p[1] = m; 
                }
            }

            if (p[0] == T1){
                posicao1 = 1;
            }

            else if (p[0] == T2){
                posicao1 = 2;
            }
            else {
                posicao1 = 3;
            }

            if (p[1] == T1){
                posicao2 = 1;
            }
            else if (p[1] == T2){
                posicao2 = 2;
            }
            else {
                posicao2 = 3;
            }

            if (p[2] == T1){
                posicao3 = 1;
            }
            else if (p[2] == T2){
                posicao3 = 2;
            }
            else {
                posicao3 = 3;
            }

            System.out.println("1° ficou o nadador "+posicao1);
            System.out.println("1° ficou o nadador "+posicao2);
            System.out.println("1° ficou o nadador "+posicao3);
        }
        else{
            System.out.println("Valores invalidos");
        }

        teclado.close();
    }
}
