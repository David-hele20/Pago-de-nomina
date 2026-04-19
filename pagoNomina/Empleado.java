public abstract class Empleado {
    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected int anoIngreso;
    protected double salarioBasico;

    public Empleado(String identificacion, String nombre, int edad, int anoIngreso, double salarioBasico) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.anoIngreso = anoIngreso;
        this.salarioBasico = salarioBasico;
    }

    public abstract double calcularPagoMensual();

    @Override
    public String toString() {
        return identificacion + ", " + nombre + ", " + anoIngreso + ", " + salarioBasico;
    }
}