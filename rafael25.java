import java.util.Scanner;
public class rafael25{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int A,B, C, D;
        
        System.out.println("25. Nesta tarefa, dados os pesos das quatro bolas, seu programa deve decidir se o móbile está ou não completamente equilibrado.");
        
        System.out.print("Digite o peso da bola A: ");
        A = teclado.nextInt();
        System.out.print("Digite o peso da bola B: ");
        B = teclado.nextInt();
        System.out.print("Digite o peso da bola C: ");
        C = teclado.nextInt();
        System.out.print("Digite o peso da bola D: ");
        D = teclado.nextInt();
        
        if (A >= 1 && B >= 1 && C >= 1 && D >= 1 && A <= 1000 && B <= 1000 && C <= 1000 && D <= 1000){
            if(A == (B + C + D)){
                if(D == (B + C)){
                    if(B == C){
                        System.out.print("S");
                    }
                    else{
                        System.out.print("N");
                    }   
                }
                else{
                    System.out.print("N");
                }
            }
            else{
                System.out.print("N");
            }
        }
        else{
            System.out.print("Peso invalido");
        }
        
        teclado.close();
        
    }
}