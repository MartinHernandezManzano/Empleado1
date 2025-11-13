public class Desarrollador extends Empleado{
    private String lenguajeDeProgramacion;

    //constructor de la subclase
    public Desarrollador(String nombre, double salario, String departamento, String lenguajeDeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

        //getters y setters
    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

        //sobreescritura del methos para añadir el nuevo atributo
    @Override
    public String toString() {
        return "Desarrollador:" +
                "\nlenguajeDeProgramacion='" + lenguajeDeProgramacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '.';
    }
}
