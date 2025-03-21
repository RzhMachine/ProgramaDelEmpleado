import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del empleado: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("¿Es jefe de departamento? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        boolean esJefe = respuesta.equals("si");

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        System.out.println("\nDATOS DEL EMPLEADO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Es jefe de departamento: " + (esJefe ? "si" : "no"));
        System.out.println("Salario: " + salario);

        scanner.close();
    }
}
