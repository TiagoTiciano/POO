package Atividades;

public class ReajusteSalarial {
    public static void main(String[] args) {
        // Valores fixos
        double salario = 2000; // Salário fixo
        double reajuste = 20; // Reajuste fixo de 15%

        // Cálculo do novo salário
        double novoSalario = salario + (salario * reajuste / 100);

        // Exibe o resultado
        System.out.println("O novo salário é: R$ " + novoSalario);
    }
}
