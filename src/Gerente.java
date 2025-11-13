public class Gerente extends Empleado {
    //añadimos el atributo bono
    private double bono;

    //constructor del gerente
    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre, salario, departamento);
        this.bono = bono;
    }

    //sobreescribimos el method para añadir el nuevo atributo
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
