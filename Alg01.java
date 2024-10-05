
import java.util.Scanner;

public class Alg01 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);

        scanner.close();



        
    }
}