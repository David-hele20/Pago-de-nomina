public class Vendedor extends Empleado {
    private static final double PORCENTAJE_COMISION = 0.15;
    private double ventasRealizadas;

    public Vendedor(String id, String nom, int ed, int ano, double sal, double ventas) {
        super(id, nom, ed, ano, sal);
        this.ventasRealizadas = ventas;
    }

    @Override
    public double calcularPagoMensual() {
        double comision = ventasRealizadas * PORCENTAJE_COMISION;
        double subtotal = salarioBasico + comision + calcularBonificacion();
        return subtotal - (subtotal * 0.10);
    }

    public double calcularBonificacion() {
        if ((2026 - anoIngreso) > 20) {
            return 100000;
        }
        return 0;
    }

    @Override
    public String toString() {
        double comision = ventasRealizadas * PORCENTAJE_COMISION;
        double neto = calcularPagoMensual();
        double descuentos = (salarioBasico + comision + calcularBonificacion()) * 0.10;
        return "Vendedor, " + super.toString() + ", " + comision + ", " + descuentos + ", " + neto;
    }
}