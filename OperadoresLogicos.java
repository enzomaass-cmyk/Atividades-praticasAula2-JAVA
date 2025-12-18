public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteira = true;

        // AND (&&) - ambas precisam ser verdadeiras
        boolean podeDirigir = (idade >= 18) && temCarteira;
        System.out.println("Pode dirigir: " + podeDirigir);

        // OR (||) - pelo menos uma precisa ser verdadeira
        boolean podeViajar = (idade >= 18) || temCarteira;
        System.out.println("Pode viajar: " + podeViajar);

        // NOT (!) - inverte o resultado
        boolean naoMenor = !(idade < 18);
        System.out.println("Não é menor: " + naoMenor);
    }
}
