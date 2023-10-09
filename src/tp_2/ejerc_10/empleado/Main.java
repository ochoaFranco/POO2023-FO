package tp_2.ejerc_10.empleado;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple = LocalDate.now();
        EmpAsalariado emp1 = new EmpAsalariado("John", "Karten", "123123", "123123", 405.2f, 200, cumple);
        emp1.calcularSueldo();
        System.out.println("Sueldo asalariado: "  + emp1.getSueldo());
        //----------------------------------------------------------------------------------------------------------------
        EmpComision emp2 = new EmpComision("Pepe", "jose", "123123", "434234", 405.2f, 10, 4, cumple);
        emp2.realizarVenta(200);
        emp2.realizarVenta(200);
        emp2.calcularSueldo();
        System.out.println("Sueldo por comision: "  + emp2.getSueldo());
        //----------------------------------------------------------------------------------------------------------------
        EmpComSalarioBase emp3 = new EmpComSalarioBase("Pepe2", "jose2", "312312", "123123", 405.2f, 400, 10, 4, cumple);
        emp3.realizarVenta(200);
        emp3.realizarVenta(200);
        emp3.calcularSueldo();
        System.out.println("Sueldo por comision con salario base: "  + emp3.getSueldo());
        //----------------------------------------------------------------------------------------------------------------
        EmpPorHora emp4 = new EmpPorHora("Pepe3", "jose3", "23123", "123123", 405.2f, 40, 200, cumple);
        emp4.calcularSueldo();
        System.out.println("Sueldo de emp por hora: "  + emp4.getSueldo());
        //----------------------------------------------------------------------------------------------------------------
        Pasante emp5 = new Pasante("pep4", "jose4", "123123", "123123",405.2f, cumple);
        emp5.calcularSueldo();
        System.out.println("Sueldo de pasantes: "  + emp5.getSueldo());
    }
}
