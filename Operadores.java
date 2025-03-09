public class Operadores {
    public static void main(String[] args){
        int x = 10;
        int y = 5;

        // Soma x + y e atribui o resultado a z
            int z = x + y;
        System.out.println("Somar x e y");
        System.out.println(z);

        // Subtrai x - y e atribui o resultado a z
        System.out.println("Subtrair x e y");
        z = x - y;
        System.out.println(z);

        // Multiplica x * y e atribui o resultado a z
        System.out.println("Multiplicar x e y");
        z = x * y;
        System.out.println(z);

        // Divide x / y e atribui o resultado a z
        System.out.println("Dividir x e y");
        z = x / y;
        System.out.println(z);

        // Pega o resto da divisão de x por y e atribui o resultado a z
        // System.out.println("Resto da divisão de x por y");
        // x = 11;
        // z = x % y;
        // System.out.println(z);

        // Operadores de Incremento e Decremento
        System.out.println("Incremento de 1 em x");
        System.out.println(++x);

        System.out.println("Decremento de 1 em x");
        System.out.println(--x);

        System.out.println("Incremento de 5 em x");
        System.out.println(x+=5);

        System.out.println("Decremento de 5 em x");
        System.out.println(x-=5);
    }

}
