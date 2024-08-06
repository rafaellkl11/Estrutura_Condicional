import java.util.Scanner;

public class rafael21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double salarioBase, tempo, imposto, gratif, salarioLiq;
        String categoria;

        imposto = 0;
        gratif = 0;
        categoria = "";

        System.out.println("21. Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:\n(i) O imposto, conforme tabela:");
        
        System.out.print("Digite o salário base: ");
        salarioBase = teclado.nextDouble();
        System.out.print("Digite o tempo em anos: ");
        tempo = teclado.nextDouble();

        if (salarioBase < 200){
            imposto = 0 * salarioBase;
        }
        else if (salarioBase >= 200 && salarioBase <= 450 ){
            imposto = 0.03 * salarioBase;
        }
        else if (salarioBase > 450 && salarioBase < 700){
            imposto = 0.08 * salarioBase;
        }
        else if (salarioBase >= 700){
            imposto = 0.12 * salarioBase;
        }

        if (salarioBase > 500){
            if (tempo <= 3){
                gratif = salarioBase * 0.2;
            }
            else{
                gratif = salarioBase * 0.3;
            }
        }   
        else{
            if (tempo <= 3){
                gratif = salarioBase * 0.23;
            }
            else if (tempo > 3 && tempo < 6){
                gratif = salarioBase * 0.35;
            }
            else {
                gratif = salarioBase * 0.33;
            }
        }

        salarioLiq = salarioBase - imposto + gratif;

        if (salarioLiq <= 350){
            categoria = "A";
        }
        else if (salarioLiq > 350 && salarioLiq < 600){
            categoria = "B";
        }
        else{
            categoria = "C";
        }

        System.out.println("Resultado:");
        System.out.printf("Valor imposto = R$%.2f\n",imposto);
        System.out.printf("Valor gratificação = R$%.2f\n",gratif);
        System.out.printf("Valor salário líquido = R$%.2f\n",salarioLiq);
        System.out.println("Categoria = "+categoria);


        teclado.close();
    }    
}
