public class Gerente extends Empleado{
    private double bono;

    //Constructor
    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
        salario=salario + bono;
    }
}
