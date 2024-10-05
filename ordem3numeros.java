import java.util.Scanner;

public class ordem3numeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt(); 

        System.out.println("Digite o terçeiro numero: ");
        int num3 = scanner.nextInt();

        int menor, meio, maior = 0; 
        

       
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 >= num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println("A ordem Crescente é: ");
        System.out.println("menor:" + menor);
        System.out.println("meio:" + meio);
        System.out.println("maior:" + maior);


        scanner.close();
        
    }

}

 