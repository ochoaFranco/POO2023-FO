package tp_2.Ejerc2;

public class Proveedor {
    private enum MedioTransporte {
        CompaniaAreas,
        Marítimas,
        Terrestres
    }
    private enum Tipo_Hospedajes {
        cadenas_hoteles,
        hosterias,
        bungalos
    }
    private String nombre;
    private MedioTransporte transporte;
    private Tipo_Hospedajes hospedaje;

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public void setProveedorTransporte(String tipoTransporte) {
        tipoTransporte = tipoTransporte.toLowerCase();
        switch (tipoTransporte) {
            case "companiasareas":
                this.transporte = MedioTransporte.CompaniaAreas;
                break;
            case "maritimas":
                this.transporte = MedioTransporte.Marítimas;
                break;
            case "terrestres":
                this.transporte = MedioTransporte.Terrestres;
                break;
        }
    }

    public void setProveedorHospedaje(String tipoHospedaje) {
        tipoHospedaje = tipoHospedaje.toLowerCase();
        switch (tipoHospedaje) {
            case "cadenashoteles":
                this.hospedaje = Tipo_Hospedajes.cadenas_hoteles;
                break;
            case "hosterias":
                this.hospedaje = Tipo_Hospedajes.hosterias;
                break;
            case "bugalos":
                this.hospedaje = Tipo_Hospedajes.bungalos;
                break;
        }
    }

    public String getProveedor() {
        if (transporte != null) {
            switch (transporte) {
                case CompaniaAreas:
                    return "Compania Areas" + " " + nombre;
                case Terrestres:
                    return "Terrestres" + " " + nombre;
                case Marítimas:
                    return "Maritimas" + " " + nombre;
            }
        } if (hospedaje != null) {
            switch (hospedaje) {
                case bungalos:
                    return "Bungalo" + " " + nombre;
                case cadenas_hoteles:
                    return "Cadenas de hoteles" + " " + nombre;
                case hosterias:
                    return "Hosterias" + " " + nombre;
            }
        }
        return null;
    }

}
