public class OperadoresComparacao {

    public static void main(String[] arg){
        int a = 20;
        int b = 10;

        boolean resultado = a == b;
        System.out.println("20 é igual a 10?");
        System.out.println(resultado);

        System.out.println("20 é diferente de 10?");
        resultado = a != b;
        System.out.println(resultado);

        System.out.println("20 é maior que 10?");
        resultado = a > b;
        System.out.println(resultado);

        System.out.println("20 é menor que 10?");
        resultado = a < b;
        System.out.println(resultado);       

        System.out.println("20 é menor ou igual a 10?");
        resultado = a <= b;
        System.out.println(resultado);  

        System.out.println("20 é maior ou igual a 10?");
        resultado = a >= b;
        System.out.println(resultado);  
      
        
    }
}
