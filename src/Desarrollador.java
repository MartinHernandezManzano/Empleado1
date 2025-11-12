public class Desarrollador extends Empleado{
    private String lenguajeDeProgramacion;

    public Desarrollador(String nombre, double salario, String departamento, String lenguajeDeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguajeDeProgramacion='" + lenguajeDeProgramacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
