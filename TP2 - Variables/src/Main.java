import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void delay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        //Generamos un menú principal.
        while(!exit) {
            System.out.println(" ====== Menú Principal ====== " +
                    "\n" +
                    "\n1.   Casteando variables." +
                    "\n2.   Sumando dígitos v1.0." +
                    "\n3.   Sumando dígitos v2.0." +
                    "\n4.   Simulador de cajera." +
                    "\n5.   Modificando una frase." +
                    "\n6.   Palabras idénticas." +
                    "\n7.   Frases Inception." +
                    "\n8.   ¿Qué día es hoy?" +
                    "\n9.   Formato de fecha." +
                    "\n10.  Calculadora básica de n° naturales." +
                    "\n11.  Calculadora básica de fracciones." +
                    "\n12.  Sumando todos los números del 1 al... " +
                    "\n" +
                    "\n0.   Salir");

            int opcion = sc.nextInt();
            System.out.println("");

            switch(opcion) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Logica.opcion1();
                    break;
                case 2:
                    Logica.opcion2();
                    break;
                case 3:
                    Logica.opcion3();
                    break;
                case 4:
                    Logica.opcion4();
                    break;
                case 5:
                    Logica.opcion5();
                    break;
                case 6:
                    Logica.opcion6();
                    break;
                case 7:
                    Logica.opcion7();
                    break;
                case 8:
                    Date fecha = new Date();
                    String fechaString = FuncionesPrograma.getFechaString(fecha);
                    System.out.println(fechaString);
                    break;
                case 9:
                    //Le solicitamos al usuario que ingrese la fecha.
                    System.out.println("Ingrese una fecha, ingresando el día, el mes y por último el año.");
                    int dia = sc.nextInt();
                    int mes = sc.nextInt();
                    int anno = sc.nextInt();

                    System.out.println("");
                    fecha = FuncionesPrograma.getFechaDate(dia, mes, anno);
                    System.out.println(fecha);
                    break;
                case 10:
                    Calculo.main();
                    break;
                case 11:
                    OperacionFraccion.main();
                    break;
                case 12:
                    Logica.opcion12();
                    break;
                default:
                    System.out.println("El número ingresado no es válido, intente nuevamente.");
            }
        }
    }
}