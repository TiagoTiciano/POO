package Atividades;

public class SalarioImposto {
    public static void main(String[] args){

        // Salário
        System.out.println("Salário Base: R$ 2000,00");
        double salario = 2000;

        System.out.println("Gratificação: 5%");
        // Gratificação de 5%
        double gratificacao = salario * 0.05;
        System.out.println("Imposto cobrado: 7%");
        // Imposto de 7%
        double imposto = salario * 0.07;

        // Salário Líquido
        double liquido = salario + gratificacao - imposto;

        // Exibe o Salário Líquido
        System.out.println("Salário Líquido: R$ " + liquido);


    }
    
}
