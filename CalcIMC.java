
import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura*altura);
        

        System.out.println("Seu IMC é " + imc);

        if (imc < 25) {
            System.err.println("Você está com peso normal!");
            }
        if (imc > 25 && imc < 30){
            System.err.println("Você está com Sobrepeso!");
        }   
        if (imc > 30 && imc < 40){
            System.out.println("Você está com Obsidade!");
        }
        if (imc > 40){
            System.out.println("Você está com obsidade Grave!");
        }

        

        
        
    }
        
}
