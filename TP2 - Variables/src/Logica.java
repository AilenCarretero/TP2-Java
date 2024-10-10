import java.util.Scanner;

public class Logica {
    public static boolean regresarMenu() {
        //Creamos un método para invocar la salida al menú principal.
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine();
        System.out.println("");
        Main.delay();
        return rta.equalsIgnoreCase("si");
    }

    public static void opcion1() {
        //Punto 1 y 5
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso de un número decimal.
            System.out.println("Ingrese un número decimal:");
            float valorDecimal = sc.nextFloat();

            //Convertimos el decimal a otras variables.
            int valorEntero = (int) valorDecimal;
            short valorShort = (short) valorDecimal;
            long valorLong = (long) valorDecimal;
            String valorString = String.valueOf(valorDecimal);

            //Imprimimos los valores convertidos para enseñarselo al usuario.
            System.out.println(" ==== CONVERSIÓN ==== ");
            System.out.println("");
            System.out.println("Valor decimal:    " + valorDecimal);
            System.out.println("Valor entero:     " + valorEntero);
            System.out.println("Valor short:      " + valorShort);
            System.out.println("Valor long:       " + valorLong);
            System.out.println("Valor string:     " + valorString);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion2() {
        //Punto 3
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos el ingreso de un número de tres cifras.
            System.out.println("Ingrese un número entre 100 y 999: ");
            int num = sc.nextInt();
            int mod = 0;
            int suma = 0;

            //Separamos las variables en unidades y las sumanmos.
            while (num != 0) {
                mod = num % 10;
                num = num / 10;
                suma = mod + suma;
            }

            //Imprimimos la suma de los dígitos.
            System.out.println("La suma de todos los dígitos del número ingresado es: " + suma);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion3() {
        //Punto 23
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos un número al usuario.
            System.out.println("Ingrese un número: ");
            int num = sc.nextInt();

            //Invocamos el método encargado de la recursividad.
            num = complementoOpcion4(num);
            System.out.println(num);

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }
    public static int complementoOpcion4(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + complementoOpcion4(n / 10);
        }
    }

    public static void opcion4() {
        //Punto 4
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, b2 = 0, b1 = 0, m50 = 0, m25 = 0, m10 = 0, m5 = 0;
            //Solicitamos al usuario que ingrese un valor.
            System.out.println("Ingrese el importe: ");
            double valor = sc.nextFloat();

            if (valor < 0) {
                System.out.println("Valor no válido.");
            } else {
                while (valor >= 200) {
                    valor = valor - 200;
                    b200 = b200 + 1;
                };

                while (valor >= 100) {
                    valor = valor - 100;
                    b100 = b100 + 1;
                };

                while (valor >= 50) {
                    valor = valor - 50;
                    b50 = b50 + 1;
                }

                while (valor >= 20) {
                    valor = valor - 20;
                    b20 = b20 + 1;
                }

                while (valor >= 10) {
                    valor = valor - 10;
                    b10 = b10 + 1;
                }

                while (valor >= 5) {
                    valor = valor - 5;
                    b5 = b5 + 1;
                }

                while (valor >= 2) {
                    valor = valor - 2;
                    b2 = b2 + 1;
                }

                while (valor >= 1) {
                    valor = valor - 1;
                    b1 = b1 + 1;
                }

                while (valor >= 0.5) {
                    valor = valor - 0.5;
                    m50 = m50 + 1;
                }

                while (valor >= 0.25) {
                    valor = valor - 0.25;
                    m25 = m25 + 1;
                }

                while (valor >= 0.10) {
                    valor = valor - 0.10;
                    m10 = m10 + 1;
                }

                while (valor >= 0.05) {
                    valor = valor - 0.05;
                    m5 = m5 + 1;
                }
            }

            //Imprimimos los valores.
            System.out.println(" ==== CAJA REGISTRADORA ==== ");
            System.out.println("");
            System.out.println("Billetes de $200:   " + b200);
            System.out.println("Billetes de $100:   " + b100);
            System.out.println("Billetes de $50:    " + b50);
            System.out.println("Billetes de $20:    " + b20);
            System.out.println("Billetes de $10:    " + b10);
            System.out.println("Billetes de $5:     " + b5);
            System.out.println("Billetes de $2:     " + b2);
            System.out.println("Billetes de $1:     " + b1);
            System.out.println("");
            System.out.println("Monedas de $0.50:   " + m50);
            System.out.println("Monedas de $0.25:   " + m25);
            System.out.println("Monedas de $0.10:   " + m10);
            System.out.println("Monedas de $0.05:   " + m5);

            //Invocamos al métodos de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion5() {
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        //Interrogamos al usuario si desea ingresar una frase.
        System.out.println("Ingrese una frase, o escribe 'default' para dejar la predeterminada: ");
        String frase = sc.nextLine();

        while (!esc) {
            //Asignamos la frase por defecto en caso de que el usuario así lo desee.
            if (frase.equalsIgnoreCase("default")) {
                frase = "La lluvia es escasa en Mendoza";
            }

            //Creamos un pequeño menú con opciones para modificar la frase.
            System.out.println("" +
                    "\n === Experimentos con Strings === " +
                    "\n" +
                    "\n'" + frase + "'" +
                    "\n" +
                    "\n¿Qué desea hacer?" +
                    "\n" +
                    "\n1.   Contar carácteres." +
                    "\n2.   Contar vocales." +
                    "\n3.   Cambiar 'A' por 'E'." +
                    "\n4.   Traducir frase a ASCII." +
                    "\n5.   Convertir a mayúscula o minúscula." +
                    "\n6.   Extraer la 4ta y 5ta letra." +
                    "\n7.   Invertir la cadena." +
                    "\n" +
                    "\n0.   Salir." +
                    "\n");

            int select = sc.nextInt();
            System.out.println("");

            switch (select) {
                case 0:
                    Main.menu();
                    break;
                case 1:
                    opcion5char1(frase);
                    break;
                case 2:
                    opcion5char2(frase);
                    break;
                case 3:
                    opcion5char3(frase);
                    break;
                case 4:
                    opcion5char4(frase);
                    break;
                case 5:
                    opcion5char5(frase);
                    break;
                case 6:
                    opcion5char6(frase);
                    break;
                case 7:
                    String fraseEspejo = opcion5char7(frase);
                    System.out.println(fraseEspejo);
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        }

    }
    public static void opcion5char1(String frase) {
        //Punto 6

        //Contamos la cantidad de carácteres.
        int cantChars = frase.length();

        //Imprimimos el resultado.
        System.out.println("La frase tiene " + cantChars + " carácteres.");
    }
    public static void opcion5char2(String frase) {
        //Punto 7
        frase = frase.toLowerCase();
        int cantChars = frase.length();
        int cantVocal = 0;

        //Recorremos la frase carácter por carácter.
        for (int i = 0; i < cantChars; i++) {
            char vocal = frase.charAt(i);

            //Contabilizamos por todas las vocales que hayan.
            if (vocal == 'a' || vocal == 'e' || vocal == 'i'|| vocal == 'o' || vocal == 'u') {
                cantVocal = cantVocal + 1;
            }
        }

        //Imprimimos el resultado final.
        System.out.println("La frase tiene " + cantVocal + " vocales.");
        System.out.println("");
    }
    public static void opcion5char3(String frase) {
        //Punto 8

        //Reemplazamos todas las letras "A" de la frase por la "E".
        String fraseConE = frase.replace("a", "e");
        frase = frase.replace("A", "E");

        //Imprimimos el mensaje.
        System.out.println(fraseConE);
    }
    public static void opcion5char4(String frase) {
        //Punto 9
        int cantChars = frase.length();
        StringBuilder fraseAscii = new StringBuilder();

        for (int i = 0; i < cantChars; i++) {
            //Repasamos por todos los carácteres de la frase.
            char carac = frase.charAt(i);

            //Reemplazamos cada carácter por su código ASCII.
            int codigoAscii = (int) carac;
            fraseAscii.append(codigoAscii).append(" ");
        }

        //Imprimimos el mensaje.
        System.out.println(fraseAscii);
    }
    public static void opcion5char5(String frase) {
        //Punto 10
        Scanner sc = new Scanner(System.in);

        //Generamos un menú para que el usuario elija la opción deseada.
        System.out.println("¿En qué desea convertir la frase?" +
                "\n" +
                "\n1.   Minúsculas" +
                "\n2.   Mayúsculas");
        int select = sc.nextInt();


        //En base a la opción elegida la frase será reescrita todo en mayúsculas o todo en minúsculas.
        switch (select) {
            case 1:
                frase = frase.toLowerCase();
                System.out.println(frase);
                break;
            case 2:
                frase = frase.toUpperCase();
                System.out.println(frase);
                break;
            default:
                System.out.println("Opción no valida.");
        }
    }
    public static void opcion5char6(String frase) {
        //Punto 12
        String letras = frase.substring(4,6);
        System.out.println(letras);
    }
    public static String opcion5char7(String frase) {
        //Punto 23

        //Comprobamos que exista una frase.
        if (frase.isEmpty()) {
            return frase;
        }

        //Obtenemos el primer carácter y lo ponemos al final
        return opcion5char7(frase.substring(1)) + frase.charAt(0);
    }

    public static void opcion6() {
        //Punto 11
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario que ingrese las palabras.
            System.out.println("Ingrese la primera palabra: ");
            String pala1 = sc.nextLine();

            System.out.println("Ingrese la segunda palabra: ");
            String pala2 = sc.nextLine();

            //Comparamos que ambas palabras sean iguales.
            if (pala1.equalsIgnoreCase(pala2)) {
                if (pala1.equals(pala2)) {
                    System.out.println("Las palabras son iguales");
                } else {
                    System.out.println("Las palabras son similares, algunas de las palabras posee mayúsculas.");
                }
            } else {
                System.out.println("Las palabras no son iguales");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion7() {
        //Punto 13
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario que ingrese los strings.
            System.out.println("Ingrese una frase: ");
            String frase1 = sc.nextLine();

            System.out.println("Ingrese una palabra: ");
            String frase2 = sc.nextLine();

            //Comprobamos si un string está dentro de otro.
            if (frase1.contains(frase2)) {
                System.out.println("La palabra se encuentra dentro de la frase.");
            } else {
                System.out.println("La palabra no se encuentra dentro de la frase.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion12() {
        //Punto 23
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Le solicitamos al usuario el ingreso de un número entero.
            System.out.println("Ingrese un número entero: ");
            int num = sc.nextInt();

            System.out.println("");

            //Invocamos el método de la suma recursiva.
            int total = sumaRecursiva12(num);
            System.out.println("La suma de todos los números entre 1 y " + num + " es: " + total);

            System.out.println("");

            //Invocamos el método de salida.
            esc = regresarMenu();

        }
    }
    public static int sumaRecursiva12(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num + sumaRecursiva12(num - 1);
        }
    }
}