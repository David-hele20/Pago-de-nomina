public class Repartidor extends Empleado {
    private static final double VALOR_REPARTO = 10000;
    private int numeroRepartos;
    private char zona;

    public Repartidor(String id, String nom, int ed, int ano, double sal, int repartos, char zona) {
        super(id, nom, ed, ano, sal);
        this.numeroRepartos = repartos;
        this.zona = asignarZona(zona);
    }

    private char asignarZona(char zona) {
        zona = Character.toUpperCase(zona);
        if (zona == 'A' || zona == 'B' || zona == 'C' || zona == 'D') {
            return zona;
        }
        return 'C';
    }

    @Override
    public double calcularPagoMensual() {
        double totalRepartos = numeroRepartos * VALOR_REPARTO;
        double subtotal = salarioBasico + totalRepartos + calcularBonificacion();
        return subtotal - (subtotal * 0.10);
    }

    public double calcularBonificacion() {
        if ((2026 - anoIngreso) == 5 && zona == 'C') {
            return 50000;
        }
        return 0;
    }

    @Override
    public String toString() {
        double pagoRepartos = numeroRepartos * VALOR_REPARTO;
        double neto = calcularPagoMensual();
        double descuentos = (salarioBasico + pagoRepartos + calcularBonificacion()) * 0.10;
        return "Repartidor, " + super.toString() + ", " + numeroRepartos + ", " + pagoRepartos + ", " + descuentos + ", " + neto;
    }
}