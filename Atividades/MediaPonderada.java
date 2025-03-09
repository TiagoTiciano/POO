package Atividades;

public class MediaPonderada {
    public static void main(String[] args){
        //Notas
        double nota1 = 8.0;
        double nota2 = 5.0;
        double nota3 = 7.5;

        // Peso das Notas
        double peso1 = 5;
        double peso2 = 3;
        double peso3 = 2;

        // Calculando a média ponderada
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Resultado
        System.out.println(mediaPonderada);
    
    }
}
