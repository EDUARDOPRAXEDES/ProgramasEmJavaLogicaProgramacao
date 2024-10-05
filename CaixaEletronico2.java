public class CaixaEletronico2 {
    public static void main(String[] args) {
        

        int[] notas = { 200, 100, 50, 20, 10, 5, 2 };
        int valor = 520;

        for (int nota : notas) {
            int qtd = valor / nota;
            System.out.println(qtd + "x" + nota);
            
            valor %= nota;
            
        }
    }
}
