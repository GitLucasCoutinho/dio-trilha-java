public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;

        System.out.println("o numero negativo é: " + numero);
        System.out.println("o numero positivo é: " + numero * -1);

        //Operador Ternario e representado da seguinte forma  i = 1  ? entao isso  : se nao isso 

        int numero1 = 2, numero2 = 1;
        boolean simNao = numero1 == numero2;
        //boolean simNao = numero1 > numero2; //caso numero um seja maior que numero 2 
        
        System.out.println("o numero um sao iguais?  " +  simNao);


        String nome = "Lucas";

        System.out.println("os nomes sao iguais?" + nome.equals("Lucas"));

    }
}
