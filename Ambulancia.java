package Ejercicio36_vehiculosEmergencia;

public class Ambulancia extends VehiculoEmergencia {
    private int stockOxigeno;
    private int medicosABordo;

    public Ambulancia(String patente, String estacionBase, int stockOxigeno, int medicosABordo) {
        super(patente, estacionBase);
        this.stockOxigeno = stockOxigeno;
        this.medicosABordo = medicosABordo;
    }

    @Override
    public void activarAlerta() {
        System.out.println("  AMBULANCIA " + getPatente() + ": sirena médica activada, " + medicosABordo + " médico(s) a bordo, oxígeno: " + stockOxigeno + " L.");
    }
}
