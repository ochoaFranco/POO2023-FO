package tp_2.ejerc_6.Main;

import tp_2.ejerc_6.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "abc133");
        Cliente cliente2 = new Cliente("Sofia ", "abc153");
        Cliente cliente3 = new Cliente("Lucas", "abc153");
        Cliente cliente4 = new Cliente("Valentina", "dbc123");
        Cliente cliente5 = new Cliente("Alejandro", "gbc123");
        Cliente cliente6 = new Cliente("Camila", "asc123");
        Cliente cliente7 = new Cliente("Francisco", "dfc123");
        Cliente cliente8 = new Cliente("Lucia", "abs123");
        Cliente cliente9 = new Cliente("Mateo", "acf123");
        Cliente cliente10 = new Cliente("Renata", "azc123");
        Cliente cliente11 = new Cliente("Damian", "abf123");

        // CREANDO COMBUSTIBLES Y EXPENDEDORES.
        Combustible gasoil = new Combustible("gasoil", 50);
        Expendedor expendedorGasoil = new Expendedor(gasoil, 300);
        Combustible nafta = new Combustible("nafta", 203);
        Expendedor expendedorNafta = new Expendedor(nafta, 300);
        Combustible kerosene = new Combustible("kerosene", 150);
        Expendedor expendedorKerosene = new Expendedor(kerosene, 300);

        // CREANDO PLAYEROS.
        Playero playero1 = new Playero("Jose", "dominguez");
        Playero playero2 = new Playero("Tomas", "messi");
        InformeVentas.agregarPlayeros(playero1);
        InformeVentas.agregarPlayeros(playero2);

        // REALIZANDO VENTAS.
        playero1.atenderCliente(cliente1, 100, expendedorNafta);
        playero1.atenderCliente(cliente2, 100, expendedorNafta);
        playero1.atenderCliente(cliente3, 150, expendedorNafta);
        playero1.atenderCliente(cliente4, 120, expendedorNafta);
        playero1.atenderCliente(cliente5, 140, expendedorNafta);
        playero1.atenderCliente(cliente6, 30, expendedorNafta);
        playero2.atenderCliente(cliente7, 14, expendedorNafta);
        playero2.atenderCliente(cliente7, 454, expendedorGasoil);
        playero2.atenderCliente(cliente7, 450, expendedorKerosene);
        playero2.atenderCliente(cliente7, 450, expendedorKerosene);
        playero2.atenderCliente(cliente8, 450, expendedorKerosene);
        playero1.atenderCliente(cliente8, 10, expendedorNafta);
        playero1.atenderCliente(cliente8, 14, expendedorNafta);
        playero1.atenderCliente(cliente8, 105, expendedorNafta);
        playero1.atenderCliente(cliente9, 102, expendedorNafta);
        playero1.atenderCliente(cliente10, 100, expendedorNafta);
        InformeVentas.expendedoresPorLitrosExpendidos();
        InformeVentas.empleadosPorMontoTotalDeVentas();
        InformeVentas.clienteSegunMontoTotal();
        InformeVentas.surtidoresPorMontoTotalVenta();

    }
}
