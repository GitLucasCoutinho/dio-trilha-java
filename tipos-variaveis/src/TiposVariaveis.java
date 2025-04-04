public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // Correção na definição da variável String
        String nome = "Lucas";
        
        // Exemplo de conversão de tipos
        double numeroCurto = 1; // Variável double
        int numeroNormal = (int) numeroCurto; // Conversão explícita de double para int
        short numeroCurto2 = (short) numeroNormal; // Conversão explícita de int para short
        
        // Modificação do valor de uma variável inteira
        int numero = 5;
        numero = 10; // Valor atualizado
        
        // Imprimindo o valor atualizado no console
        System.out.println(numero);
        
        // Definindo uma constante com a palavra-chave 'final'
        final double VALOR_DE_PI = 3.14;

        // Imprimindo o valor da constante
        System.out.println("Valor de PI: " + VALOR_DE_PI);
    }
}