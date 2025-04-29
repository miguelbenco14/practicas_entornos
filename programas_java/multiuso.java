import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
            scanner.nextLine(); // Consumir salto de línea pendiente

            switch (opcion) {
                case 1:
                    calculadora(scanner);
                    break;
                case 2:
                    conversorTemperaturas(scanner);
                    break;
                case 3:
                    generadorNumerosAleatorios(scanner);
                    break;
                case 4:
                    verificarNumeroPrimo(scanner);
                    break;
                case 5:
                    contadorPalabras(scanner);
                    break;
                case 6:
                    mostrarFechaHoraActual();
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

    public static void generadorNumerosAleatorios(Scanner scanner) {
        System.out.println("--- Generador de Números Aleatorios ---");
        System.out.print("Introduce el valor mínimo: ");
        int min = scanner.nextInt();
        System.out.print("Introduce el valor máximo: ");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("El valor mínimo no puede ser mayor que el máximo.");
            return;
        }

        Random random = new Random();
        int numeroAleatorio = random.nextInt(max - min + 1) + min;
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }

    public static void verificarNumeroPrimo(Scanner scanner) {
        System.out.println("--- Verificar si un Número es Primo ---");
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static void contadorPalabras(Scanner scanner) {
        System.out.println("--- Contador de Palabras ---");
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        if (frase.isEmpty()) {
            System.out.println("No se ingresó ninguna frase.");
            return;
        }

        String[] palabras = frase.trim().split("\\s+");
        System.out.println("La frase contiene " + palabras.length + " palabras.");
    }

    public static void mostrarFechaHoraActual() {
        System.out.println("--- Fecha y Hora Actual ---");
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formato));
    }
}
