package tp_2.ejerc_8;

public class Publicacion {
    private String nombre;
    private String editor;
    private String telContacto;
    private int cantPaginas;
    private final int ANIOPUBLICACION;

    public Publicacion(String nombre, String editor, String telContacto, int cantPaginas, int ANIOPUBLICACION) {
        this.nombre = nombre;
        this.editor = editor;
        this.telContacto = telContacto;
        this.cantPaginas = cantPaginas;
        this.ANIOPUBLICACION = ANIOPUBLICACION;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getANIOPUBLICACION() {
        return ANIOPUBLICACION;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
