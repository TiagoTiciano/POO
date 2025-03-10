package Atividades;

import java.util.Scanner; // Importa a classe Scanner do pacote java.util. Responsável por ler os inputs do usuário.

public  class CalcRaio {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // O Scanner serve para ler o que o usuário digita.
        System.out.println("Digite o valor do raio;");
        double raio = scanner.nextDouble(); // O método nextDouble() lê o que o usuário digitou e armazena na variável raio.
        double pi = 3.14; // Valor de pi
        double area = pi * raio * raio; // Calcula a área do círculo. A = π * r²
        System.out.println("A área do círculo é: " + area); // Exibe o resultado.

        scanner.close(); // O método close() fecha o Scanner.

    }
}