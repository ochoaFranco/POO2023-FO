package TP_1.fecha_ejerc09;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fecha miFecha1 = new Fecha();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la fecha 1 (dd-MM-yyyy o MM-dd-yyyy) : ");
        String f1 = sc.nextLine();
        System.out.print("Ingrese el formato de la fecha 1 (dd-MM-yyyy o MM-dd-yyyy): ");
        String f1Formato = sc.nextLine();
        System.out.print("Ingrese la fecha 2 (dd-MM-yyyy o MM-dd-yyyy) : ");
        String f2 = sc.nextLine();
        System.out.print("Ingrese el formato de la fecha 2 (dd-MM-yyyy o MM-dd-yyyy): ");
        String f2Formato = sc.nextLine();
        LocalDate fechaConFormato1 = miFecha1.formatoFecha(f1, f1Formato);
        LocalDate fechaConFormato2 = miFecha1.formatoFecha(f2, f2Formato);
        System.out.println("Fecha con formato 1: " + fechaConFormato1);
        System.out.println("Fecha con formato 2: " + fechaConFormato2);
        System.out.print("Ingrese la 3er fecha para ves si se encuentra entre las otrdas dos ingresadas (dd-MM-yyyy o MM-dd-yyyy) : ");
        String f3 = sc.nextLine();
        System.out.print("Ingrese el formato de la fecha 3 (dd-MM-yyyy o MM-dd-yyyy): ");
        String f3Formato = sc.nextLine();
        LocalDate fechaConFormato3 = miFecha1.formatoFecha(f3, f3Formato);
        if (miFecha1.entreFechas(fechaConFormato3, fechaConFormato1, fechaConFormato2))
            System.out.println("La fecha" + fechaConFormato3 + " SE encuentra entre: " + fechaConFormato1 + " y" + fechaConFormato2);
        else
            System.out.println("La fecha " + fechaConFormato3 + " NO se encuentra entre: " + fechaConFormato1 + " y " + fechaConFormato2);

        if (miFecha1.mayor(fechaConFormato1, fechaConFormato2)) {
            System.out.println("La fecha " + fechaConFormato1 + " es mayor que: " + fechaConFormato2);
        } else {
            System.out.println("La fecha " + fechaConFormato1 + " NO es mayor que: " + fechaConFormato2);
        }

        if (miFecha1.menor(fechaConFormato1, fechaConFormato2)) {
            System.out.println("La fecha " + fechaConFormato1 + " es menor que: " + fechaConFormato2);
        } else {
            System.out.println("La fecha " + fechaConFormato1 + " NO es menor que: " + fechaConFormato2);
        }
    }

}
