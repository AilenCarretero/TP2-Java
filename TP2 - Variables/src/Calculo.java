import java.util.Scanner;

public class Calculo {
    public static void main() {
        //Punto 19

        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Instanciamos la clase OperacionMatematica.
            OperacionMatematica operacionMatematica = new OperacionMatematica();

            //Le solicitamos al usuario el ingreso de los números.
            System.out.println("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            operacionMatematica.setValor1(num1);

            System.out.println("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            operacionMatematica.setValor2(num2);

            System.out.println("");

            //Invocamos las operaciones y retornamos los resultados.
            double resultadoSuma = operacionMatematica.aplicarOperacion("+");
            System.out.println("Suma:               " + resultadoSuma);

            double resultadoResta = operacionMatematica.aplicarOperacion("-");
            System.out.println("Resta:              " + resultadoResta);

            double resultadoMultiplicacion = operacionMatematica.aplicarOperacion("*");
            System.out.println("Multiplicación:     " + resultadoMultiplicacion);

            double resultadoDivision = operacionMatematica.aplicarOperacion("/");
            System.out.println("División:           " + resultadoDivision);

            //Invocamos el método de salida.
            esc = Logica.regresarMenu();

        }

    }
}
