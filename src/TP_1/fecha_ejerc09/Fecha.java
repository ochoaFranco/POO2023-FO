package TP_1.fecha_ejerc09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	public LocalDate formatoFecha(String fecha, String tipo) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(tipo);
	    LocalDate nuevaFecha = LocalDate.parse(fecha, formato);
	    return nuevaFecha;
	}

	public boolean entreFechas(LocalDate f1, LocalDate f2, LocalDate f3) {
        return f1.isAfter(f2) && f1.isBefore(f3);
    }

	public boolean mayor(LocalDate f1, LocalDate f2) {
	    return f1.isAfter(f2);
	}

	public boolean menor(LocalDate f1, LocalDate f2) {
	    return f1.isBefore(f2);
	}
}
