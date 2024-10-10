public class Fraccion {
    //Punto 20

    //Creamos los atributos de la clase.
    private int nume;
    private int deno;

    //Agregamos un constructor sobrecargado.
    public Fraccion(int nume, int deno) {
        this.nume = nume;
        // Evitar división por cero
        if (deno == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero");
        }
        this.deno = deno;
    }

    //Generamos los métodos para las diferentes operaciones con las fracciones.
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.nume * f2.deno + f2.nume * f1.deno;
        int nuevoDenominador = f1.deno * f2.deno;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.nume * f2.deno - f2.nume * f1.deno;
        int nuevoDenominador = f1.deno * f2.deno;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
        int nuevoNumerador = f1.nume * f2.nume;
        int nuevoDenominador = f1.deno * f2.deno;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
        if (f2.nume == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int nuevoNumerador = f1.nume * f2.deno;
        int nuevoDenominador = f1.deno * f2.nume;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    //Método para mostrar el resultado en formato "fracción".
    public String toString() {
        return nume + "/" + deno;
    }
}
