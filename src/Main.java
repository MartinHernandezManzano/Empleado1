public class Main {
    public static void main(String[] args) {

        //creación de instancias de Gerente y desarrollador
        Empleado gerente = new Gerente("Luffy", 150.40, "Capitán", 130);
        System.out.println(gerente.toString());

        Empleado desarrollador = new Desarrollador("Usopp", 124, "I+D", "Python");
        System.out.println(desarrollador.toString());
    }
}
