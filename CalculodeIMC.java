public class CalculodeIMC {
    public static void main(String[] args) {
        // Dados de entrada
        double peso = 75.0;      // kg
        double altura = 1.75;    // metros

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibição dos dados
        System.out.println("=== CALCULADORA DE IMC ===");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + imc);
        System.out.println();

        // Classificação usando if / else
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obeso";
        }

        System.out.println("Classificação: " + classificacao);
    }
}
