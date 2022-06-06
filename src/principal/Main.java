package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;
        // Se crea objeto cuenta1 sin parámetros
        // Se ejecuta el constructor por defecto
        Cuenta cuenta1 = new Cuenta();
        //se solicitan por consola los atributos de la clase cuenta
        System.out.print("Nombre : ");
        nombre = sc.nextLine();

        System.out.print("Número de cuenta : ");
        numero = sc.nextLine();

        System.out.print("Tipo de interes : ");
        tipo = sc.nextDouble();

        System.out.print("Saldo: ");
        importe = sc.nextDouble();
        //se setea la cuenta creada anteriormente con los atributos pedidos por consola
        cuenta1.setNombre(nombre);
        cuenta1.setNúmero(numero);
        cuenta1.setTipo(tipo);
        cuenta1.setSaldo(importe);

        // Se crea el objeto cuenta2 con los valores leidos por teclado
        // Se ejecuta el constructor con parámetros
        Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        // Se crea cuenta3 como copia de cuenta1
        // Se ejecuta el constructor copia
        Cuenta cuenta3 = new Cuenta(cuenta1);
        // Mostrar los datos de cuenta1
        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNúmero());
        System.out.println("Tipo de interés: " + cuenta1.getTipo());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        // Se realiza un ingreso en cuenta1
        cuenta1.ingreso(4000);
        // Mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " + cuenta1.getSaldo());
        // Mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNúmero());
        System.out.println("Tipo de interés: " + cuenta2.getTipo());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        // Mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Número de cuenta: " + cuenta3.getNúmero());
        System.out.println("Tipo de interés: " + cuenta3.getTipo());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
        // Realizar una transferencia de 10€ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        // Mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        // Mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        // Probar reintegro
        System.out.println(cuenta1.reintegro(233));
    }
}
