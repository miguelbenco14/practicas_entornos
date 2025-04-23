import java.util.Scanner;

public class maquina_expendedora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Agua", "Refresco", "Chocolate", "Papas"};
        double[] precios = {1.00, 1.50, 2.00, 1.75};

        System.out.println("===== MÁQUINA EXPENDEDORA =====");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%d. %s - $%.2f\n", i + 1, productos[i], precios[i]);
        }

        System.out.print("Selecciona un producto (1-4): ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > productos.length) {
            System.out.println("Selección inválida.");
            return;
        }

        double precio = precios[opcion - 1];
        System.out.printf("Has seleccionado: %s. Precio: $%.2f\n", productos[opcion - 1], precio);

        System.out.print("Ingresa la cantidad de dinero: $");
        double dinero = scanner.nextDouble();

        if (dinero < precio) {
            System.out.println("Dinero insuficiente. Transacción cancelada.");
        } else {
            double cambio = dinero - precio;
            System.out.printf("¡Gracias por tu compra! Tu cambio es: $%.2f\n", cambio);
        }

        scanner.close();
    }
}
