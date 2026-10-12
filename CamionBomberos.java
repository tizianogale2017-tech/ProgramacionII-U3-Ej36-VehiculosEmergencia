package Ejercicio36_vehiculosEmergencia;

public class CamionBomberos extends VehiculoEmergencia {
    private int capacidadAguaLitros;
    private double longitudEscalaMetros;

    public CamionBomberos(String patente, String estacionBase, int capacidadAguaLitros, double longitudEscalaMetros) {
        super(patente, estacionBase);
        this.capacidadAguaLitros = capacidadAguaLitros;
        this.longitudEscalaMetros = longitudEscalaMetros;
    }

    @Override
    public void activarAlerta() {
        System.out.println("  BOMBEROS " + getPatente() + ": sirena de incendio, tanque de " + capacidadAguaLitros + " L, escala de " + longitudEscalaMetros + " m.");
    }
}
