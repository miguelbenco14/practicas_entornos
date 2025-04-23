import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora en Java");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
