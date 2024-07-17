import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iniciando calculadora...");
        System.out.println(" 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Raiz Quadrada \n 6 - Exponenciação");
        System.out.println("Seleciona a operação que você deseja: ");

        int operation = input.nextInt();

        if(operation < 1 || operation > 6) {
            System.out.println("Operação inválida. Tente novamente.");
            return;
        }

        System.out.printf("Operação selecionada: %d", operation);

        System.out.println("\nDigite o primeiro número: ");
        double num1 = input.nextDouble();
        double num2 = 0;

        if(operation != 5) {
            System.out.println("Digite o segundo número: ");
            num2 = input.nextDouble();
        }

        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                result = num1 / num2;
                break;
            case 5:
                if(num1 < 0) {
                    System.out.println("A raiz quadrada de um número negativo não existe.");
                    return;
                }
                result = Math.sqrt(num1);
                break;
            case 6:
                result = Math.pow(num1, num2);
                break;
        }

        System.out.printf("Resultado: %.2f%n", result);
    }
}