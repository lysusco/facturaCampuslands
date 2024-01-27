package com.facturacampus.utils;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formato {
    private Formato(){

    }

    public static String formatoFechaHora(LocalDateTime localDataTime){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return localDataTime.format(formato);
    }

    public static String formatoMonedaPesos(double monto){
        Locale colombiaLocal = new Locale("es", "CO");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(colombiaLocal);
        return formatoMoneda.format(monto);
    }
}
