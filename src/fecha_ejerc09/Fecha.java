import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
	public LocalDate formatoFecha(String fecha, String tipo) {
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern(tipo);
	    LocalDate fecha = LocalDate.parse(fecha, formato);
	    return fecha;
	}
	
	public boolean entreFechas(LocalDate f1, LocalDate f2, LocalDate f3) {
	    if (f1.isAfter(f2) && f1.isBefore(f3))
	        return true;
	    return false;
	}
	
	public boolean mayor(LocalDate f1, LocalDate f2) {
	    return f1.isAfter(f2);	
	}
	
	
	public boolean menor(LocalDate f1, LocalDate f2) {
	    return f1.isBefore(f2);	
	}
}
