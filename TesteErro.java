public class TesteErro {
    public static void main(String[] args) {
        // Saída normal
        System.out.println("Esta é uma mensagem normal.");

        // Saída de erro
        System.err.println("Esta é uma mensagem de erro!");

        // Simulando uma exceção
        try {
            int resultado = 10 / 0; // Isso causará uma exceção de divisão por zero
        } catch (ArithmeticException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
