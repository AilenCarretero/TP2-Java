import java.util.Scanner;

public class OperacionFraccion {
    //Punto 20

    public static void main() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el ingreso de los valores para la primera fracción.
            System.out.println("Ingrese el numerador de la primera fracción:");
            int nume1 = sc.nextInt();
            System.out.println("Ingrese el denominador de la primera fracción:");
            int deno1 = sc.nextInt();

            System.out.println("");

            //Le solicitamos al usuario el ingreso de los valores para la segunda fracción.
            System.out.println("Ingrese el numerador de la segunda fracción:");
            int nume2 = sc.nextInt();
            System.out.println("Ingrese el denominador de la segunda fracción:");
            int deno2 = sc.nextInt();

            System.out.println("");

            //Creamos las fracciones.
            Fraccion fraccion1 = new Fraccion(nume1, deno1);
            Fraccion fraccion2 = new Fraccion(nume2, deno2);

            // Realizar las operaciones
            Fraccion resultadoSuma = fraccion1.sumarFracciones(fraccion1, fraccion2);
            Fraccion resultadoResta = fraccion1.restarFracciones(fraccion1, fraccion2);
            Fraccion resultadoMultiplicacion = fraccion1.multiplicarFracciones(fraccion1, fraccion2);
            Fraccion resultadoDivision = fraccion1.dividirFracciones(fraccion1, fraccion2);

            // Mostrar los resultados
            System.out.println("Resultado de la suma:               " + resultadoSuma);
            System.out.println("Resultado de la resta:              " + resultadoResta);
            System.out.println("Resultado de la multiplicación:     " + resultadoMultiplicacion);
            System.out.println("Resultado de la división:           " + resultadoDivision);

            //Invocamos el método de salida.
            esc = Logica.regresarMenu();
        }
    }
}
