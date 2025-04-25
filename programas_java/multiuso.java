import java.util.Scanner;

public class multiuso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("========= MENÚ MULTIUSOS =========");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Conversor de temperaturas");
            System.out.println("3. Generador de números aleatorios");
            System.out.println("4. Verificar si un número es primo");
            System.out.println("5. Contador de palabras");
            System.out.println("6. Mostrar fecha y hora actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadora(scanner);
                    break;
                case 2:
                    conversorTemperaturas(scanner);
                    break;
                case 3:
                    System.out.println("Generador de números aleatorios (pendiente de implementación)");
                    break;
                case 4:
                    System.out.println("Verificar si un número es primo (pendiente de implementación)");
                    break;
                case 5:
                    System.out.println("Contador de palabras (pendiente de implementación)");
                    break;
                case 6:
                    System.out.println("Mostrar fecha y hora actual (pendiente de implementación)");
                    break;
                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println(); // Línea en blanco
        } while (opcion != 0);

        scanner.close();
    }

    public static void calculadora(Scanner scanner) {
        System.out.println("--- Calculadora en Java ---");
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
    }

    public static void conversorTemperaturas(Scanner scanner) {
        System.out.println("--- Conversor de Temperaturas ---");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opción: ");
        int tipo = scanner.nextInt();

        System.out.print("Ingresa la temperatura: ");
        double temp = scanner.nextDouble();
        double convertida;

        if (tipo == 1) {
            convertida = (temp * 9 / 5) + 32;
            System.out.println(temp + " °C son " + convertida + " °F");
        } else if (tipo == 2) {
            convertida = (temp - 32) * 5 / 9;
            System.out.println(temp + " °F son " + convertida + " °C");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
