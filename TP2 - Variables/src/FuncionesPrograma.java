import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FuncionesPrograma {
    public static String getFechaString (Date fecha){
        //Punto 17
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(fecha);
    }

    public static Date getFechaDate (int dia, int mes, int anno) {
        //Punto 18
        Calendar calen = Calendar.getInstance();
        calen.set(anno, mes - 1, dia);
        return calen.getTime();
    }
}
