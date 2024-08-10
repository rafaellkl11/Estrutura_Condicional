import java.util.Scanner;

public class rafael24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D, m, time1, time2, diferenca;
    
        m = 0;
    
        System.out.println(" Quatro amigos combinaram de jogar tênis em duplas. Cada um dos amigos tem um nível de jogo, que é representado por um número inteiro: quanto maior o número, melhor o nível do jogador.\n Os quatro amigos querem formar as duplas para iniciar o jogo. De forma a tornar o jogo mais interessante, eles querem que os níveis dos dois times formados sejam o mais próximo possível. O nível de um time é a soma dos níveis dos jogadores do time.\nEmbora eles sejam muito bons jogadores de tênis, os quatro amigos não são muito bons em algumas outras coisas, como lógica ou matemática. Você pode ajudá-los e encontrar a menor diferença possível entre os níveis dos times que podem ser formados?");
    
        System.out.println("Digite o nível de jogo do 1° jogador:");
        A = teclado.nextInt();
        System.out.println("Digite o nível de jogo do 2° jogador:");
        B = teclado.nextInt();
        System.out.println("Digite o nível de jogo do 3° jogador:");
        C = teclado.nextInt();
        System.out.println("Digite o nível de jogo do 4° jogador:");
        D = teclado.nextInt();
        
        
        
        int[] N = new int[4];
        N[0] = A;
        N[1] = B;
        N[2] = C;
        N[3] = D;
        
        while (!(N[0] <= N[1] && N[1] <= N[2] && N[2] <= N[3])){
            if (N[0] > N[1]){
                m = N[1];
                N[1] = N[0];
                N[0] = m;
            }
            else if (N[1] > N[2]){
                m = N[2];
                N[2] = N[1];
                N[1] = m; 
            }
            else {
                m = N[3];
                N[3] = N[2];
                N[2] = m;
            }
        }
    
        if (N[0] >= 0 && N[1] >= 0 && N[2] >= 0 && N[3] >= 0 && N[0] <= 10000 && N[1] <= 10000 && N[2] <= 10000 && N[3] <= 10000 ){
            time1 = N[0] + N[3];
            time2 = N[1] + N[2];
            diferenca = time1 - time2;
                 System.out.println("A diferença entre os níveis dos dois times é "+diferenca);
        }
        else{
            System.out.println("Nível de jogo inválido");
        }
        
        teclado.close();
    }
}