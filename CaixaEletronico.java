import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = { 200, 100, 50, 20, 10, 5, 2 };

        while (true) {
            int valor;
            int[] quantidades = new int[notas.length];

            while (true) {
                System.out.print("Digite o valor a ser sacado: R$ ");
                valor = scanner.nextInt();

                if (valor > 0) {
                    break;
                } else {
                    System.out.println("Valor inválido. Por favor, insira um valor positivo.");
                }
            }

            // Pedi explicação dessa parte

            for (int i = 0; i < notas.length; i++) {
                quantidades[i] = valor / notas[i];
                valor %= notas[i];
            }

            System.out.println("Cédulas necessárias:");
            for (int i = 0; i < notas.length; i++) {
                if (quantidades[i] > 0) {
                    System.out.println("R$ " + notas[i] + ": " + quantidades[i] + " cédula(s)");
                }
            }

            if (valor > 0) {
                System.out.println("Valor sacado não pode ser efetuado. Não há cédulas disponíveis.");
                continue;
            }
            break;
        }

        scanner.close();
    }
}
