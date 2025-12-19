public class OperadorTernario{
    public static void main(String[] args) {
        int idade = 25;

        // Operador ternário para classificar
        String categoria = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Categoria: " + categoria);

        int numero = 10;

        // Operador ternário para verificar par/ímpar
        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("Tipo: " + tipo);

        double preco = 100;

        // Operador ternário para desconto
        double desconto = (preco > 50) ? preco * 0.1 : 0;
        System.out.println("Desconto: " + desconto);
    }
}
