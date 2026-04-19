import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado nuevoEmpleado) {
        listaEmpleados.add(nuevoEmpleado);
    }

    public void liquidarNomina() {
        for (Empleado e : listaEmpleados) {
            System.out.println(nuevoEmpleado.toString());
        }
    }

    public void run() {
        agregarEmpleado(new Vendedor("V01", "David", 19, 2005, 1200000, 5000000));
        agregarEmpleado(new Vendedor("V02", "Ana", 45, 1990, 1200000, 3000000));
        agregarEmpleado(new Vendedor("V03", "Luis", 30, 2015, 1200000, 4000000));

        agregarEmpleado(new Repartidor("R01", "Carlos", 25, 2021, 900000, 50, 'C'));
        agregarEmpleado(new Repartidor("R02", "Marta", 28, 2020, 900000, 40, 'A'));
        agregarEmpleado(new Repartidor("R03", "Jose", 22, 2022, 900000, 60, 'X'));

        liquidarNomina();
    }

    public static void main(String[] args) {
        new Empresa().run();
    }
}