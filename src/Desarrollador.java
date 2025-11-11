public class Desarrollador extends Empleado{
    private String lenguajeDeProgramacion;

    public Desarrollador(String nombre, double salario, String departamento, String lenguajeDeProgramacion) {
        super(nombre, salario, departamento);
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }



}
