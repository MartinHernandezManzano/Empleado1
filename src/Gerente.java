public class Gerente extends Empleado {
    //añadimos el atributo bono
    private double bono;

    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Gerente:" +
                "\nnombre='" + nombre + '\'' +
                ", bono = " + bono + '\'' +
                ", salario=" + (salario + bono) +
                ", departamento='" + departamento + '\'' +
                '.';
    }
}
