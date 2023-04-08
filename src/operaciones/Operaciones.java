package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;
        double primervalor, segundovalor;
        String usuario;
        int op;
        OperacionesBasicas ob = new OperacionesBasicas();

        do {
            System.out.println("Ingrese el primer valor: ");
            primervalor = Double.parseDouble(entrada.nextLine());//me pasa los caracteres a double
            System.out.println("Ingrese el segundo valor: ");
            segundovalor = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el usuario");
            usuario = entrada.nextLine();
            System.out.println("");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            //validar la opcion ingresada
            do {
                System.out.println("Elija la opcion");
                op = entrada.nextInt();
            } while (op < 1 || op > 4);
            ob.IngreseDatos(usuario, primervalor, segundovalor);
            //realizar las operaciones
            switch (op) {
                case 1:
                    ob.Sumar();
                    break;

                case 2:
                    ob.Restar();
                    break;

                case 3:
                    ob.Multiplicar();
                    break;

                case 4:
                    ob.Dividir();
                    break;
            }
            //presentar resultado
            System.out.println("");
            System.out.println("El resultado de la " + ob.getOperacion() + " es: "
                    + "" + ob.getResultado());

            do {
                System.out.println("");
                System.out.println("Desea realizar otra operacion? (SI/NO)");
                continuar = entrada.nextLine().toUpperCase();
            } while (!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO"));

        } while (continuar.equalsIgnoreCase("SI"));

        System.out.println("Fin del programa...");

    }

}
